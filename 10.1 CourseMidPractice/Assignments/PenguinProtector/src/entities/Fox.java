package entities;

public class Fox extends Predator
{
    private Integer noOfChicksKilled;
    private Integer noOfEggsKilled;
    private Boolean isAlive;
    public Fox() {
    }
    public Fox(Integer noOfChicksKilled, Integer noOfEggsKilled, Boolean isAlive) {
        this.noOfChicksKilled = noOfChicksKilled;
        this.noOfEggsKilled = noOfEggsKilled;
        this.isAlive = isAlive;
    }
    public Integer getNoOfChicksKilled() {
        return noOfChicksKilled;
    }
    public void setNoOfChicksKilled(Integer noOfChicksKilled) {
        if (noOfChicksKilled<0) {
            System.out.println("no. of chicks killed can't be negative!");
            return;
        }
        this.noOfChicksKilled = noOfChicksKilled;
    }
    public Integer getNoOfEggsKilled() {
        return noOfEggsKilled;
    }
    public void setNoOfEggsKilled(Integer noOfEggsKilled) {
        if (noOfEggsKilled<0) {
            System.out.println("no. of eggs killed can't be negative!");
            return;
        }
        this.noOfEggsKilled = noOfEggsKilled;
    }
    public Boolean getIsAlive() {
        return isAlive;
    }
    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }
    @Override
    public String toString() {
        return "Fox [noOfChicksKilled=" + noOfChicksKilled + ", noOfEggsKilled=" + noOfEggsKilled + ", isAlive="
                + isAlive + "]";
    }
}
