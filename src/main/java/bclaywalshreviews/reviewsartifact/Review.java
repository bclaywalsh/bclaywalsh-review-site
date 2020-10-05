package bclaywalshreviews.reviewsartifact;

import java.awt.*;

public class Review {

    private long id;
    private String content;
    private String reviewName;
    private String studio;
    private String image;
    private String category;

    protected Review(){};

    public Review(long id, String reviewName, String category, String image, String studio, String content) {
        this.id = id;
        this.reviewName = reviewName;
        this.content = content;
        this.image = image;
        this.studio = studio;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReviewName() {
        return reviewName;
    }

    public void setReviewName(String reviewName) {
        this.reviewName = reviewName;
    }

    public String getDescription() {
        return content;
    }

    public void setDescription(String description) {
        this.content = description;
    }

}
