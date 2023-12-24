import java.util.Scanner;

class Product
{
    int quantity;
    long id;
    float height;
    float width;
    double price;
    boolean isExpired;
    char quality;
    String name;
    String color;
    String material[];//reference variable of an array of type string

}
public class ProductHandler 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Product p=new Product();
        System.out.print("Enter the product Id :");
        p.id=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the product name :");
        p.name=sc.nextLine();
        System.out.print("Enter the product price :");
        p.price=sc.nextDouble();
        System.out.print("Enter the product quantity :");
        p.quantity=sc.nextInt();
        System.out.print("Enter the product height :");
        p.height=sc.nextFloat();
        System.out.print("Enter the product width :");
        p.width=sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter the product color :");
        p.color=sc.nextLine();
        System.out.print("is product expired :");
        p.isExpired=sc.nextBoolean();
        System.out.print("Enter the product quality :");
        p.quality=sc.next().charAt(0);


        System.out.println("\n\t Product's Data are: ");
        System.out.println("Id :"+p.id);
        System.out.println("Name :"+p.name);
        System.out.println("Price :"+p.price);
        System.out.println("Quantity :"+p.quantity);
        System.out.println("isExpired ? :"+p.isExpired);
        System.out.println("Color :"+p.color);
        System.out.println("Quality :"+p.quality);
        System.out.println("Height :"+p.height);
        System.out.println("Width :"+p.width);


        //other statement (500)



        sc.close();
    }
}