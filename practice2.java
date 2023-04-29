


class employee
{
    int id;
    String name;

    public void print()
    {
        System.out.println("id: " + id + "\t name: " + name );
    }
}

public class practice2 {
    public static void main(String[] args) {
      
        employee harry = new employee();

        harry.id=1;
        harry.name= "rishabh";
        harry.print();
        
    }
        
    
}
