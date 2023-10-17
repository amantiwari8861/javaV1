package entities;

public class Predator 
{
    Integer noOfPenguinKills;

    public Predator() {
    }

    public Predator(Integer noOfPenguinKills) {
        this.noOfPenguinKills = noOfPenguinKills;
    }

    public Integer getNoOfPenguinKills() {
        return noOfPenguinKills;
    }

    public void setNoOfPenguinKills(Integer noOfPenguinKills) {
        if (noOfPenguinKills<0) {
            System.out.println("no. of penguins killed can't be negative!");
            return;
        }
        this.noOfPenguinKills = noOfPenguinKills;
    }

    @Override
    public String toString() {
        return "Predator [noOfPenguinKills=" + noOfPenguinKills + "]";
    }
    
}
