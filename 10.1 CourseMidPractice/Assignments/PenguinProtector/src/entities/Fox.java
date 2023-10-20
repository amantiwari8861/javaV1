package entities;

import java.util.ArrayList;

public class Fox extends Predator {
    private Integer noOfChicksKilled;
    private Integer noOfEggsKilled;
    private Boolean isAlive;

    public Fox() {
        noOfChicksKilled = 0;
        noOfEggsKilled = 0;
        isAlive = true;
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
        if (noOfChicksKilled < 0) {
            System.out.println("no. of chicks killed can't be negative!");
            return;
        }
        this.noOfChicksKilled = noOfChicksKilled;
    }

    public Integer getNoOfEggsKilled() {
        return noOfEggsKilled;
    }

    public void setNoOfEggsKilled(Integer noOfEggsKilled) {
        if (noOfEggsKilled < 0) {
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

    public void killChick(PenguinFamily pFamily, Chick c) {
        ArrayList<Chick> chicks = pFamily.getChicks();
        if (chicks != null) {
            for (int i = 0; i < chicks.size(); i++) {
                if (chicks.get(i) == c) {
                    chicks.get(i).setIsChickAlive(false);
                    noOfChicksKilled++;
                    // System.out.println("Killed "+chicks.get(i)+" by fox ");
                }
            }
        }
    }

    public void eatEgg(PenguinFamily pFamily, Egg e) {
        ArrayList<Egg> eggs = pFamily.getEggs();
        if (eggs != null) {
            for (int i = 0; i < eggs.size(); i++) {
                if (eggs.get(i) == e) {
                    eggs.get(i).setIsEaten(true);
                    // System.out.println("Killed "+eggs.get(i)+" by fox ");
                    noOfEggsKilled++;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Fox [noOfChicksKilled=" + noOfChicksKilled + ", noOfEggsKilled=" + noOfEggsKilled + ", isAlive="
                + isAlive + "]";
    }
}
