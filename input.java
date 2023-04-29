import java.util.Scanner;
public class input {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); // taking input from the keyboard.
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println(a);


        System.out.println("Enter a string");
        String str = sc.next();
        System.out.println(str);
        
        System.out.println("Enter a string");
        String str1 = sc.nextLine();
        System.out.println(str1);
    }

    
}
