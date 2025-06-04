package csc340Team10.DnDGroupFinder.review;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{
    @Query(value = "select * from reviews r where r.GMid = ?1", nativeQuery = true)
    List<Review> findYourReviews(long GMID);
}
