package anomsconverter.userinterface;

import anomsconverter.converters.MetricConverter;
import anomsconverter.converters.TemperatureConverter;
import java.util.Scanner;

public class AnomsConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the AnomsConverter Tool!");
        System.out.println("Let's do some converting!");

        while (true) {
            System.out.println("\nPlease select a conversion type:");
            System.out.println("1. Temperature");
            System.out.println("2. Metric Units (Length/Weight)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            String choice = scanner.nextLine();
            
            if (choice.equals("1")) {
                handleTemperatureConversion(scanner);
            } else if (choice.equals("2")) {
                handleMetricConversion(scanner);
            } else if (choice.equals("3")) {
                System.out.println("Thanks for using the Anomsconverter!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
        scanner.close();
    }
    private static void handleTemperatureConversion(Scanner scanner) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("\nTemperature Conversion:");
        System.out.print("Enter the value: ");
        double value = getDoubleInput(scanner);

        System.out.print("Enter the initial unit (Celsius, Fahrenheit, Kelvin): ");
        String fromUnit = scanner.nextLine();

        System.out.print("Enter the target unit (Celsius, Fahrenheit, Kelvin): ");
        String toUnit = scanner.nextLine();

        double result = converter.convert(value, fromUnit, toUnit);

        if (result != -1) {
            System.out.printf("%.2f %s is equal to %.2f %s%n", value, fromUnit, result, toUnit);
        } else {
            System.out.println("Invalid temperature units. Please check your spelling.");
        }
    }

    private static void handleMetricConversion(Scanner scanner) {
        MetricConverter converter = new MetricConverter();
        System.out.println("\nMetric Conversion:");
        System.out.print("Enter the value: ");
        double value = getDoubleInput(scanner);

        System.out.print("Enter the initial unit (meters, kilometers, centimeters, millimeters, grams, kilograms): ");
        String fromUnit = scanner.nextLine();

        System.out.print("Enter the target unit (meters, kilometers, centimeters, millimeters, grams, kilograms): ");
        String toUnit = scanner.nextLine();

        double result = converter.convert(value, fromUnit, toUnit);

        if (result != -1) {
            System.out.printf("%.2f %s is equal to %.2f %s%n", value, fromUnit, result, toUnit);
        } else {
            System.out.println("Invalid metric units or incompatible conversion.");
        }
    }
    private static double getDoubleInput(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a numerical value: ");
            }
        }
    }
}