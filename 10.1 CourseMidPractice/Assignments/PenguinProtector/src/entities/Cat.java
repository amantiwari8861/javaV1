package entities;

import java.util.ArrayList;

public class Cat extends Predator {
    private Integer noOfChicksKilled;
    private Boolean isAlive;

    public Cat() {
        noOfChicksKilled = 0;
        isAlive = true;
    }

    public Cat(Integer noOfChicksKilled, Boolean isAlive) {
        this.noOfChicksKilled = noOfChicksKilled;
        this.isAlive = isAlive;
    }

    public Integer getNoOfChicksKilled() {
        return noOfChicksKilled;
    }

    public void setNoOfChicksKilled(Integer noOfChicksKilled) {
        if (noOfChicksKilled < 0) {
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

    public void killChick(PenguinFamily pFamily, Chick c) {
        ArrayList<Chick> chicks = pFamily.getChicks();
        // System.out.println(chicks);
        if (chicks != null) {
            for (int i = 0; i < chicks.size(); i++) {
                if (chicks.get(i) == c) {
                    chicks.get(i).setIsChickAlive(false);
                    // System.out.println("Killed "+chicks.get(i)+" by cat ");
                    noOfChicksKilled++;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Cat [noOfChicksKilled=" + noOfChicksKilled + ", isAlive=" + isAlive + "]";
    }
}
