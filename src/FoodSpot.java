package src;

public class FoodSpot {
    private String name;
    private double avgPrice;
    private int walkMinutes;
    private String closingTime;
    private String dietaryTag;

    public FoodSpot(String name, double avgPrice, int walkMinutes, String closingTime, String dietaryTag) {
        this.name = name;
        this.avgPrice = avgPrice;
        this.walkMinutes = walkMinutes;
        this.closingTime = closingTime;
        this.dietaryTag = dietaryTag;
    }

    public String getName() {
        return name;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public int getWalkMinutes() {
        return walkMinutes;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public String getDietaryTag() {
        return dietaryTag;
    }

    @Override
    public String toString() {
        return String.format("%s | Avg: $%.2f | Walk: %d min | Closes: %s | Dietary: %s",
                name, avgPrice, walkMinutes, closingTime, dietaryTag);
    }
}