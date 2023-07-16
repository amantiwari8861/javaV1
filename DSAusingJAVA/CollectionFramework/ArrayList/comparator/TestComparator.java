import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TestComparator {
    public static void main(String[] args) {
        
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie("Mission Impossible", 2023, 4.7f));
        movies.add(new Movie("mission Impossible 2.0", 2021, 3.7f));
        movies.add(new Movie("Mission Impossible 3.0", 2022, 2.7f));
        movies.add(new Movie("Mission Impossible 3.0", 1999, 5.0f));
        Movie m=new Movie("Tu jhuthi mai makkar", 2023, 4.9f);
        movies.add(m);
        movies.add(2,new Movie("Ant Man and quantamania", 2023, 4.6f));

        Scanner sc=new Scanner(System.in);
        System.out.println("1.Sort By Name");
        System.out.println("2.Sort By Ratings");
        System.out.println("3.Sort By Year");
        int choice=sc.nextInt();
        if (choice==1) 
        {
            // Collections.sort(movies, new SortByName());
            Collections.sort(movies,(e1,e2) -> ((Movie)e2).getName().compareTo(((Movie)e1).getName()));
        }
        else if(choice==2)
        {
            Collections.sort(movies, new SortByRating());   
        }
        else if(choice==3)
        {
            Collections.sort(movies, new SortByYear());
        }

        for (int i = 0; i < movies.size(); i++)
        {
            Movie temp=movies.get(i);
            System.out.println("======================================");
            System.out.println("Movie Name "+temp.getName());
            System.out.println("Movie Year "+temp.getYear());
            System.out.println("Movie Ratings "+temp.getRatings());
        }


    }
}
class SortByName implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        // System.out.println(((Movie)o1).getName()+ " : "+((Movie)o2).getName());
        return ((Movie)o1).getName().compareTo(((Movie)o2).getName());
    }
}
class SortByRating implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        if( ((Movie)o1).getRatings() > ((Movie)o2).getRatings())
        {
            return 1;
        }
        if( ((Movie)o1).getRatings() < ((Movie)o2).getRatings())
        {
            return -1;
        }
        return 0;
    }

}

class SortByYear implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        if( ((Movie)o1).getYear() > ((Movie)o2).getYear())
        {
            return 1;
        }
        if( ((Movie)o1).getYear() < ((Movie)o2).getYear())
        {
            return -1;
        }
        return 0;
    }

}