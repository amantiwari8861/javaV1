public class SIOOBEX {

    public static void main(String[] args) {
        
        // String str="Hii";
        // System.out.println(str.substring(-5));

        // String s=null;
        // s.length();

        // int arr[]={10,29};
        // arr[4]=67;

        // int num=10/0;
        // System.out.println(num);
        // System.out.println(10/0);

        Child c=new Child();
        Parent p=new Parent();
        c=(Child)p;

    }
}
class Parent{}
class Child extends Parent{}