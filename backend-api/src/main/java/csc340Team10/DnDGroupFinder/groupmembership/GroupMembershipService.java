package csc340Team10.DnDGroupFinder.groupmembership;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class GroupMembershipService {
    @Autowired
    private GroupMembershipRepository groupMembershipRepository;

    public Object getAllMemberships() {
        return groupMembershipRepository.findAll();
    }

    public GroupMembership getMembershipsById(@PathVariable long membershipID) {
        return groupMembershipRepository.findById(membershipID).orElse(null);
    }

    public GroupMembership addMembership(GroupMembership membership) {
        return groupMembershipRepository.save(membership);
    }

    public Object findPlayerGroups(long playerID) {
        return groupMembershipRepository.findPlayerGroups(playerID);
    }

    public GroupMembership updateMembership(Long membershipID, GroupMembership membership) {
        return groupMembershipRepository.save(membership);
    }

    public void deleteMembership(Long membershipID) {
        groupMembershipRepository.deleteById(membershipID);
    }

    public void kickPlayer(long groupID, long playerID) {
        groupMembershipRepository.kickPlayer(groupID, playerID);
    }

    public String writeJson(GroupMembership membership) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("memberships.json"), membership);
            return "Membership written to JSON file successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error writing membership to JSON file";
        }
    }

    public Object readJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File("memberships.json"), GroupMembership.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
