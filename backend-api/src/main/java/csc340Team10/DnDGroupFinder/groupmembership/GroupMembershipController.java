package csc340Team10.DnDGroupFinder.groupmembership;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class GroupMembershipController {
    @Autowired
    private GroupMembershipService groupMembershipService;

    @GetMapping("/memberships")
    public Object getAllMemberships(Model model) {
        //model.addAttribute("turtlesList", groupMembershipService.getAllMemberships());
        //model.addAttribute("title", "All Turtles");
        return "groupmembership-search";
    }

    @GetMapping("/memberships/{id}")
    public Object getMembershipById(@PathVariable long id, Model model) {
        model.addAttribute("groupmembership", groupMembershipService.getMembershipById(id));
        model.addAttribute("title", "Group Membership #: " + id);
        return "groupmembership-details";
    }

    @GetMapping("/memberships/find")
    public Object findPlayerGroups(@PathVariable Long playerid, Model model) {
        model.addAttribute("groupMembershipList", groupMembershipService.findPlayerGroups(playerid));
        model.addAttribute("title", "Group Membership by Player");
        return "groupmembership-list";
    }

    @GetMapping("/memberships/createForm")
    public Object showCreateForm(Model model) {
        GroupMembership membership = new GroupMembership();
        model.addAttribute("groupMembership", membership);
        model.addAttribute("title", "Create New Group Membership");
        return "groupmembership-create";
    }

    @PostMapping("/memberships")
    public Object addMembership(GroupMembership membership) {
        GroupMembership newMembership = groupMembershipService.addMembership(membership);
        return "redirect:/memberships/" + newMembership.getMembershipID();
    }

    @GetMapping("/memberships/updateForm/{id}")
    public Object showUpdateForm(@PathVariable Long id, Model model) {
        GroupMembership membership = groupMembershipService.getMembershipById(id);
        model.addAttribute("groupMembership", membership);
        model.addAttribute("title", "Update Group Membership: " + id);
        return "groupmembership-update";
    }

    @PostMapping("/memberships/update/{id}")
    public Object updateMembership(@PathVariable Long id, GroupMembership membership) {
        groupMembershipService.updateMembership(id, membership);
        return "redirect:/memberships/" + id;
    }

    @GetMapping("/memberships/delete/{id}")
    public Object deleteMembership(@PathVariable Long id) {
        groupMembershipService.deleteMembership(id);
        return "redirect:/memberships";
    }

    @GetMapping("/memberships/{groupid}/{playerid}")
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
