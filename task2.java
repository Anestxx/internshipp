// ===========================================
// TASK 2 - Temperature Converter
// ===========================================

import java.util.Scanner;

class Temperature {

    private double celsius;

    public Temperature(double fahrenheit) {
        celsius = (fahrenheit - 32) * 5 / 9;
    }

    public double getCelsius() {
        return celsius;
    }
}

public class Task2 {

    // ===========================================
    // Q1 - Fahrenheit to Celsius
    // ===========================================
    static void fahrenheitToCelsius(Scanner sc) {

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Celsius = %.2f°C\n", celsius);
    }

    // ===========================================
    // Q2 - Celsius to Fahrenheit
    // ===========================================
    static void celsiusToFahrenheit(Scanner sc) {

        System.out.print("\nEnter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("Fahrenheit = %.2f°F\n", fahrenheit);
    }

    // ===========================================
    // Q3 - Input Validation
    // ===========================================
    static void inputValidation(Scanner sc) {

        System.out.print("\nEnter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        if (fahrenheit < -459.67) {
            System.out.println("Invalid Input! Temperature cannot be below absolute zero.");
            return;
        }

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Celsius = %.2f°C\n", celsius);
    }

    // ===========================================
    // Q4 - Fahrenheit to Kelvin
    // ===========================================
    static void fahrenheitToKelvin(Scanner sc) {

        System.out.print("\nEnter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;

        System.out.printf("Kelvin = %.2f K\n", kelvin);
    }

    // ===========================================
    // Q5 - Multiple Conversions using Loop
    // ===========================================
    static void multipleConversions(Scanner sc) {

        char choice;

        do {

            System.out.print("\nEnter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.printf("Celsius = %.2f°C\n", celsius);

            System.out.print("Convert another? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }

    // ===========================================
    // Q6 - Debugging Exercise (Fixed Version)
    // ===========================================
    static void debuggingExercise() {

        double f = 100;

        double c = (f - 32) * 5 / 9.0;

        System.out.printf("\n%.1f°F = %.1f°C\n", f, c);
    }

    // ===========================================
    // Q7 - OOP Implementation
    // ===========================================
    static void oopVersion(Scanner sc) {

        System.out.print("\nEnter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        Temperature temp = new Temperature(fahrenheit);

        System.out.printf("Celsius = %.2f°C\n", temp.getCelsius());
    }

    // ===========================================
    // Main Method
    // ===========================================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        fahrenheitToCelsius(sc);
        celsiusToFahrenheit(sc);
        inputValidation(sc);
        fahrenheitToKelvin(sc);
        multipleConversions(sc);
        debuggingExercise();
        oopVersion(sc);

        sc.close();
    }
}