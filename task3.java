// ===========================================
// TASK 3 - Even Odd Checker
// ===========================================

import java.util.Scanner;

public class Task3 {

    // ===========================================
    // Q1 - Even/Odd Checker
    // ===========================================
    static void evenOddChecker(Scanner sc) {

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(number + " is " + result);
    }

    // ===========================================
    // Q2 - Negative Number Handling
    // ===========================================
    static void negativeNumberHandling() {

        int[] numbers = {-4, -7};

        System.out.println("\nNegative Number Handling:");

        for (int num : numbers) {
            String result = (num % 2 == 0) ? "Even" : "Odd";
            System.out.println(num + " is " + result);
        }
    }

    // ===========================================
    // Q3 - Zero Case Validation
    // ===========================================
    static void zeroValidation() {

        int number = 0;

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("\n0 is " + result);
    }

    // ===========================================
    // Q4 - Bitwise Even/Odd Check
    // ===========================================
    static void bitwiseCheck(Scanner sc) {

        System.out.print("\nEnter an integer: ");
        int number = sc.nextInt();

        String result = ((number & 1) == 0) ? "Even" : "Odd";

        System.out.println(number + " is " + result);
    }

    // ===========================================
    // Q5 - Input Validation
    // ===========================================
    static void inputValidation(Scanner sc) {

        System.out.print("\nEnter an integer: ");

        if (!sc.hasNextInt()) {
            System.out.println("Error: Integers only!");
            sc.next();
            return;
        }

        int number = sc.nextInt();

        System.out.println(number + " is " +
                ((number % 2 == 0) ? "Even" : "Odd"));
    }

    // ===========================================
    // Q6 - Debugging Exercise (Fixed Version)
    // ===========================================
    static void debuggingExercise(Scanner sc) {

        System.out.print("\nEnter an integer: ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(num + " is " + result);
    }

    // ===========================================
    // Q7 - Recursive Even/Odd Check
    // ===========================================
    static String recursiveCheck(int n) {

        if (n == 0)
            return "Even";

        if (n == 1 || n == -1)
            return "Odd";

        if (n > 0)
            return recursiveCheck(n - 2);

        return recursiveCheck(n + 2);
    }

    // ===========================================
    // Q8 - Batch Processing
    // ===========================================
    static void batchProcessing() {

        int[] numbers = {3, 8, 15, 22};

        System.out.println("\nBatch Processing:");

        for (int num : numbers) {
            System.out.println(num + " : " +
                    ((num % 2 == 0) ? "Even" : "Odd"));
        }
    }

    // ===========================================
    // Main Method
    // ===========================================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        evenOddChecker(sc);
        negativeNumberHandling();
        zeroValidation();
        bitwiseCheck(sc);
        inputValidation(sc);
        debuggingExercise(sc);

        System.out.println("\nRecursive Check:");
        System.out.println("11 is " + recursiveCheck(11));
        System.out.println("-8 is " + recursiveCheck(-8));

        batchProcessing();

        sc.close();
    }
}