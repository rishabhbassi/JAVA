class one {
    int a ; //Instance variable
    static int k=20;// non static variable
    public void setvalue(int j) //method  of class one
    {
    a=j ;
}
    public static void main(String args[]) //static method
    {
        one o=new one();
        o.setvalue(5);
        System.out.println(o.a);
        System.out.println(k);
    }

    
}

