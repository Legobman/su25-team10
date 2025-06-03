package csc340Team10.DnDGroupFinder.groupmembership;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupMembershipRepository extends JpaRepository<GroupMembership, Long>{

    @Query(value = "delete from groupmemberships gms where gms.playerID = ?1 and gms.groupID = ?1", nativeQuery = true)
    List<GroupMembership> kickPlayer(long groupID, long playerID);

    @Query(value = "select * from groupmemberships gms where gms.playerID = ?1", nativeQuery = true)
    List<GroupMembership> findPlayerGroups(long playerID);

}
