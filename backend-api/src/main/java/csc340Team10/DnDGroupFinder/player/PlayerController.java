package csc340Team10.DnDGroupFinder.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/login")
    public String loginForm() {
        return "player-login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        Player player = playerService.getPlayerByUsername(username);
        if (player != null && player.getPassword().equals(password)) {
            model.addAttribute("player", player);
            return "player-homepage";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "player-login";
        }
    }

    @GetMapping("/createForm")
    public String createForm(Model model) {
        model.addAttribute("player", new Player());
        return "player-create";
    }

    @PostMapping("/create")
    public String createPlayer(@ModelAttribute Player player) {
        playerService.addPlayer(player);
        return "redirect:/players/login";
    }

    @GetMapping("/updateForm/{playerID}")
    public String updateForm(@PathVariable Long playerID, Model model) {
        Player player = playerService.getPlayerById(playerID);
        if (player == null) {
            return "redirect:/players/login";
        }
        model.addAttribute("player", player);
        return "player-update";
    }

    @PostMapping("/update/{playerID}")
    public String updatePlayer(@PathVariable Long playerID, @ModelAttribute Player player) {
        playerService.updatePlayer(playerID, player);
        return "redirect:/players/login";
    }

    @GetMapping("/delete/{playerID}")
    public String deletePlayer(@PathVariable Long playerID) {
        playerService.deletePlayer(playerID);
        return "redirect:/players/login";
    }
}
