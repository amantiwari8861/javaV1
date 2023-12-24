import java.util.Scanner;

class Product
{
    //instance variable 
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
    Scanner sc=new Scanner(System.in);

    void inputProductData()
    {
        System.out.print("Enter the product Id :");
        id=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the product name :");
        name=sc.nextLine();
        System.out.print("Enter the product price :");
        price=sc.nextDouble();
        // System.out.print("Enter the product quantity :");
        // quantity=sc.nextInt();
        // System.out.print("Enter the product height :");
        // height=sc.nextFloat();
        // System.out.print("Enter the product width :");
        // width=sc.nextFloat();
        // sc.nextLine();
        // System.out.print("Enter the product color :");
        // color=sc.nextLine();
        // System.out.print("is product expired :");
        // isExpired=sc.nextBoolean();
        // System.out.print("Enter the product quality :");
        // quality=sc.next().charAt(0);
    }
    void printProductDetails()
    {
        System.out.println("\n\t Product's Data are: ");
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
        System.out.println("Price :"+price);
        // System.out.println("Quantity :"+quantity);
        // System.out.println("isExpired ? :"+isExpired);
        // System.out.println("Color :"+color);
        // System.out.println("Quality :"+quality);
        // System.out.println("Height :"+height);
        // System.out.println("Width :"+width);
    }
}
public class ProductHandler2
{
    public static void main(String[] args) 
    {
        System.out.println("Enter 1st product details :");
        Product p=new Product();
        p.inputProductData();
        p.printProductDetails();


        System.out.println("Enter 2nd product details :");
        Product p2=new Product();
        p2.inputProductData();
        p2.printProductDetails();

        //100 product data 
   
    }
}

//H.w  enter 3 employees different type of details like employee id,name,phone no,salary,ismarried and print that details etc