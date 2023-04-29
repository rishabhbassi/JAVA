import java.util.Scanner;
public class twoarray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number or row and colouemns");
        int m = sc.nextInt();
        int n = sc.nextInt();

        
        int marks[][]= new int[m][n];

        int i , j;
        
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("enter element "+ i + j);
                marks[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("element " +i+j+  "is "+ marks[i][j]);
            }
        }

    }
    
}
