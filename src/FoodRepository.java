package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository containing hardcoded campus late-night food options for Chunk 1.
 */
public class FoodRepository {
    
    public static List<FoodSpot> getInitialSpots() {
        List<FoodSpot> spots = new ArrayList<>();
        spots.add(new FoodSpot("Pappy's Sweet Shop", 8.50, 5, "12:00 AM"));
        spots.add(new FoodSpot("Triple XXX Family Restaurant", 12.00, 8, "1:00 AM"));
        spots.add(new FoodSpot("State Street Eatery", 10.00, 4, "11:30 PM"));
        spots.add(new FoodSpot("Vienna Espresso Bar", 6.50, 6, "12:30 AM"));
        spots.add(new FoodSpot("Honeymoon Coffee Co.", 7.00, 7, "11:00 PM"));
        return spots;
    }
}
