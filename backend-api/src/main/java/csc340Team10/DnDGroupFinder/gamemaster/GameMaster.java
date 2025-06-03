package csc340Team10.DnDGroupFinder.gamemaster;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import csc340Team10.DnDGroupFinder.gamegroup.GameGroup;
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
@Table(name = "gamemasters") 
public class GameMaster {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long GMID;
    @NonNull
    @Column(unique = true)
    private String email;
    @NonNull
    @Column(unique = true)
    private String username;
    @NonNull
    private String password;

    @OneToMany(mappedBy = "gameMaster")
    @JsonIgnoreProperties("gameMaster")
    private List<GameGroup> gamegroups;

    @OneToMany(mappedBy = "gameMaster")
    @JsonIgnoreProperties("gameMaster")
    private List<Review> reviews;

    public GameMaster() {
    }

    public GameMaster(Long GMID, String email, String username, String password) {
        this.GMID = GMID;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public GameMaster(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public GameMaster(Long gMID, String email, String username, String password, List<GameGroup> gamegroups,
            List<Review> reviews) {
        this.GMID = gMID;
        this.email = email;
        this.username = username;
        this.password = password;
        this.gamegroups = gamegroups;
        this.reviews = reviews;
    }

    public GameMaster(Long gMID, String email, String username, String password, List<GameGroup> gamegroups) {
        this.GMID = gMID;
        this.email = email;
        this.username = username;
        this.password = password;
        this.gamegroups = gamegroups;
    }

    public Long getGMID() {
        return GMID;
    }

    public void setGMID(Long id) {
        this.GMID = id;
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

    public List<GameGroup> getGamegroups() {
        return gamegroups;
    }

    public void setGamegroups(List<GameGroup> gamegroups) {
        this.gamegroups = gamegroups;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
