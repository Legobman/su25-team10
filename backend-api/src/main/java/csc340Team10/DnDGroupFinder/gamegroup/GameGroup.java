package csc340Team10.DnDGroupFinder.gamegroup;

import java.util.Date;
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
    private Date startTime;
    @NonNull
    private Date endTime;
    @NonNull
    private int playerSlots;
    @NonNull
    private String description;
    @ManyToOne()
    @JoinColumn(name = "GMID", nullable = false)
    @JsonIgnoreProperties("gamegroups")
    private GameMaster gameMaster;
    @OneToMany()
    @JoinColumn(name = "groupMembershipID", nullable = false)
    @JsonIgnoreProperties("gamegroups")
    private List<GroupMembership> groupMemberships;

    public GameGroup() {
    }

    public GameGroup(String description, Date endTime, Long groupID, String location, int playerSlots, Date startTime, GameMaster gameMaster) {
        this.description = description;
        this.endTime = endTime;
        this.groupID = groupID;
        this.location = location;
        this.playerSlots = playerSlots;
        this.startTime = startTime;
        this.gameMaster = gameMaster;
    }

    public GameGroup(String description, Date endTime, String location, int playerSlots, Date startTime, GameMaster gameMaster) {
        this.description = description;
        this.endTime = endTime;
        this.location = location;
        this.playerSlots = playerSlots;
        this.startTime = startTime;
        this.gameMaster = gameMaster;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
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
    
}
