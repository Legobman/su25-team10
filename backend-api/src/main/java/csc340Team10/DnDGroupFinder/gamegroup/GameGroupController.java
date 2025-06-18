package csc340Team10.DnDGroupFinder.gamegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import csc340Team10.DnDGroupFinder.gamemaster.GameMaster;
import csc340Team10.DnDGroupFinder.gamemaster.GameMasterService;


@Controller
public class GameGroupController {
    @Autowired
    private GameGroupService gameGroupService;
    @Autowired
    private GameMasterService gameMasterService;

    @GetMapping("/gamegroups")
    public Object getAllGameGroups(Model model) {
        model.addAttribute("gameGroupList", gameGroupService.getAllGameGroups());
        model.addAttribute("title", "All Game Groups");
        return "gamegroups-list";
    }

    @GetMapping("/gamegroups/{id}")
    public Object getGameGroupById(@PathVariable long id, Model model) {
        model.addAttribute("gameGroup", gameGroupService.getGameGroupById(id));
        model.addAttribute("title", "Game Group #: " + id);
        return "gamegroups-details";
    }

    @GetMapping("/gamegroups/search/{term}")
    public Object searchGameGroup(@PathVariable String term) {
        return gameGroupService.searchGameGroup(term);
    }
    
    @GetMapping("/gamegroups/createForm/{GMID}")
    public Object showCreateForm(@PathVariable Long GMID, Model model) {
        GameGroup gameGroup = new GameGroup();
        model.addAttribute("gameGroup", gameGroup);
        model.addAttribute("GMID", GMID);
        model.addAttribute("title", "Create New Game Group");
        return "gamegroups-create";
    }

    @GetMapping("/gamegroups/gmlookup/{GMID}")
    public Object getGameGroupsByGMID(@PathVariable Long GMID, Model model) {
        List<GameGroup> gameGroups = gameGroupService.getGameGroupsByGMID(GMID);
        model.addAttribute("gameGroupList", gameGroups);
        model.addAttribute("GMID", GMID);
        model.addAttribute("title", "Game Group for ID: " + GMID);
        return "gamegroups-list";
    }

    @PostMapping("/gamegroups")
    public Object addGameGroup(@RequestParam("GMID") Long gmId, GameGroup gameGroup) {
        GameMaster gm = gameMasterService.getGameMasterById(gmId);
        gameGroup.setGameMaster(gm);
        GameGroup newGameGroup = gameGroupService.addGameGroup(gameGroup);
        return "redirect:/gamegroups/" + newGameGroup.getGroupID();
    }

    @GetMapping("/gamegroups/updateForm/{id}")
    public Object showUpdateForm(@PathVariable Long id, Model model) {
        GameGroup gameGroup = gameGroupService.getGameGroupById(id);
        model.addAttribute("gameGroup", gameGroup);
        model.addAttribute("title", "Update Game Group: " + id);
        return "gamegroups-update";
    }

    @PostMapping("/gamegroups/update/{id}")
    public Object updateGameGroup(@PathVariable Long id, GameGroup gameGroup) {
        gameGroupService.updateGameGroup(id, gameGroup);
        return "redirect:/gamegroups/" + id;
    }

    @GetMapping("/gamegroups/delete/{id}")
    public Object deleteGameGroup(@PathVariable Long id) {
        gameGroupService.deleteGameGroup(id);
        return "redirect:/gamegroups";
    }

    @PostMapping("/gamegroups/writeFile")
    public Object writeJson(@RequestBody GameGroup gameGroup) {
        gameGroupService.writeJson(gameGroup);
        return gameGroupService.writeJson(gameGroup);
    }

    @GetMapping("/gamegroups/readFile")
    public Object readJson() {
        return gameGroupService.readJson();
    }
}
