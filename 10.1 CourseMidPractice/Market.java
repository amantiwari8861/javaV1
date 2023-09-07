public class Market 
{
    public static void main(String[] args) 
    {
        // Fruit f1=new Fruit("Apple",120,3.4,new String[]{"C","A","D","K"},"kashmiri apple");
        // f1.showDetails();

        Fruit fruits[]=new Fruit[5];

        fruits[0]=new Fruit("Mango", 150, 4.2, new String[]{"A","D"},"langda",new Seed(1,false));
        fruits[1]=new Fruit("Apple",120,3.4,new String[]{"C","A","D","K"},"kashmiri apple",new Seed(4,false));
        fruits[2]=new Fruit("Mango", 120, 3.2, new String[]{"A","D"},"dussheri",new Seed(1,false));
        fruits[3]=new Fruit("Apple",80,3.8,new String[]{"C","A","D","K"},"green apple",new Seed(2,false));
        fruits[4]=new Fruit("Pomegranate",80,3.8,new String[]{"C","A","D","K"},"Saffron",new Seed(30,true));

        System.out.println("--------------------------- All Fruits Details -------------------------");
        for (Fruit fruit : fruits) 
        {
            fruit.showDetails();
        }
    }
    
}