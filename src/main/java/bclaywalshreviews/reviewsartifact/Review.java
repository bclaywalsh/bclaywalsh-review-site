package bclaywalshreviews.reviewsartifact;

//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.annotation.Id;
//import org.springframework.web.bind.annotation.ModelAttribute;

//import javax.persistence.Entity;
//import java.awt.*;

//@Entity
public class Review {

//    @Id
    private Long id;
    private String content;
    private String reviewName;
    private String studio;
    private String image;
    private String category;

    protected Review(){}
    public Review(long id, String reviewName, String category, String image, String studio, String content) {
        this.id = id;
        this.reviewName = reviewName;
        this.content = content;
        this.image = image;
        this.studio = studio;
        this.category = category;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReviewName() {
        return reviewName;
    }

    public void setReviewName(String reviewName) {
        this.reviewName = reviewName;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
