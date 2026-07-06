// ===============================
// TASK 1
// Environment Setup & Basic Syntax
// ===============================

import java.util.*;

public class Task1 {

    // ===============================
    // Q1 - Hello World
    // ===============================
    static void helloWorld() {
        System.out.println("Hello World! JDK setup successful.");
    }

    // ===============================
    // Q2 - Temperature Converter
    // ===============================
    static void temperatureConverter(Scanner sc) {
        System.out.print("\nEnter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Temperature in Celsius = %.2f°C\n", celsius);
    }

    // ===============================
    // Q3 - Even Odd Checker
    // ===============================
    static void evenOddChecker(Scanner sc) {
        System.out.print("\nEnter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");
    }

    // ===============================
    // Q4 - Multiplication Table
    // ===============================
    static void multiplicationTable(Scanner sc) {
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // ===============================
    // Q5 - Digit Counter
    // ===============================
    static void digitCounter(Scanner sc) {
        System.out.print("\nEnter a number: ");
        int number = Math.abs(sc.nextInt());

        int count = 0;

        if (number == 0)
            count = 1;
        else {
            while (number != 0) {
                count++;
                number /= 10;
            }
        }

        System.out.println("Total Digits = " + count);
    }

    // ===============================
    // Q6 - Fibonacci Series
    // ===============================
    static void fibonacciSeries(Scanner sc) {
        System.out.print("\nEnter number of terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    // ===============================
    // Q7 - Prime Number Checker
    // ===============================
    static void primeChecker(Scanner sc) {
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();

        boolean prime = true;

        if (num <= 1)
            prime = false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");
    }

    // ===============================
    // Q8 - Day Finder
    // ===============================
    static void dayFinder(Scanner sc) {
        System.out.print("\nEnter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

    // ===============================
    // Q9 - Array Operations
    // ===============================
    static void arrayOperations() {

        int[] numbers = {5, 2, 9, 1, 5};

        int sum = 0;

        for (int n : numbers)
            sum += n;

        System.out.println("\nArray Elements:");

        for (int n : numbers)
            System.out.print(n + " ");

        System.out.println("\nSum = " + sum);
    }

    // ===============================
    // Q10 - Circle Operations
    // ===============================
    static void circleOperations(Scanner sc) {
        System.out.print("\nEnter radius: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.printf("Area = %.2f\n", area);
        System.out.printf("Circumference = %.2f\n", circumference);
    }

    // ===============================
    // Main Method
    // ===============================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        helloWorld();
        temperatureConverter(sc);
        evenOddChecker(sc);
        multiplicationTable(sc);
        digitCounter(sc);
        fibonacciSeries(sc);
        primeChecker(sc);
        dayFinder(sc);
        arrayOperations();
        circleOperations(sc);

        sc.close();
    }
}