import java.util.Scanner;
public class searching {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements");
        n = sc.nextInt();

        int []marks = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("enter element " + i);
            marks[i]=sc.nextInt();
        }
        
        System.out.println("enter element you want to check");
        int ele = sc.nextInt();

        for(i=0;i<n;i++)
        {
            if(ele==marks[i])
            {
                System.out.println("present");
                break;
            }
    
        }
    }
    
}
