import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class TestArrayList
{
    public static void main(String[] args) {
        
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie("Mission Impossible", 2023, 4.7f));
        movies.add(new Movie("mission Impossible 2.0", 2023, 3.7f));
        movies.add(new Movie("Mission Impossible 3.0", 2023, 2.7f));
        movies.add(new Movie("Mission Impossible 3.0", 2023, 5.0f));
        Movie m=new Movie("Tu jhuthi mai makkar", 2023, 4.9f);
        movies.add(m);
        // movies.add(m);
        movies.add(2,new Movie("Ant Man and quantamania", 2023, 4.6f));

        Collections.sort(movies);
        for (int i = 0; i < movies.size(); i++)
        {
            Movie temp=movies.get(i);
            // System.out.println(temp);
            System.out.println("======================================");
            System.out.println("Movie Name "+temp.getName());
            System.out.println("Movie Year "+temp.getYear());
            System.out.println("Movie Ratings "+temp.getRatings());
        }
        // for (Movie movie : movies) 
        // {
        //     System.out.println(movie);
        // }
        // movies.forEach(movie->System.out.println(movie));
        // movies.forEach(System.out::println);

        // Iterator<Movie> mvs=movies.iterator();
        // while (mvs.hasNext()) 
        // {
        //     System.out.println(mvs.next());    
        // }

        // ListIterator<Movie> movs=movies.listIterator();
        // while (movs.hasNext()) 
        // {
        //     System.out.println(movs.next());
        // }

        // ListIterator<Movie> movs=movies.listIterator(movies.size());
        // while (movs.hasPrevious()) 
        // {
        //     System.out.println(movs.previous());
        // }

        // boolean isAvailable=movies.contains(new Movie("Mission Impossible 3.0", 2023, 4.7f));
        // boolean isAvailable=movies.contains(new Movie("Tu jhuthi mai makkar", 2023, 4.9f));
        // boolean isAvailable=movies.contains(m);
        // System.out.println(isAvailable);

        // movies.add(2,new Movie("Ant Man and quantamania", 2023, 4.6f));

        // System.out.println(movies);

        // movies.remove(m);
        // movies.removeAll(List.of(m));
        // movies.forEach(movie->{
        //     System.out.println("=====Movie Details===========");
        //     System.out.println(movie);
        // });

        // List<String> names=List.of("AMan","Kashvi","Dev","Arun");
        // System.out.println(names);

    }
}