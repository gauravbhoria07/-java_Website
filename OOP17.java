// Movie.java
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String director;
    private List<String> actors;
    private List<String> reviews;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public List<String> getReviews() {
        return reviews;
    }
}
