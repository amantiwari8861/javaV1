public class Fruit
{
    String name;
    double price;
    double avgProtien;
    String vitamins[];
    String species;
    Seed seed;

    Fruit(String name, double price, double avgProtien, String[] vitamins, String species, Seed seed) 
    {
        this.name = name;
        this.price = price;
        this.avgProtien = avgProtien;
        this.vitamins = vitamins;
        this.species = species;
        this.seed = seed;
    }

    void showDetails()
    {
        System.out.println("   ------  "+name+" Details  --------  ");
        System.out.println("Price : "+price);
        System.out.println("Average Protein : "+avgProtien);
        System.out.print("Vitamins List:[");
        for (int i = 0; i < vitamins.length; i++) 
        {
            System.out.print(vitamins[i]+",");
        }
        System.out.println("\b ]\nSpecies : "+species);
        System.out.println("No. Of Seeds : "+seed.noOfSeeds);
        System.out.println("is Eatable : "+seed.isEatable);
    }

}