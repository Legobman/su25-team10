package csc340Team10.DnDGroupFinder.player;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Object getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayerById(@PathVariable long playerID) {
        return playerRepository.findById(playerID).orElse(null);
    }

    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Long playerID, Player player) {
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
}
