package csc340Team10.DnDGroupFinder.review;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import csc340Team10.DnDGroupFinder.gamemaster.GameMaster;
import csc340Team10.DnDGroupFinder.player.Player;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews") 
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewID;
    private String rating;
    private String response;
    @ManyToOne()
    @JoinColumn(name = "GMID", nullable = false)
    @JsonIgnoreProperties({"reviews", "gamegroups"})
    private GameMaster gameMaster;

    @ManyToOne()
    @JoinColumn(name = "playerID", nullable = false)
    @JsonIgnoreProperties({"reviews","groupMemberships"})
    private Player player;

    public Review() {
    }

    public Review(Player player, GameMaster gameMaster, String rating, String response, Long reviewID) {
        this.player = player;
        this.gameMaster = gameMaster;
        this.rating = rating;
        this.response = response;
        this.reviewID = reviewID;
    }

    public Review(Long reviewID, String response, GameMaster gameMaster, Player player) {
        this.reviewID = reviewID;
        this.response = response;
        this.gameMaster = gameMaster;
        this.player = player;
    }

    public Review(Player player, GameMaster gameMaster, String rating, String response) {
        this.player = player;
        this.gameMaster = gameMaster;
        this.rating = rating;
        this.response = response;
    }


    public Long getReviewID() {
        return reviewID;
    }

    public void setReviewID(Long reviewID) {
        this.reviewID = reviewID;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public GameMaster getGameMaster() {
        return gameMaster;
    }

    public void setGameMaster(GameMaster gameMaster) {
        this.gameMaster = gameMaster;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


}
