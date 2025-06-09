package csc340Team10.DnDGroupFinder.gamegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class GameGroupController {
    @Autowired
    private GameGroupService gameGroupService;

    @GetMapping("/gamegroups")
    public Object getAllGameGroups() {
        return gameGroupService.getAllGameGroups();
    }

    @GetMapping("/gamegroups/{id}")
    public GameGroup getGameGroupById(@PathVariable long id) {
        return gameGroupService.getGameGroupById(id);
    }

    @GetMapping("/gamegroups/search/{term}")
    public Object searchGameGroup(@PathVariable String term) {
        return gameGroupService.searchGameGroup(term);
    }
    
    @PostMapping("/gamegroups")
    public Object addGameGroup(@RequestBody GameGroup gameGroup) {
        return gameGroupService.addGameGroup(gameGroup);
    }

    @PutMapping("/gamegroups/{id}")
    public GameGroup updateGameGroup(@PathVariable Long id, @RequestBody GameGroup gameGroup) {
        gameGroupService.updateGameGroup(id, gameGroup);
        return gameGroupService.getGameGroupById(id);
    }

    @DeleteMapping("/gamegroups/{id}")
    public Object deleteGameGroup(@PathVariable Long id) {
        gameGroupService.deleteGameGroup(id);
        return gameGroupService.getAllGameGroups();
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
