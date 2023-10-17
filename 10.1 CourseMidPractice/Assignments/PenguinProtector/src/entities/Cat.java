package entities;

public class Cat extends Predator
{
    private Integer noOfChicksKilled;
    private Boolean isAlive;
    public Cat() {
    }
    public Cat(Integer noOfChicksKilled, Boolean isAlive) {
        this.noOfChicksKilled = noOfChicksKilled;
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
    public Boolean getIsAlive() {
        return isAlive;
    }
    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }
    @Override
    public String toString() {
        return "Cat [noOfChicksKilled=" + noOfChicksKilled + ", isAlive=" + isAlive + "]";
    }   
}
