package bclaywalshreviews.reviewsartifact;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewTest {

    Review underTest = new Review();
    Review transistor = new Review(1L, "Transistor", "Indie Game","/images/transistor.jpg", "Supergiant Games", "Transistor is an indie game by the small group Supergiant Games. It features a unique programmable battle system and an incredibly artsy ambiance. The only way I can describe the game's mood is possibly as warmly bleak, as you are one of the last people left alive in a city which is rapidly becoming a ghost-town as people start disappearing. The music in Transistor is a key component. It is ever-present and subtly complex in a way that bewitched my brain and brought me along with the incredible journey. 9/10");

    @Test
    public void getReviewNameShouldEqualTransistor(){
        assertEquals("Transistor",transistor.getReviewName());
    }

    @Test
    public void getImageShouldReturnImagePath(){
        assertEquals("/images/transistor.jpg",transistor.getImage());
    }

}
