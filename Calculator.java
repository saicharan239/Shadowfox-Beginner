package Beginner;


import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Console Calculator!");
            System.out.println("Select an option:");
            System.out.println("1. Basic Arithmetic");
            System.out.println("2. Scientific Calculations");
            System.out.println("3. Unit Conversions");
            System.out.println("4. Exit");
            System.out.println("Enter choice (1/2/3/4): ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    basicArithmetic(sc);
                    break;
                case 2:
                    scientificCalculations(sc);
                    break;
                case 3:
                    unitConversions(sc);
                    break;
                case 4:
                    System.out.println("Thank you.Byee!!!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid, please try again.");
            }
        }
    }

    private static void basicArithmetic(Scanner sc) {
        System.out.println("\nBasic Arithmetic Operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter choice (1/2/3/4): ");

        int choice = sc.nextInt();
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + a + " + " + b + " = " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + a + " - " + b + " = " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + a + " * " + b + " = " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result: " + a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid.");
        }
    }

    private static void scientificCalculations(Scanner sc) {
        System.out.println("\nScientific Calculator:");
        System.out.println("1. Square Root");
        System.out.println("2. Exponentiation");
        System.out.println("Enter choice (1/2): ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter number: ");
                double c = sc.nextDouble();
                if (c >= 0) {
                    System.out.println("Result: sqrt(" + c + ") = " + Math.sqrt(c));
                } else {
                    System.out.println("Square root of a negative number is not allowed.");
                }
                break;
            case 2:
                System.out.println("Enter base number: ");
                double base = sc.nextDouble();
                System.out.println("Enter exponent: ");
                double exp = sc.nextDouble();
                System.out.println("Result: " + base + " ^ " + exp + " = " + Math.pow(base, exp));
                break;
            default:
                System.out.println("Invalid.");
        }
    }

    private static void unitConversions(Scanner sc) {
        System.out.println("\nUnit Conversions:");
        System.out.println("1. Temperature");
        System.out.println("2. Currency");
        System.out.println("Enter choice (1/2): ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                temperatureConversion(sc);
                break;
            case 2:
                currencyConversion(sc);
                break;
            default:
                System.out.println("Invalid.");
        }
    }

    private static void temperatureConversion(Scanner sc) {
        System.out.println("\nTemperature Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Enter choice (1/2): ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Result: " + celsius + " °C = " + fahrenheit + " °F");
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit: ");
                fahrenheit = sc.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Result: " + fahrenheit + " °F = " + celsius + " °C");
                break;
            default:
                System.out.println("Invalid.");
        }
    }

    private static void currencyConversion(Scanner sc) {
        double usdToEurRate = 0.85;
        double eurToUsdRate = 1.18;

        System.out.println("\nCurrency Conversion:");
        System.out.println("1. USD to EUR");
        System.out.println("2. EUR to USD");
        System.out.println("Enter choice (1/2): ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter amount in USD: ");
                double usd = sc.nextDouble();
                double eur = usd * usdToEurRate;
                System.out.println("Result: " + usd + " USD = " + eur + " EUR");
                break;
            case 2:
                System.out.println("Enter amount in EUR: ");
                eur = sc.nextDouble();
                usd = eur * eurToUsdRate;
                System.out.println("Result: " + eur + " EUR = " + usd + " USD");
                break;
            default:
                System.out.println("Invalid.");
        }
    }
}
