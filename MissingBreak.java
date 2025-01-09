

public class MissingBreak {
    public static void main(String args[]){
        for(int i =0;i<12;i++){
            switch(i){
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("the number is less than 4 ");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("the number si less than 9");
                    break;
                case 10:
                case 11:
                    System.out.println("the number si less than 11");
                    break;
                default :
                System.out.println("the number si greater than 11");


            }
        }

    }
    
}
