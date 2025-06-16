package csc340Team10.DnDGroupFinder.player;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import csc340Team10.DnDGroupFinder.groupmembership.GroupMembership;
import csc340Team10.DnDGroupFinder.review.Review;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long playerID;

    @NonNull
    @Column(unique = true, nullable = false)
    private String email;

    @NonNull
    @Column(unique = true, nullable = false)
    private String username;

    @NonNull
    @JsonIgnore
    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "player")
    @JsonIgnoreProperties("player")
    private List<GroupMembership> groupMemberships;

    @OneToMany(mappedBy = "player")
    @JsonIgnoreProperties("player")
    private List<Review> reviews;

    // Default constructor
    public Player() {
    }

    // Constructor without ID (used when creating new players)
    public Player(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    // Full constructor with lists
    public Player(Long playerID, String email, String username, String password, List<GroupMembership> groupMemberships, List<Review> reviews) {
        this.playerID = playerID;
        this.email = email;
        this.username = username;
        this.password = password;
        this.groupMemberships = groupMemberships;
        this.reviews = reviews;
    }

    // Getters and Setters
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

    // Password getter is ignored during JSON serialization for security
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

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerID=" + playerID +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
