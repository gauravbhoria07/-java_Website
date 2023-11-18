// Restaurant.java
import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private Map<String, Double> menu;
    private Map<String, Integer> ratings;

    public Restaurant() {
        this.menu = new HashMap<>();
        this.ratings = new HashMap<>();
    }

    public void addItem(String itemName, double price) {
        menu.put(itemName, price);
    }

    public void removeItem(String itemName) {
        menu.remove(itemName);
        ratings.remove(itemName);
    }

    public void rateItem(String itemName, int rating) {
        ratings.put(itemName, rating);
    }

    public double calculateAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }

        int totalRatings = 0;
        for (int rating : ratings.values()) {
            totalRatings += rating;
        }

        return (double) totalRatings / ratings.size();
    }
}
