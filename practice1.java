public class practice1 {
    
    
    static int check(int x, int y )
    {
        int z=0;

        if(x>y)
        {
            z=x+y;
        }
        else
        {
            if(y>x)
            {
                z=(x+y)*5;
            }
        }
        return z;
    }

    public static void main(String[] args)
    {
        int a=3;
        int b=2;
        int c; 
        c= check(a,b);
        int a1=2;
        int b1=3;
        int c1;
        c1= check(a1,b1);

        System.out.println(c);
        System.out.println(c1);
    }
    
}
