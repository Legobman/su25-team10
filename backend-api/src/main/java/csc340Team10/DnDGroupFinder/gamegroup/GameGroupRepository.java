package csc340Team10.DnDGroupFinder.gamegroup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameGroupRepository extends JpaRepository<GameGroup, Long>{
    
}
