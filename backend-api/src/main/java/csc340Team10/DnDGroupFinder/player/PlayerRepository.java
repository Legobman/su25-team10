package csc340Team10.DnDGroupFinder.player;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    
    // Find a player by username (used for login)
    Player findByUsername(String username);

    List<Player> findByUsernameContainingIgnoreCase(String keyword);
}
