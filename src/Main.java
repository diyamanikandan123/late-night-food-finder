package src;

import java.util.List;
import java.util.Scanner;

/**
 * Main console interface for Late-Night Food Finder.
 * Manages user input prompts and safe error handling.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<FoodSpot> allSpots = FoodRepository.getInitialSpots();

        System.out.println("=== Late-Night Food Finder (Purdue MVP) ===");

        // Safe budget prompt using try/catch to prevent crashes on invalid text
        double maxBudget = -1;
        while (maxBudget < 0) {
            System.out.print("Enter your maximum budget (e.g., 15.00): ");
            String input = scanner.nextLine().trim();
            try {
                maxBudget = Double.parseDouble(input);
                if (maxBudget < 0) {
                    System.out.println("Budget cannot be negative. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter a valid amount.");
            }
        }

        // Safe walking time prompt using try/catch
        int maxWalk = -1;
        while (maxWalk < 0) {
            System.out.print("Enter your maximum walking time in minutes (e.g., 10): ");
            String input = scanner.nextLine().trim();
            try {
                maxWalk = Integer.parseInt(input);
                if (maxWalk < 0) {
                    System.out.println("Walking time cannot be negative. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer format. Please enter a valid number of minutes.");
            }
        }

        // Run filter logic
        List<FoodSpot> results = FoodFilter.filterByBudgetAndWalkTime(allSpots, maxBudget, maxWalk);

        // Display results
        System.out.println("\n--- Matching Late-Night Spots ---");
        if (results.isEmpty()) {
            System.out.println("No late-night spots matched your budget and walk time.");
        } else {
            for (FoodSpot spot : results) {
                System.out.println("- " + spot);
            }
        }

        scanner.close();
    }
}
