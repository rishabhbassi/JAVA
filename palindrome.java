import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter elements");
        int ele = sc.nextInt();

        int temp;
        temp=ele;
        int sum=0;

        while(ele>0)
        {
        int r=ele%10;
        sum = (sum*10)+r;
        ele=ele/10;
    }
    System.out.println(temp==sum);
    //if(temp==sum)
    //System.out.println("palindrome");
    //else
    //{
    //    System.out.println("not a palindrome");
    //}

}
}
