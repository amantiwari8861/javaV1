class Parent
{
    int num;
    String name;
    Parent()
    {
        System.out.println("hello i am default constuctor ");
    }
    Parent(int num)
    {
        this();
        this.num=num;
        System.out.println("hello i am one parameterized constructor ");
    }
    Parent(int num,String name)
    {
        this(num);
        this.name=name;
        System.out.println("hello i am 2 parameterized constructor ");
        // show();
    }
    void show()
    {
        System.out.println("name : "+name+" num : "+num);
    }
}
public class Super5 {
    public static void main(String[] args) {
        Parent objParent=new Parent(10,"Aman Tiwari");
        objParent.show();
    }
}