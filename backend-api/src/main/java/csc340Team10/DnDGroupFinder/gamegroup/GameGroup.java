package csc340Team10.DnDGroupFinder.gamegroup;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import csc340Team10.DnDGroupFinder.gamemaster.GameMaster;
import csc340Team10.DnDGroupFinder.groupmembership.GroupMembership;
import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "gamegroups") 
public class GameGroup {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupID;
    @NonNull
    private String location;
    @NonNull
    private String startTime;
    @NonNull
    private String endTime;
    @NonNull
    private String dayOfWeek;
    @NonNull
    private int playerSlots;
    @NonNull
    private String description;
    @ManyToOne()
    @JoinColumn(name = "GMID", nullable = false)
    @JsonIgnoreProperties({"gamegroups", "reviews"})
    private GameMaster gameMaster;
    @OneToMany()
    @JsonIgnoreProperties({"gamegroup", "player"})
    private List<GroupMembership> groupMemberships;

    public GameGroup() {
    }

    public GameGroup(String description, String dayOfWeek, String endTime, Long groupID, String location, int playerSlots, String startTime, GameMaster gameMaster) {
        this.description = description;
        this.dayOfWeek = dayOfWeek;
        this.endTime = endTime;
        this.groupID = groupID;
        this.location = location;
        this.playerSlots = playerSlots;
        this.startTime = startTime;
        this.gameMaster = gameMaster;
    }

    public GameGroup(String description, String dayOfWeek, String endTime, String location, int playerSlots, String startTime, GameMaster gameMaster) {
        this.description = description;
        this.dayOfWeek = dayOfWeek;
        this.endTime = endTime;
        this.location = location;
        this.playerSlots = playerSlots;
        this.startTime = startTime;
        this.gameMaster = gameMaster;
    }

    public GameGroup(Long groupID, String dayOfWeek, String location, String startTime, String endTime, int playerSlots, String description,
            GameMaster gameMaster, List<GroupMembership> groupMemberships) {
        this.groupID = groupID;
        this.dayOfWeek = dayOfWeek;
        this.location = location;
        this.startTime = startTime;
        this.endTime = endTime;
        this.playerSlots = playerSlots;
        this.description = description;
        this.gameMaster = gameMaster;
        this.groupMemberships = groupMemberships;
    }

    public Long getGroupID() {
        return groupID;
    }

    public void setGroupID(Long id) {
        this.groupID = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public double getPlayerSlots() {
        return playerSlots;
    }

    public void setPlayerSlots(int playerSlots) {
        this.playerSlots = playerSlots;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GameMaster getGameMaster() {
        return gameMaster;
    }

    public void setGameMaster(GameMaster gameMaster) {
        this.gameMaster = gameMaster;
    }

    public List<GroupMembership> getGroupMemberships() {
        return groupMemberships;
    }

    public void setGroupMemberships(List<GroupMembership> groupMemberships) {
        this.groupMemberships = groupMemberships;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    
}
