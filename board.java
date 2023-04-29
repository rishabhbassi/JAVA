import java.util.Scanner;

public class board {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter Maths marks out of 100");
        float Maths=sc.nextFloat();
        System.out.println("enter Science marks out of 100");
        float Science=sc.nextFloat();
        System.out.println("enter Eng marks out of 100");
        float English=sc.nextFloat();
        System.out.println("enter Hindi marks out of 100");
        float Hindi=sc.nextFloat();
        System.out.println("enter SKT marks out of 100");
        float SKT=sc.nextFloat();

        float percentage = (Maths+Science+English+Hindi+SKT)/5;
        System.out.println("Percentage="+ percentage+"%");


    }
    
}
