class Shape
{
    int height,width;
    String name;
    Shape(){
        System.out.println("hello i am default shape");
    }
    Shape(int height,int width){
        System.out.println("hello i am 2 parameterized shape");
        this.height=height;
        this.width=width;
    }
    Shape(int height,int width,String name){
        // this();
        this(height,width);
        this.name=name;
        System.out.println("hello i am 3 parameterized constructor");
    }
    void ShowDetails()
    {
        System.out.println("the height is "+height);
        System.out.println("the width is "+width);
        System.out.println("the name is "+name);
    }

}
public class ThisConst {
    public static void main(String[] args) {
      Shape obj=new Shape(2,4,"rectangle");
      obj.ShowDetails();
    }
}