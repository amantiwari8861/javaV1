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

    public int killChick(PenguinFamily pFamily, Chick c) {
        int chicksKilled = 0;
        ArrayList<Chick> chicks = pFamily.getChicks();
        if (chicks != null) {
            for (int i = 0; i < chicks.size(); i++) {
                if (chicks.get(i) == c) {
                    chicks.get(i).setIsChickAlive(false);
                    noOfChicksKilled++;
                    chicksKilled++;
                    // System.out.println("Killed "+chicks.get(i)+" by fox ");
                }
            }
        }
        return chicksKilled;
    }

    public int eatEgg(PenguinFamily pFamily, Egg e) {
        int eggsKilled = 0;
        ArrayList<Egg> eggs = pFamily.getEggs();
        if (eggs != null) {
            for (int i = 0; i < eggs.size(); i++) {
                if (eggs.get(i) == e) {
                    eggs.get(i).setIsEaten(true);
                    // System.out.println("Killed "+eggs.get(i)+" by fox ");
                    noOfEggsKilled++;
                    eggsKilled++;
                }
            }
        }
        return eggsKilled;
    }

    // public int[] huntingByFox(PenguinFamily[] pFamily, int patrolDogs) 
    // {
    //     double foxProbability = (patrolDogs == 0) ? 0.08 : (patrolDogs == 1) ? 0.02 : 0.008;
    //     int countEaten[] = { 0, 0, 0, 0 };// malepenguin femalepenguin chick egg
    //     if (pFamily != null) {
    //         for (PenguinFamily family : pFamily) {
    //             Random rndm = new Random();
    //             if (getIsAlive()) {
    //                 if (family.getParents() != null) {
    //                     for (Penguin penguin : family.getParents()) {
    //                         if (penguin != null && penguin.getIsAlive()) {
    //                             int num = rndm.nextInt(100) + 1;
    //                             double randm;
    //                             // if (patrolDogs == 0)
    //                             //     randm = (num / 100.0) * rndm.nextInt(1);// Hiii
    //                             // else
    //                                 randm = (num / 100.0);
    //                             if (randm > 0 && randm < foxProbability) {
    //                                 // System.out.println("random :" + randm + " by fox " + foxProbability);
    //                                 if (penguin.getIsMale()) {
    //                                     countEaten[0] += killPenguin(family, penguin);
    //                                 } else {
    //                                     countEaten[1] += killPenguin(family, penguin);
    //                                 }
    //                             }
    //                         }
    //                     }
    //                 }
    //                 if (family.getChicks() != null) {
    //                     for (Chick chick : family.getChicks()) {
    //                         if (chick != null && chick.getIsChickAlive()) {
    //                             if (Math.random() < foxProbability) {
    //                                 countEaten[2] += killChick(family, chick);
    //                             }
    //                         }
    //                     }
    //                 }
    //                 if (family.getEggs() != null) {
    //                     for (Egg egg : family.getEggs()) {
    //                         if (egg != null && !egg.getIsEaten()) {
    //                             if (Math.random() < foxProbability) {
    //                                 countEaten[3] += eatEgg(family, egg);
    //                             }
    //                         }
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     return countEaten;
    // }

    @Override
    public String toString() {
        return "Fox [noOfChicksKilled=" + noOfChicksKilled + ", noOfEggsKilled=" + noOfEggsKilled + ", isAlive="
                + isAlive + "]";
    }
}
