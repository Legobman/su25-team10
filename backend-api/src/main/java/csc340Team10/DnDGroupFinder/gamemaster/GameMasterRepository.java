package csc340Team10.DnDGroupFinder.gamemaster;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameMasterRepository extends JpaRepository<GameMaster, Long>{
    Optional<GameMaster> getGameMasterByUsername(String username);
}
