package csc340Team10.DnDGroupFinder.gamemaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameMasterController {

    @Autowired
    private GameMasterService gameMasterService;

    @GetMapping("/gamemasters")
    public Object getAllGameMasters(Model model) {
        //model.addAttribute("gamemasterList", gameMasterService.getAllGameMasters());
        //model.addAttribute("title", "All Game Masters");
        return "gamemaster-login";
    }

    @GetMapping("/gamemasters/{id}")
    public Object getGameMasterById(@PathVariable long id, Model model) {
        model.addAttribute("gamemaster", gameMasterService.getGameMasterById(id));
        model.addAttribute("title", "Game Master #: " + id);
        return "gamemaster-homepage";
    }

    @GetMapping("/gamemasters/createForm")
    public Object showCreateForm(Model model) {
        GameMaster gameMaster = new GameMaster();
        model.addAttribute("gameMaster", gameMaster);
        model.addAttribute("title", "Create New Game Master");
        return "gamemaster-create";
    }

    @PostMapping("/gamemasters")
    public String addGameMaster(GameMaster gameMaster) {
        GameMaster newGameMaster = gameMasterService.addGameMaster(gameMaster);
        return "redirect:/gamemasters";
    }

    @PostMapping("/gamemasters/login")
    public Object getGameMasterByUsername(@RequestParam String username, @RequestParam String password, Model model) {
        GameMaster gameMaster = gameMasterService.getGameMasterByUsername(username);
        if (gameMaster != null && gameMaster.getPassword().equals(password)) {
            model.addAttribute("gamemaster", gameMaster);
            model.addAttribute("title", "Game Master #: " + gameMaster.getGMID());
            return "gamemaster-homepage";
        } else {
        return "redirect:/gamemasters";
        }
    }

    @GetMapping("/gamemasters/updateForm/{id}")
    public Object showUpdateForm(@PathVariable Long id, Model model) {
        GameMaster gameMaster = gameMasterService.getGameMasterById(id);
        model.addAttribute("gamemaster", gameMaster);
        model.addAttribute("title", "Update Game Master: " + id);
        return "gamemaster-update";
    }

    @PostMapping("/gamemasters/update/{id}")
    public Object updateGameMaster(@PathVariable Long id, GameMaster gameMaster) {
        gameMasterService.updateGameMaster(id, gameMaster);
        return "redirect:/gamemasters/" + id;
    }

    @GetMapping("/gamemasters/delete/{id}")
    public Object deleteGameMaster(@PathVariable Long id) {
        gameMasterService.deleteGameMaster(id);
        return "redirect:/gamemasters";
    }

    @PostMapping("/gamemasters/writeFile")
    public Object writeJson(@RequestBody GameMaster gameMaster) {
        gameMasterService.writeJson(gameMaster);
        return gameMasterService.writeJson(gameMaster);
    }

    @GetMapping("/gamemasters/readFile")
    public Object readJson() {
        return gameMasterService.readJson();
    }
}
