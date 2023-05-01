import java.util.Scanner;
import java.util.Arrays;

class Cafe 
{
    int regNo;
    long phoneNo;
    boolean isOpen;
    double rent;
    Scanner sc = new Scanner(System.in);
    Items foods[];
    Items drinks[];

    Cafe() 
    {
        String shakesName[] ={ "Mojito", "Mango Shake", "Coffee", "Cold drink", "tea", "Oreo shake",
                "Chocolate shake", "vanila shake" };
        String snacksName[] = new String[]{ "Burger", "Sandwitch", "pasta", "Wrap", "pizza", "noodles", "manchurian",
                "haka noodles", "momos", "chilly potato" };

        drinks = new Items[shakesName.length];
        foods = new Items[snacksName.length];

        for (int i = 0; i < drinks.length; i++) 
        {
            drinks[i] = new Items(shakesName[i], 30 + i, new String[] { "Chocolate" });
        }
        
        for (int i = 0; i < snacksName.length; i++) {
            foods[i] = new Items(snacksName[i], 60 + i, new String[] { "Chocolate" });
        }
    }

    void openCafe() {
        isOpen = true;
    }

    void closeCafe() {
        isOpen = false;
    }

    void orderFood() {
        if (isOpen) {
            showMenu();
            System.out.println("pls Give Order (use , for multiple orders) :");
            String order = sc.nextLine();

            String orders[] = order.split(",");
            int foodsLen = foods.length;
            int drinksLen = drinks.length;
            double amount=0;
            for (int i = 0; i < ((foodsLen > drinksLen) ? foodsLen : drinksLen); i++) 
            {
                for (int j = 0; j < orders.length; j++) 
                {
                    if (foodsLen > i) 
                    {
                        if (foods[i].name.equalsIgnoreCase(orders[j])) 
                        {
                            System.out.println("The price of " + foods[i].name + " is " + foods[i].price);
                            amount+=foods[i].price;
                        }
                    }
                    if (drinksLen > i) 
                    {
                        if (drinks[i].name.equalsIgnoreCase(orders[j])) 
                        {
                            System.out.println("The price of " + drinks[i].name + " is " + drinks[i].price);
                            amount+=drinks[i].price;
                        }
                    }
                }
            }

            System.out.println("your order of " + Arrays.toString(orders)+" costs "+amount);


        } else {
            System.out.println("Sorry Sir Cafe Timing is 10am to 11pm");
        }
    }

    void showMenu() {
        System.out.println("\t==========   MENU  ==================");
        System.out.println("\t\tFoods \t\t\t\t Drinks");
        System.out.println("\t\t------\t\t\t\t---------");
        for (int i = 0; true; i++) {
            if (foods.length > i) {
                if (i >= drinks.length)
                    System.out.printf("\t%-20s %5.2f %5s\n", foods[i].name, foods[i].price, " ");
                else
                    System.out.printf("\t%-20s %5.2f %5s", foods[i].name, foods[i].price, " ");

            }
            if (drinks.length > i) {
                if (i >= foods.length)
                    System.out.printf("\t%-32s %-20s %5.2f\n ", "", drinks[i].name, drinks[i].price);
                else
                    System.out.printf(" %-20s %5.2f\n", drinks[i].name, drinks[i].price);
            }
            if (i > foods.length && i > drinks.length) {
                break;
            }
        }
        System.out.println("\t======================================");
    }

}

public class CafeSystemNew {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();
        cafe.orderFood();
        cafe.openCafe();
        cafe.orderFood();
        // cafe.closeCafe();
        // cafe.orderFood();
    }
}