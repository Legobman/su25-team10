package csc340Team10.DnDGroupFinder.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("/players")
    public Object getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/players/{id}")
    public Player getPlayerById(@PathVariable long id) {
        return playerService.getPlayerById(id);
    }

    @PostMapping("/players")
    public Object addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @PutMapping("/players/{id}")
    public Player updatePlayer(@PathVariable Long id, @RequestBody Player player) {
        playerService.updatePlayer(id, player);
        return playerService.getPlayerById(id);
    }

    @DeleteMapping("/players/{id}")
    public Object deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
        return playerService.getAllPlayers();
    }

    @PostMapping("/players/writeFile")
    public Object writeJson(@RequestBody Player player) {
        playerService.writeJson(player);
        return playerService.writeJson(player);
    }

    @GetMapping("/players/readFile")
    public Object readJson() {
        return playerService.readJson();
    }
}
