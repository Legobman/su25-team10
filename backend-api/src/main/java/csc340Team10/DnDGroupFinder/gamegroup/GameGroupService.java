package csc340Team10.DnDGroupFinder.gamegroup;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class GameGroupService {

    @Autowired
    private GameGroupRepository gameGroupRepository;

    public Object getAllGameGroups() {
        return gameGroupRepository.findAll();
    }

    public GameGroup getGameGroupsById(@PathVariable long groupID) {
        return gameGroupRepository.findById(groupID).orElse(null);
    }

    public GameGroup addGameGroup(GameGroup gameGroup) {
        return gameGroupRepository.save(gameGroup);
    }

    public GameGroup updateGameGroup(Long GMID, GameGroup gameGroup) {
        return gameGroupRepository.save(gameGroup);
    }

    public void deleteGameGroup(Long GMID) {
        gameGroupRepository.deleteById(GMID);
    }

    public String writeJson(GameGroup gameGroup) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("game-groups.json"), gameGroup);
            return "Game Group written to JSON file successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error writing turtle to JSON file";
        }
    }

    public Object readJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File("game-groups.json"), GameGroup.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
