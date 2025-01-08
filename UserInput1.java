import java.util.Scanner;
public class UserInput1
{
    public static void main(String srg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer number : ");
        int i = sc.nextInt();
        System.out.println("int i : "+i);
        System.out.print("Enter an float number : ");
        float f = sc.nextFloat();
        System.out.println("float f  : "+f);
        System.out.print("Enter an double number : ");
        double d = sc.nextDouble();
        System.out.println("double d : "+d);

        System.out.print("Enter an string : ");
        String s = sc.next();
        System.out.println("string "+s);
        sc.close();


    
    }
} 