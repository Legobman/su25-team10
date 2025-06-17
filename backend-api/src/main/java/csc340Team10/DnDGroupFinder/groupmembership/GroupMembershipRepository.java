package csc340Team10.DnDGroupFinder.groupmembership;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface GroupMembershipRepository extends JpaRepository<GroupMembership, Long>{

    @Modifying
    @Transactional
    @Query(value = "delete from groupmemberships gms where gms.playerID = ?2 and gms.groupID = ?1", nativeQuery = true)
    void kickPlayer(long groupID, long playerID);

    @Query(value = "select gms.* from groupmemberships gms join players p on gms.playerID = p.playerID where p.username = ?1", nativeQuery = true)
    List<GroupMembership> findPlayerGroups(String username);

}
