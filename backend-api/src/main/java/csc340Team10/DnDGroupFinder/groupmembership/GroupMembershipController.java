package csc340Team10.DnDGroupFinder.groupmembership;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class GroupMembershipController {
    @Autowired
    private GroupMembershipService groupMembershipService;

    @GetMapping("/memberships")
    public Object getAllMemberships() {
        return groupMembershipService.getAllMemberships();
    }

    @GetMapping("/memberships/{id}")
    public GroupMembership getMembershipById(@PathVariable long id) {
        return groupMembershipService.getMembershipById(id);
    }

    @GetMapping("/memberships/find/{playerid}")
    public Object findPlayerGroups(@PathVariable Long playerid) {
        return groupMembershipService.findPlayerGroups(playerid);
    }

    @PostMapping("/memberships")
    public Object addMembership(@RequestBody GroupMembership membership) {
        return groupMembershipService.addMembership(membership);
    }

    @PutMapping("/memberships/{id}")
    public GroupMembership updateMembership(@PathVariable Long id, @RequestBody GroupMembership membership) {
        groupMembershipService.updateMembership(id, membership);
        return groupMembershipService.getMembershipById(id);
    }

    @DeleteMapping("/memberships/{id}")
    public Object deleteMembership(@PathVariable Long id) {
        groupMembershipService.deleteMembership(id);
        return groupMembershipService.getAllMemberships();
    }

    @DeleteMapping("/memberships/{groupid}/{playerid}")
    public Object kickPlayer(@PathVariable Long groupid, @PathVariable Long playerid) {
        groupMembershipService.kickPlayer(groupid, playerid);
        return groupMembershipService.getAllMemberships();
    }

    @PostMapping("/memberships/writeFile")
    public Object writeJson(@RequestBody GroupMembership membership) {
        groupMembershipService.writeJson(membership);
        return groupMembershipService.writeJson(membership);
    }

    @GetMapping("/memberships/readFile")
    public Object readJson() {
        return groupMembershipService.readJson();
    }
}
