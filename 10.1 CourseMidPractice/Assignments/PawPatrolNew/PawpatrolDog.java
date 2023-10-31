public class PawpatrolDog 
{
    private Integer noOfDogs;
    double successProbability;
    public PawpatrolDog(){}
    
    public PawpatrolDog(Integer noOfDogs) 
    {
        this.noOfDogs = noOfDogs;
        if (noOfDogs == 1) {
            successProbability = 0.01;
        } else if (noOfDogs == 2) {
            successProbability = 0.1;
        } else {
            successProbability = 0;
        }
    }

    public int killFoxes(Fox foxes[]) 
    {
        int noOfFoxesKilled=0;
        if (foxes != null) {
            for (Fox fox2 : foxes) {
                if (Math.random() <= successProbability) {
                    fox2.setIsAlive(false);
                    noOfFoxesKilled++;
                    // System.out.println("Fox killed!");
                }
            }
        }
        return noOfFoxesKilled;
    }
    public int killCats(Cat cats[]) 
    {
        int noOfCatsKilled=0;
        if (cats!=null) {
            for (Cat cat2 : cats) {
                if (Math.random() <= successProbability) {
                    cat2.setIsAlive(false);
                    noOfCatsKilled++;
                    // System.out.println("cat killed!");
                }
            }
        }
        return noOfCatsKilled;
    }

    public Integer getNoOfDogs() {
        return noOfDogs;
    }

    public void setNoOfDogs(Integer noOfDogs) {
        this.noOfDogs = noOfDogs;
    }

    @Override
    public String toString() {
        return "Pawpatrol [noOfDogs=" + noOfDogs + ", successProbability=" + successProbability + "]";
    }
}
