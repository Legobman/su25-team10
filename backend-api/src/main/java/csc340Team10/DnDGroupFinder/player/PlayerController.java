package csc340Team10.DnDGroupFinder.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/players")
    public Object getAllPlayers(Model model) {
        return "player-login";
    }

    @GetMapping("/players/{id}")
    public Object getPlayerById(@PathVariable long id, Model model) {
        model.addAttribute("player", playerService.getPlayerById(id));
        model.addAttribute("title", "Player #: " + id);
        return "player-homepage";
    }

    @GetMapping("/players/createForm")
    public Object showCreateForm(Model model) {
        Player player = new Player();
        model.addAttribute("player", player);
        model.addAttribute("title", "Create New Player");
        return "player-create";
    }

    @PostMapping("/players")
    public String addPlayer(Player player) {
        Player newPlayer = playerService.addPlayer(player);
        return "redirect:/players";
    }

    @PostMapping("/players/login")
    public Object getPlayerByUsername(@RequestParam String username, @RequestParam String password, Model model) {
        Player player = playerService.getPlayerByUsername(username);
        if (player != null && player.getPassword().equals(password)) {
            model.addAttribute("player", player);
            model.addAttribute("title", "Player #: " + player.getPlayerID());
            return "player-homepage";
        } else {
            return "redirect:/players";
        }
    }

    @GetMapping("/players/updateForm/{id}")
    public Object showUpdateForm(@PathVariable Long id, Model model) {
        Player player = playerService.getPlayerById(id);
        model.addAttribute("player", player);
        model.addAttribute("title", "Update Player: " + id);
        return "player-update";
    }

    @PostMapping("/players/update/{id}")
    public Object updatePlayer(@PathVariable Long id, Player player) {
        playerService.updatePlayer(id, player);
        return "redirect:/players/" + id;
    }

    @GetMapping("/players/delete/{id}")
    public Object deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
        return "redirect:/players";
    }

    @PostMapping("/players/writeFile")
    public Object writeJson(@RequestBody Player player) {
        return playerService.writeJson(player);
    }

    @GetMapping("/players/readFile")
    public Object readJson() {
        return playerService.readJson();
    }
}
