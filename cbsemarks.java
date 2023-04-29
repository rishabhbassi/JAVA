import java.util.Scanner;

public class cbsemarks 
{
    public static void main (String[] args)
    {
        Scanner c= new Scanner(System.in);
        
        System.out.println("Enter Marks in subject 1");
        int sub1 = c.nextInt();

        System.out.println("Enter Marks in subject 2");
        int sub2 = c.nextInt();

        System.out.println("Enter Marks in subject 3");
        int sub3 = c.nextInt();

        System.out.println("Enter Marks in subject 4");
        int sub4 = c.nextInt();

        System.out.println("Enter Marks in subject 5");
        int sub5 = c.nextInt();

        int perc;
        perc= (sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println("percentage is;");
        System.out.println(perc);

    }

    
}
