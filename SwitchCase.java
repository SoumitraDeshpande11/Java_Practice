import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        System.out.println("The operations are:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.print("Enter operator number: ");
        int operator = sc.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int mod = a % b;

        switch (operator) {
            case 1:
                System.out.println("Sum: " + sum);
                break;
            case 2:
                System.out.println("Subtraction: " + sub);
                break;
            case 3:
                System.out.println("Multiplication: " + mul);
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                System.out.println("Modulus: " + mod);
                break;
            default:
                System.out.println("Wrong operator");
        }
    }
}
