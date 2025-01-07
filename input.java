import java.util.Scanner;

public class input {

    //taking input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);
        System.out.println("Mul: " + mul);
        System.out.println("Div: " + div);
        System.out.println("Mod: " + mod);
        sc.close();
    } 

    
}
    

