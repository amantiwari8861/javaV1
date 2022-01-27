class Functions {  //class -> blueprint
// class is a set objects which shares a common structure and behaviour
//OOPs -> software development methodology which relates to real world
// System.out.print(" hello "); we can't do this
int num=10;// instance variable (Global variable)

void method()
{
    System.out.println(" num = "+num);
}
public static void main(String[] args) {
    
    System.out.println("hii i am main method");
    // method();
    Functions funObj=new Functions(); //shortcut to make object 
    Functions funObj2=new Functions(); //shortcut to make object 
    //here funObj is an reference variable
    // Functions obj;
    // obj=new Functions();  this is also valid
    funObj.method();
    funObj2.method();
    System.out.println(" num in funobj = "+funObj.num);
    System.out.println(" num in funobj2 = "+funObj2.num);

}
    
}
// void fxn() we can't do this
// {
//     System.out.println("hii");
// }