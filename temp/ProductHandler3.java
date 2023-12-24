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
    String materials[];//reference variable of an array of type string
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
        sc.nextLine();
        materials=new String[4];
        System.out.print("Enter Materials :\n");
        for(int i=0;sc.hasNextLine();i++) 
        {
            String m=sc.nextLine();
            if(m.isEmpty())
                break;
            materials[i]=m;
        }    
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
        System.out.print("Materials :");
        for (int i = 0; i < materials.length; i++) 
        {
            if(materials[i]!=null)
            {
                System.out.print(materials[i]);
                if (i<materials.length-1 ) 
                {
                    if(materials[i+1]!=null)
                    {
                        System.out.print(",");
                    }
                }
            }
        }
        System.out.println();
        // System.out.println("Quantity :"+quantity);
        // System.out.println("isExpired ? :"+isExpired);
        // System.out.println("Color :"+color);
        // System.out.println("Quality :"+quality);
        // System.out.println("Height :"+height);
        // System.out.println("Width :"+width);
    }
}
public class ProductHandler3
{
    public static void main(String[] args) 
    {
        
        // structure array in c ?
        // structure < class (but both are similar)
        Product products[];
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no. of products :");
        int noOfProduct=sc.nextInt();

        products=new Product[noOfProduct];

        for (int i = 0; i < products.length; i++) 
        {
            System.out.println("\n\tEnter "+(i+1)+" product detail ");
            Product tempProduct=new Product();
            tempProduct.inputProductData();
            products[i]=tempProduct;
        }
        System.out.println("\n\tTotal "+products.length+" Products details :");
        for (int i = 0; i < products.length; i++) 
        {
            products[i].printProductDetails();
        }
    }
}

//H.w  enter n employees different type of details like employee id,name,phone no,salary,ismarried,skills[] and print that details etc