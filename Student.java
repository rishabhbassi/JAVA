class Student{
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee)
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display()
    {
        System.out.println("rollno= " + rollno + "      name= " + name + "       fee= " + fee);
    }

    
    
        public static void main(String[] args)
        {
        Student s1 = new Student ( 1,"rishabh",1000f) ;
        Student s2 = new Student (2,"bassi",2000f);

        s1.display();
        s2.display();
        }
    
}