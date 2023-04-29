import java.util.Scanner;
public class AR 

{
    public static void main(String[] args)
    {
        int [] marks ;
        Scanner sc = new Scanner(System.in);
        int n;
        n= sc.nextInt();

        marks=new int[n];

        for(int i=0 ;i<n;i++)
        {
            marks[i]=sc.nextInt();
        }

        System.out.println("array \n" );

        for(int i=0 ;i<n;i++)
        {
            System.out.println(marks[i]);
        }
    }
    
}
    

