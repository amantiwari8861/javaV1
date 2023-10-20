package entities;

public class Pawpatrol 
{
    private Integer noOfDogs;
    double successProbability;
    public Pawpatrol(){}
    
    public Pawpatrol(Integer noOfDogs) 
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

    public void killFoxes(Fox foxes[]) 
    {
        if (foxes != null) {
            for (Fox fox2 : foxes) {
                if (Math.random() <= successProbability) {
                    fox2.setIsAlive(false);
                    // System.out.println("Fox killed!");
                }
                //  else {
                    // System.out.println("Fox survived.");
                // }
            }
        }
    }
    public void killCats(Cat cats[]) 
    {
        if (cats!=null) {
            for (Cat cat2 : cats) {
                if (Math.random() <= successProbability) {
                    cat2.setIsAlive(false);
                    // System.out.println("cat killed!");
                } 
                // else {
                    // System.out.println("cat survived.");
                // }
            }
        }
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
