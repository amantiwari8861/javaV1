//encapsulation 

public class set {

     //default - accesible in same folder
     //private - accesible only same class
     //public - access anywhere 
     //protected - accesible anywhere except (different folder not-child class)
     private int i=100;
     private void print() {
         System.out.println("hello i am private method ");
     }
}

class Main 
{
    public static void main(String[] args) {
        set obj=new set();
        obj.print();
        System.out.println("the value of i is  "+obj.i);
    }
}