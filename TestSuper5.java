class Person{  
int id;  
String name;  
Person(int id,String name){  
this.id=id;  
this.name=name;//instance variable  
// System.out.println("the id and name is "+id+" "+name);
}  
}
class Students extends Person{  
float fee;
Students(int id,String name,float fee){  
super(id,name);//reusing parent constructor  
this.fee=fee;  
}  
void display(){System.out.println(id+" "+name+" "+fee);} 
}

class TestSuper5{  
public static void main(String[] args){  
Students e1=new Students(1,"Aman",50000f);
e1.display();  
}}