package csc340Team10.DnDGroupFinder.gamegroup;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class GameGroupService {

    @Autowired
    private GameGroupRepository gameGroupRepository;

    public Object getAllGameGroups() {
        return gameGroupRepository.findAllPlayersInGroup();
    }

    public GameGroup getGameGroupById(@PathVariable long groupID) {
        return gameGroupRepository.findById(groupID).orElse(null);
    }

    public List<GameGroup> getGameGroupsByGMID(Long gmId) {
        return gameGroupRepository.getGameGroupsByGMID(gmId);
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
            return "Error writing game group to JSON file";
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
    public Object searchGameGroup (String term){
        return gameGroupRepository.searchGameGroup(term);

    }
}
