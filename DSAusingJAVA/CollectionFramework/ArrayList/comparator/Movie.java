public class Movie
{
    private String name;
    private Integer year;
    private Float ratings;
 
    public Movie(){}

    public Movie(String name, Integer year, Float ratings)
    {
        this.name = name;
        this.year = year;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Float getRatings() {
        return ratings;
    }

    public void setRatings(Float ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Movie [name=" + name + ", year=" + year + ", ratings=" + ratings + "]";
    }
}
