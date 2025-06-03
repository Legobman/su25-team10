package csc340Team10.DnDGroupFinder.review;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import csc340Team10.DnDGroupFinder.gamemaster.GameMaster;
import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewID;
    @NonNull
    private String rating;
    @NonNull
    private String response;
    @ManyToOne()
    @JoinColumn(name = "GMID", nullable = false)
    @JsonIgnoreProperties("gamegroups")
    private GameMaster gameMaster;

    public Review() {
    }

    public Review(GameMaster gameMaster, String rating, String response, Long reviewID) {
        this.gameMaster = gameMaster;
        this.rating = rating;
        this.response = response;
        this.reviewID = reviewID;
    }

    public Review(GameMaster gameMaster, String rating, String response) {
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


}
