package bclaywalshreviews.reviewsartifact;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewsRepositoryTest {

    private Review reviewOne = new Review(1L, "review One", "category", "imageName", "studioName", "description");
    private Review reviewTwo = new Review(2L, "review Two", "category", "imageName", "studioName", "description");
    private ReviewRepository underTest = new ReviewRepository(reviewOne, reviewTwo);

    @Test
    public void shouldFindReviewOne() {
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindReviewOneAndReviewTwo() {
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }
}
