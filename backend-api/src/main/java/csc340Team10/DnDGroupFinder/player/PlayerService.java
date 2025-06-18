package csc340Team10.DnDGroupFinder.player;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayerById(long playerID) {
        return playerRepository.findById(playerID).orElse(null);
    }

    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Long playerID, Player player) {
        // Optional: add check if playerID exists before saving
        return playerRepository.save(player);
    }

    public void deletePlayer(Long playerID) {
        playerRepository.deleteById(playerID);
    }

    public String writeJson(Player player) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("players.json"), player);
            return "Player written to JSON file successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error writing Player to JSON file";
        }
    }

    public Object readJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File("players.json"), Player.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // New method: Find player by exact username
    public Player findByUsername(String username) {
        return playerRepository.findByUsername(username);
    }

    // New method: Find players whose usernames contain keyword (case insensitive)
    public List<Player> findByUsernameContaining(String keyword) {
        return playerRepository.findByUsernameContainingIgnoreCase(keyword);
    }

    // New method: Update password for player by ID
    public boolean updatePassword(Long playerID, String newPassword) {
        Player player = playerRepository.findById(playerID).orElse(null);
        if (player == null) {
            return false;
        }
        player.setPassword(newPassword);
        playerRepository.save(player);
        return true;
    }

    public Player getPlayerByUsername(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPlayerByUsername'");
    }
}
