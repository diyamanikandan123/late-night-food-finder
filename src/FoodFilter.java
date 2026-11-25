package src;

import java.util.ArrayList;
import java.util.List;

public class FoodFilter {
    public static List<FoodSpot> filterSpots(List<FoodSpot> spots, double maxBudget, int maxWalkMinutes, String dietaryPreference) {
        List<FoodSpot> matchingSpots = new ArrayList<>();

        for (FoodSpot spot : spots) {
            boolean withinBudget = spot.getAvgPrice() <= maxBudget;
            boolean withinWalkTime = spot.getWalkMinutes() <= maxWalkMinutes;
            boolean matchesDiet = dietaryPreference.equalsIgnoreCase("Any")
                    || spot.getDietaryTag().equalsIgnoreCase(dietaryPreference);

            if (withinBudget && withinWalkTime && matchesDiet) {
                matchingSpots.add(spot);
            }
        }

        return matchingSpots;
    }
}