package bclaywalshreviews.reviewsartifact;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    private Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository(){
        Review transistor = new Review(1L, "Transistor", "Indie Game","/images/transistor.jpg", "Supergiant Games", "Transistor is an indie game by the small group Supergiant Games. It features a unique programmable battle system and an incredibly artsy ambiance. The only way I can describe the game's mood is possibly as warmly bleak, as you are one of the last people left alive in a city which is rapidly becoming a ghost-town as people start disappearing. The music in Transistor is a key component. It is ever-present and subtly complex in a way that bewitched my brain and brought me along with the incredible journey. 9/10");
        Review bastion = new Review(2L, "Bastion","Indie Game", "/images/bastion.jpg","Supergiant Games","Bastion is the first game by indie group Supegiant Games. It's unique art and music style are what draw you in and may or may not keep you hooked. One of the most interesting aspects is that your every move is narrated (quite skillfully). The action of the game is fast and rewarding, but for me it was the story that kept me around. It is...strange. It's quite obvious from the very beginning that this world is different from any you have ever dreamt of before. 8/10");
        Review axiomVerge = new Review(3L,"Axiom Verge", "Indie Game", "/images/axiomverge.jpeg","Thomas Happ Games LLC","This game....is great. As I understand it this game was made by a single person over the course of 5 years, and that's honestly not even affecting the high score I'm going to give it. Axiom Verge is a metroidvania that takes sci-fi and cyberpunk into a whole new realm. The rough on-screen pixels are intentional, all the glitchy graphics are SUPPOSED to be there, and the character your playing knows that everything is more than a little off. The action is classic, the music is nice and moody, and the story is mind-blowing. 9/10");
        Review hyperLightDrifter = new Review(4L,"Hyper Light Drifter","Indie Game","/images/HyperlightDrifter.jpg","Heart Machine, Abylight S.L.","A predominant theme in Hyper Light Drifter is chronic illness and something being subtly, terribly wrong in the world. The jarringly bright colors and high-contrast environments hide many things in their shadows, and throughout the game you are rewarded for thinking outside the box. The game has hands-down the most intriguing and jaw-dropping opening I've ever seen, and while the game is quite enjoyable I wish that sense of awe continued, but sadly the game ends on a somewhat bland note. The action is good old-fashioned top-down sword and gunplay, and the music is just okay. 7/10");

        reviewsList.put(transistor.getId(),transistor);
        reviewsList.put(bastion.getId(),bastion);
        reviewsList.put(axiomVerge.getId(),axiomVerge);
        reviewsList.put(hyperLightDrifter.getId(),hyperLightDrifter);
    }

    public ReviewRepository(Review ...reviewsToAdd) {
        for (Review review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}
