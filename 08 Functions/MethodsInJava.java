class House
{
    String Address="Noida 62";
    public void paint(String color)
    {
        System.out.println("Painting the house: " + color);
    }
}
public class MethodsInJava {
    public static void main(String[] args) {
        
        House h = new House();
        //object is an instance(part) of a class
        // paint("yellow");
        h.paint("Red");
        // h.paint("Blue");
        // h.paint("Green");
        // System.out.println("Address: " + Address);
        System.out.println("Address: " + h.Address);

        House h1 = new House();
        h1.paint("Blue");
        System.out.println("Address: " + h1.Address);


    }
}