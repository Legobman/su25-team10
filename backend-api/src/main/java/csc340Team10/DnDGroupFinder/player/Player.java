package csc340Team10.DnDGroupFinder.player;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import csc340Team10.DnDGroupFinder.groupmembership.GroupMembership;
import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "players") 
public class Player {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playerID;
    @NonNull
    @Column(unique = true)
    private String email;
    @NonNull
    @Column(unique = true)
    private String username;
    @NonNull
    private String password;
    @OneToMany(mappedBy = "player")
    @JsonIgnoreProperties("players")
    private List<GroupMembership> groupMemberships;

    public Player() {
    }

    public Player(String email, String password, Long playerID, String username) {
        this.email = email;
        this.password = password;
        this.playerID = playerID;
        this.username = username;
    }

    public Player(String email, String password, String username) {
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public Long getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Long playerID) {
        this.playerID = playerID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<GroupMembership> getGroupMemberships() {
        return groupMemberships;
    }

    public void setGroupMemberships(List<GroupMembership> groupMemberships) {
        this.groupMemberships = groupMemberships;
    }
}
