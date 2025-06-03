package csc340Team10.DnDGroupFinder.gamemaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameMasterController {

    @Autowired
    private GameMasterService gameMasterService;

    @GetMapping("/gamemasters")
    public Object getAllGameMasters() {
        return gameMasterService.getAllGameMasters();
    }

    @GetMapping("/gamemasters/{id}")
    public GameMaster getGameMastersById(@PathVariable long id) {
        return gameMasterService.getGameMastersById(id);
    }

    @PostMapping("/gamemasters")
    public Object addGameMaster(@RequestBody GameMaster gameMaster) {
        return gameMasterService.addGameMaster(gameMaster);
    }

    @PutMapping("/gamemasters/{id}")
    public GameMaster updateGameMaster(@PathVariable Long id, @RequestBody GameMaster gameMaster) {
        gameMasterService.updateGameMaster(id, gameMaster);
        return gameMasterService.getGameMastersById(id);
    }

    @DeleteMapping("/gamemasters/{id}")
    public Object deleteGameMaster(@PathVariable Long id) {
        gameMasterService.deleteGameMaster(id);
        return gameMasterService.getAllGameMasters();
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
