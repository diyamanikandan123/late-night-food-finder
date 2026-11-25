package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository containing hardcoded campus late-night food options.
 */
public class FoodRepository {

    public static List<FoodSpot> getInitialSpots() {
        List<FoodSpot> spots = new ArrayList<>();

        // Your original spots
        spots.add(new FoodSpot("Pappy's Sweet Shop", 8.50, 5, "12:00 AM", "Vegetarian"));
        spots.add(new FoodSpot("Triple XXX Family Restaurant", 12.00, 8, "1:00 AM", "None"));
        spots.add(new FoodSpot("State Street Eatery", 10.00, 4, "11:30 PM", "Halal"));
        spots.add(new FoodSpot("Vienna Espresso Bar", 6.50, 6, "12:30 AM", "Vegetarian"));
        spots.add(new FoodSpot("Honeymoon Coffee Co.", 7.00, 7, "11:00 PM", "Vegetarian"));

        // Additional campus late-night spots
        spots.add(new FoodSpot("Taco Bell (Chauncey)", 8.50, 6, "2:00 AM", "Vegetarian"));
        spots.add(new FoodSpot("Insomnia Cookies", 7.00, 5, "3:00 AM", "Vegetarian"));
        spots.add(new FoodSpot("Mad Mushroom Pizza", 11.00, 7, "3:00 AM", "Vegetarian"));
        spots.add(new FoodSpot("Shawarma King", 12.50, 8, "2:30 AM", "Halal"));
        spots.add(new FoodSpot("Silver Dipper Ice Cream", 6.50, 6, "11:30 PM", "Vegetarian"));

        return spots;
    }
}