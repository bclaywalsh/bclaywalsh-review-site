package bclaywalshreviews.reviewsartifact;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("Serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Bad Request, Review Not Found!")
public class ReviewNotFoundException extends Exception {
}
