import java.util.Scanner;

class Cafe 
{
    int regNo;
    long phoneNo;
    String drinks[];
    String foods[];
    boolean isOpen;
    double rent;
    Scanner sc=new Scanner(System.in);

    Cafe()
    {
        drinks=new String[]{"Mojito","Mango Shake","Coffee","Cold drink","tea","Oreo shake","Chocolate shake","vanila shake"};
        foods=new String[]{"Burger","Sandwitch","pasta","Wrap","pizza","noodles","manchurian","haka noodles","momos","chilly potato"};
    }
    void openCafe()
    {
        isOpen=true;
    }
    void closeCafe()
    {
        isOpen=false;
    }
    void orderFood()
    {
        if (isOpen) 
        {
            System.out.println("\t==========   MENU  ==================");
            System.out.println("\tFoods \t\t\t Drinks");
            System.out.println("\t------\t\t\t---------");
            for (int i = 0; true ; i++) 
            {
                if(foods.length > i)
                {
                    if(i>=drinks.length)
                    System.out.printf("\t%-25s\n",foods[i]);
                    else
                    System.out.printf("\t%-25s",foods[i]);

                }
                if(drinks.length > i)
                {
                    if(i>=foods.length)
                        System.out.printf("\t%-24s %-25s\n","",drinks[i]);
                    else
                        System.out.println(drinks[i]);
                }
                if (i>foods.length && i>drinks.length) 
                {
                    break;
                }
            }
            System.out.println("\t======================================");
            System.out.println("pls Give Order :");
            String order=sc.nextLine();

            System.out.println("your order of "+order+" is confirmed pls wait 10 mins");

        }
        else
        {
            System.out.println("Sorry Sir Cafe Timing is 10am to 11pm");
        }
    }


}
public class CafeSystem {

    public static void main(String[] args) {
        
        Cafe cafe=new Cafe();
        cafe.orderFood();
        cafe.openCafe();
        cafe.orderFood();
        // cafe.closeCafe();
        // cafe.orderFood();

    }
}