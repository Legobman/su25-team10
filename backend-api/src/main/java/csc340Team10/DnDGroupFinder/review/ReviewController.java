package csc340Team10.DnDGroupFinder.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/reviews")
    public Object getAllReviews() {
        return reviewService.getAllReviews();
    }

    @GetMapping("/reviews/{id}")
    public Review getReviewById(@PathVariable long id) {
        return reviewService.getReviewById(id);
    }

    @GetMapping("/reviews/search/{id}")
    public Object findYourReviews(@PathVariable long id) {
        return reviewService.findYourReviews(id);
    }

    @PostMapping("/reviews")
    public Object addReview(@RequestBody Review review) {
        return reviewService.addReview(review);
    }

    @PutMapping("/reviews/{id}")
    public Review updateReview(@PathVariable Long id, @RequestBody Review review) {
        reviewService.updateReview(id, review);
        return reviewService.getReviewById(id);
    }

    @DeleteMapping("/reviews/{id}")
    public Object deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
        return reviewService.getAllReviews();
    }

    @PostMapping("/reviews/writeFile")
    public Object writeJson(@RequestBody Review review) {
        reviewService.writeJson(review);
        return reviewService.writeJson(review);
    }

    @GetMapping("/reviews/readFile")
    public Object readJson() {
        return reviewService.readJson();
    }
}
