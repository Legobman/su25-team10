package csc340Team10.DnDGroupFinder.review;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public Object getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewsById(@PathVariable long reviewID) {
        return reviewRepository.findById(reviewID).orElse(null);
    }

    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review updateReview(Long reviewID, Review review) {
        return reviewRepository.save(review);
    }

    public void deleteReview(Long reviewID) {
        reviewRepository.deleteById(reviewID);
    }

    public String writeJson(Review review) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("reviews.json"), review);
            return "Review written to JSON file successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error writing review to JSON file";
        }
    }

    public Object readJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File("reviews.json"), Review.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
