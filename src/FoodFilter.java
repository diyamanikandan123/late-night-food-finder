package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles filtering campus food spots based on user criteria.
 * Single-responsibility class dedicated solely to filter algorithms.
 */
public class FoodFilter {
    
    public static List<FoodSpot> filterByBudgetAndWalkTime(List<FoodSpot> spots, double maxBudget, int maxWalkMinutes) {
        List<FoodSpot> filtered = new ArrayList<>();
        for (FoodSpot spot : spots) {
            if (spot.getAveragePrice() <= maxBudget && spot.getWalkMinutes() <= maxWalkMinutes) {
                filtered.add(spot);
            }
        }
        return filtered;
    }
}
