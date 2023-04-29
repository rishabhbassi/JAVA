import java.util.*;
public class Student3{  
int id;  
String name; 
float fee;

Student3(int id,String name){
    this.id=id;
    this.name=name;
}
Student3(int id,String name,float fee){
    this.id=id;
    this.name=name;
    this.fee=fee;
}



//method to display the value of id and name  
void display(){System.out.println(id+" "+name+" "+fee);}  

  
public static void main(String args[]){  
//creating objects  "
Student3 s1=new Student3(11,"risabh",1200f);  
Student3 s2=new Student3(13,"bassi",1330f);  
//displaying values of the object  
s1.display();  
s2.display();  
}  
}  

    

