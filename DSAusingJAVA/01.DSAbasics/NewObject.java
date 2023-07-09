class Movie
{
    String name;
    int year;
    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }
    void showDetails()
    {
        System.out.println("Movie name : "+name);
        System.out.println("Year Release :"+year);
    }
}
class NewObject
{
    public static void main(String[] args) {
        
        // Movie mv=new Movie("Wakanda forever", 2022);
        // Movie mv;
        // mv=new Movie("Wakanda forever", 2022);
        // mv.showDetails();

        // Movie mv; //reference variable
        // Note : new Movie("Avengers Endgame", 2019);//object
        new Movie("Avengers Endgame", 2019).showDetails();//only 1 time use

    }
}