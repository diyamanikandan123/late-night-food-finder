package src;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<FoodSpot> allSpots = FoodRepository.getInitialSpots();

        System.out.println("=== Purdue Late-Night Food Finder ===");

        double maxBudget = getValidDouble(scanner, "Enter your max budget ($): ");
        int maxWalkMinutes = getValidInt(scanner, "Enter max walking time (minutes): ");

        System.out.print("Dietary preference (Vegetarian, Halal, or Any): ");
        String dietaryPreference = scanner.nextLine().trim();
        if (dietaryPreference.isEmpty()) {
            dietaryPreference = "Any";
        }

        List<FoodSpot> results = FoodFilter.filterSpots(allSpots, maxBudget, maxWalkMinutes, dietaryPreference);

        System.out.println("\n--- Matching Late-Night Food Spots ---");
        if (results.isEmpty()) {
            System.out.println("No late-night spots matched your criteria.");
        } else {
            for (FoodSpot spot : results) {
                System.out.println(spot);
            }
        }

        scanner.close();
    }

    private static double getValidDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                double value = Double.parseDouble(input);
                if (value < 0) {
                    System.out.println("Please enter a positive amount.");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number (e.g., 10.50).");
            }
        }
    }

    private static int getValidInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                int value = Integer.parseInt(input);
                if (value < 0) {
                    System.out.println("Please enter a positive number of minutes.");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number (e.g., 10).");
            }
        }
    }
}