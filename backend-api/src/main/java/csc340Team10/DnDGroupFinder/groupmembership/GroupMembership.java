package csc340Team10.DnDGroupFinder.groupmembership;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import csc340Team10.DnDGroupFinder.gamegroup.GameGroup;
import csc340Team10.DnDGroupFinder.player.Player;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "groupmemberships") 
public class GroupMembership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long membershipID;
    @ManyToOne()
    @JoinColumn(name = "groupID", nullable = false)
    @JsonIgnoreProperties("groupMemberships")
    private GameGroup gameGroup;

    @ManyToOne()
    @JoinColumn(name = "playerID", nullable = false)
    @JsonIgnoreProperties("groupmemberships")
    private Player player;

    public GroupMembership() {
    }

    public GroupMembership(GameGroup gamegroup, Long membershipID, Player player) {
        this.gameGroup = gamegroup;
        this.membershipID = membershipID;
        this.player = player;
    }

    public GroupMembership(GameGroup gamegroup, Player player) {
        this.gameGroup = gamegroup;
        this.player = player;
    }

    public Long getMembershipID() {
        return membershipID;
    }

    public void setMembershipID(Long membershipID) {
        this.membershipID = membershipID;
    }

    public GameGroup getGamegroup() {
        return gameGroup;
    }

    public void setGamegroup(GameGroup gamegroup) {
        this.gameGroup = gamegroup;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    

}
