import java.util.Scanner;
public class encryption {
    public static void main(String[] args)
    {
        char grade;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a grade\n");
        grade = sc.next().charAt(0);
        grade = (char)(grade+8);
        System.out.printf("%c\n",grade);
    
    }
    
}
