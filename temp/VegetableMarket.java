class Shop
{
    String ownerName;
    String shopName;
    String country="india";
    String itemPrice[]={"tomato:30","lady finger:50","potato:15","carrot:10"};

    //method : set of codes(statements) which together performs any task
    //2 types : 
        // 1.built in methods
        // 2.user-defined

    //constructor : it is a special type of method which is used to initialize the data members or member functions of a class

    // 1. no argument no return type
    // 2. no argument with return type
    // 3. with argument no return type
    // 4. with argument and return type

    void printOwnerName(/*argument or parameter*/)
    {
        System.out.println("Owner name is :"+ownerName);
    }
    String getLocatedCountry()
    {
        return country;
    }
    void setOwnerName(String owner)
    {
        ownerName=owner;
    }
    int getPriceOfItem(String item)
    {
        int price=0;
        for (int i = 0; i < itemPrice.length; i++) 
        {
            //carrot-30 startswith carrot ? false
            if (itemPrice[i].startsWith(item)) 
            {
    price=Integer.parseInt(itemPrice[i].substring(itemPrice[i].indexOf(":")+1));
            }
        }
        return price;
    }
}
public class VegetableMarket {

    public static void main(String[] args) {
        
        Shop s=new Shop();
        // s.printOwnerName();
        // String addr=s.getLocatedCountry();
        // System.out.println("Avinash's shop is located in "+addr);
        // s.setOwnerName("Avinash");
        // s.printOwnerName();
        String item="lady finger";
        int price=s.getPriceOfItem(item);
        System.out.println("the price of "+item+" is "+price+" Rs.");

        // System.out.println("carrot:10".indexOf(":"));
        // System.out.println("carrot:10".substring(6+1));

        // // int p="carrot:10".substring(6+1);
        // int p=Integer.parseInt("carrot:10".substring(6+1));
        // System.out.println(p);



    }
}