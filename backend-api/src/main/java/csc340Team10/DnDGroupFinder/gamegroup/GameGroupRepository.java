package csc340Team10.DnDGroupFinder.gamegroup;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GameGroupRepository extends JpaRepository<GameGroup, Long>{
@Query(value = "select * from gamegroups g where g.description LIKE %?1%", nativeQuery = true)
    List<GameGroup> searchGameGroup(String term);
@Query(value = "select distinct g from GameGroup g left join fetch g.groupMemberships gms left join fetch gms.player")
    List<GameGroup> findAllPlayersInGroup();
@Query(value = "select * from gamegroups g where g.GMID = ?1", nativeQuery = true)
    List<GameGroup> getGameGroupsByGMID(Long gmId);
}

