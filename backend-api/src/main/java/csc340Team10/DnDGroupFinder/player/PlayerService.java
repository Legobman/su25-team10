package csc340Team10.DnDGroupFinder.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayerById(Long playerID) {
        return playerRepository.findById(playerID).orElse(null);
    }

    public Player getPlayerByUsername(String username) {
        return playerRepository.findByUsername(username);
    }

    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Long playerID, Player player) {
        player.setPlayerID(playerID);
        return playerRepository.save(player);
    }

    public void deletePlayer(Long playerID) {
        playerRepository.deleteById(playerID);
    }
}
