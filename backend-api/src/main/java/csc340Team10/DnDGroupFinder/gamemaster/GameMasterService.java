package csc340Team10.DnDGroupFinder.gamemaster;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class GameMasterService {
    
    @Autowired
    private GameMasterRepository gameMasterRepository;

    public Object getAllGameMasters() {
        return gameMasterRepository.findAll();
    }

    public GameMaster getGameMasterById(@PathVariable long GMID) {
        return gameMasterRepository.findById(GMID).orElse(null);
    }

    public GameMaster addGameMaster(GameMaster gameMaster) {
        return gameMasterRepository.save(gameMaster);
    }

    public GameMaster updateGameMaster(Long GMID, GameMaster gameMaster) {
        return gameMasterRepository.save(gameMaster);
    }

    public void deleteGameMaster(Long GMID) {
        gameMasterRepository.deleteById(GMID);
    }

    public String writeJson(GameMaster gameMaster) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("game-masters.json"), gameMaster);
            return "Game Master written to JSON file successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error writing game master to JSON file";
        }
    }

    public Object readJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File("game-masters.json"), GameMaster.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
