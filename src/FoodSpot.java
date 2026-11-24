package src;

/**
 * Represents an individual late-night food location on campus.
 * Stores core attributes for budget and walking-time filtering.
 */
public class FoodSpot {
    private String name;
    private double averagePrice;
    private int walkMinutes;
    private String closingTime;

    public FoodSpot(String name, double averagePrice, int walkMinutes, String closingTime) {
        this.name = name;
        this.averagePrice = averagePrice;
        this.walkMinutes = walkMinutes;
        this.closingTime = closingTime;
    }

    public String getName() { return name; }
    public double getAveragePrice() { return averagePrice; }
    public int getWalkMinutes() { return walkMinutes; }
    public String getClosingTime() { return closingTime; }

    @Override
    public String toString() {
        return name + " - $" + String.format("%.2f", averagePrice) + 
               " | " + walkMinutes + " min walk | Closes at " + closingTime;
    }
}
