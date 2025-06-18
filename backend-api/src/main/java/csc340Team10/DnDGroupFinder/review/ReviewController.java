package csc340Team10.DnDGroupFinder.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/reviews")
    public Object getAllReviews(Model model) {
        model.addAttribute("reviewsList", reviewService.getAllReviews());
        model.addAttribute("title", "All Reviews");
        return "reviews-list";
    }

    @GetMapping("/reviews/{id}/{GMID}")
    public Object getReviewById(@PathVariable long id, @PathVariable long GMID, Model model) {
        model.addAttribute("review", reviewService.getReviewById(id));
        model.addAttribute("GMID", GMID);
        model.addAttribute("title", "Review #: " + id);
        return "reviews-details";
    }

    @GetMapping("/reviews/search/{id}")
    public Object findYourReviews(@PathVariable long id, Model model) {
        model.addAttribute("reviewsList", reviewService.findYourReviews(id));
        model.addAttribute("GMID", id);
        model.addAttribute("title", "All Reviews for GM: " + id);
        return "reviews-gm-list";
    }

    @GetMapping("/reviews/createForm")
    public Object showCreateForm(Model model) {
        Review review = new Review();
        model.addAttribute("review", review);
        model.addAttribute("title", "Create New Review");
        return "Review-create";
    }

    @PostMapping("/reviews")
    public Object addReview(Review review) {
        Review newReview = reviewService.addReview(review);
        return "redirect:/reviews/" + newReview.getReviewID();
    }

    @GetMapping("/reviews/updateForm/{id}")
    public Object showUpdateForm(@PathVariable Long id, Model model) {
        Review review = reviewService.getReviewById(id);
        model.addAttribute("review", review);
        model.addAttribute("title", "Update Review: " + id);
        return "reviews-gm-update";
    }

    @PostMapping("/reviews/update/{id}/{GMID}")
    public Object updateReview(@PathVariable Long id, @PathVariable long GMID, Review review) {
        reviewService.updateReview(id, review);
        return "redirect:/reviews/" + id + "/" + GMID;
    }

    @GetMapping("/reviews/delete/{id}")
    public Object deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
        return "redirect:/reviews";
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
