import java.util.Scanner;
public class IfElse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month : ");
        int s = sc.nextInt();
   
        String season ;

        if (s == 12 || s== 1 || s == 2){
            season ="winter";

        }
        else if (s == 3 || s== 4 || s == 5){
            season ="Spring";

        }
        else if (s == 6 || s== 7 || s == 8){
            season ="Summer";
        }
        else if (s == 9 || s== 10 || s == 11){
            season ="Autumn";

        }
        else {
            season = "Bogus Month";
        }
        System.out.println("the season is : "+season);

        sc.close();

            
        

    }
    
}
