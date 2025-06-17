package csc340Team10.DnDGroupFinder.groupmembership;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupMembershipRepository extends JpaRepository<GroupMembership, Long>{

    @Query(value = "delete from groupmemberships gms where gms.playerID = ?1 and gms.groupID = ?1", nativeQuery = true)
    List<GroupMembership> kickPlayer(long groupID, long playerID);

    @Query(value = "select gms.* FROM groupmemberships gms JOIN players p ON gms.playerID = p.playerID WHERE p.username = ?1", nativeQuery = true)
    List<GroupMembership> findPlayerGroups(String username);

}
