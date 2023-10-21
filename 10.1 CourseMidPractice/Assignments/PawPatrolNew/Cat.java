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

    public int killChick(PenguinFamily pFamily, Chick c) {
        int chickskilled = 0;
        ArrayList<Chick> chicks = pFamily.getChicks();
        // System.out.println(chicks);
        if (chicks != null) {
            for (int i = 0; i < chicks.size(); i++) {
                if (chicks.get(i) == c) {
                    chicks.get(i).setIsChickAlive(false);
                    // System.out.println("Killed "+chicks.get(i)+" by cat ");
                    noOfChicksKilled++;
                    chickskilled++;
                }
            }
        }
        return chickskilled;
    }

    @Override
    public String toString() {
        return "Cat [noOfChicksKilled=" + noOfChicksKilled + ", isAlive=" + isAlive + "]";
    }

    // public int[] huntingByCat(PenguinFamily[] pFamilies, int patrolDogs) {
    //     double catProbability = (patrolDogs == 0) ? 0.04 : (patrolDogs == 1) ? 0.01 : 0.004;
    //     int countEaten[] = { 0, 0, 0, 0 };// malepenguin femalepenguin chick egg
    //     if (pFamilies != null) {
    //         for (PenguinFamily family : pFamilies) {
    //             if (getIsAlive()) {
    //                 if (family.getParents() != null) {
    //                     for (Penguin penguin : family.getParents()) {
    //                         if (penguin != null && penguin.getIsAlive()) {
    //                             if (Math.random() < catProbability) {
    //                                 if (penguin.getIsMale())
    //                                     countEaten[0] += killPenguin(family, penguin);
    //                                 else
    //                                     countEaten[1] += killPenguin(family, penguin);
    //                             }
    //                         }
    //                     }
    //                 }
    //                 if (family.getChicks() != null) {
    //                     for (Chick chick : family.getChicks()) {
    //                         if (chick != null && chick.getIsChickAlive()) {
    //                             if (Math.random() < catProbability) {
    //                                 countEaten[2] += killChick(family, chick);
    //                             }
    //                         }
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     return countEaten;
    // }

}
