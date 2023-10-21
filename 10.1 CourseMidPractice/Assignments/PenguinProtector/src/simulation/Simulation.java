package simulation;

import java.util.Random;
import java.util.Scanner;

import entities.Cat;
import entities.Chick;
import entities.Egg;
import entities.Fox;
import entities.Pawpatrol;
import entities.Penguin;
import entities.PenguinFamily;
import entities.Shark;
import util.FileInputHandler;
import util.FileOutputHandler;

public class Simulation {
    int monthNo;
    int patrolDogs;
    boolean isAcceptable = false;
    Scanner sc = new Scanner(System.in);
    PenguinFamily pFamilies[];
    Fox foxes[];
    Cat cats[];
    Shark sharks[];
    int noOfAlivePenguins;
    int noOfCompleteFamily;
    int liveChicksCount;
    int noOfEggsLaid;
    int noOfEggsHatched;
    int noOfChicksKilled;
    int noOfEggsKilled;
    int newChicks;
    int previous;

    public Simulation() {
        noOfAlivePenguins = noOfCompleteFamily = liveChicksCount = noOfEggsLaid = noOfEggsHatched = noOfChicksKilled = noOfEggsKilled = newChicks = 0;
        String[] fileInp = new FileInputHandler().readDataFromFile();
        initialize(Integer.parseInt(fileInp[0]), Integer.parseInt(fileInp[1]), Integer.parseInt(fileInp[2]),
                Integer.parseInt(fileInp[3]));
    }

    public void initialize(Integer pfNo, Integer fNo, Integer cNo, Integer sNo) {
        // System.out.println(pfNo+":"+fNo+":"+cNo+":"+sNo);
        pFamilies = new PenguinFamily[pfNo];
        foxes = new Fox[fNo];
        cats = new Cat[cNo];
        sharks = new Shark[sNo];
        for (int i = 0; i < pfNo; i++) {
            pFamilies[i] = new PenguinFamily();
        }
        for (int i = 0; i < fNo; i++) {
            foxes[i] = new Fox();
        }
        for (int i = 0; i < cNo; i++) {
            cats[i] = new Cat();
        }
        for (int i = 0; i < sNo; i++) {
            sharks[i] = new Shark();
        }
    }

    public void simulate(int monthNo) {
        this.monthNo = monthNo;
        for (PenguinFamily pFamily : pFamilies) {
            pFamily.incrementEggAge();
            pFamily.incrementChickAge();
            noOfEggsHatched += pFamily.hatchEgg();
        }
        for (PenguinFamily pFamily : pFamilies) {
            if (monthNo >= 8 && monthNo <= 12 || monthNo == 1 || monthNo == 2) {
                Penguin[] parents = pFamily.getParents();
                if (parents[0].getIsAlive() && parents[1].getIsAlive()) {
                    noOfEggsLaid += pFamily.layEggs();
                }
                if (!parents[0].getIsAlive() && !parents[1].getIsAlive()) {
                    // System.out.println("both died");
                    pFamily.setChicks(null);
                    pFamily.setEggs(null);
                }
            }
            // else
            // {
            // System.out.println("unable to lay eggs at month " + monthNo);
            // }
            huntingByFox(pFamily);
            huntingByCat(pFamily);
            huntingByShark(pFamily);
            if (patrolDogs > 0) {
                new Pawpatrol(patrolDogs).killCats(cats);
                new Pawpatrol(patrolDogs).killFoxes(foxes);
            }
        }

    }

    // public void startHunting() {
    // for (int i = 0; i < foxes.length; i++) {
    // if (foxes[i].getIsAlive()) {
    // System.out.println(i + " hunting by fox ");
    // huntingByFox(pFamily);
    // }
    // }
    // for (int i = 0; i < cats.length; i++) {
    // if (cats[i].getIsAlive()) {
    // System.out.println("hunting by cat");
    // huntingByCat(pFamily);
    // }
    // }
    // huntingByShark(pFamily);
    // if (patrolDogs > 0) {
    // new Pawpatrol(patrolDogs).killCats(cats);
    // new Pawpatrol(patrolDogs).killFoxes(foxes);
    // }
    // }

    public void huntingByFox(PenguinFamily family) {
        double foxProbability = (patrolDogs == 0) ? 0.08 : (patrolDogs == 1) ? 0.02 : 0.008;
        Random rndm = new Random();
        for (Fox fox : foxes) {
            if (fox.getIsAlive()) {
                if (family.getParents() != null) {
                    for (Penguin penguin : family.getParents()) {
                        if (penguin != null && penguin.getIsAlive()) {
                            // double randm=rndm.nextDouble();
                            int num = rndm.nextInt(100) + 1;
                            double randm;
                            if (patrolDogs == 0)
                                randm = (num / 100.0) * rndm.nextInt(1);
                            else
                                randm = (num / 100.0);
                            if (randm > 0 && randm < foxProbability) {
                                // System.out.println("random :" + randm + " by fox " + foxProbability);
                                fox.killPenguin(family, penguin);
                            }
                        }
                    }
                }
                if (family.getChicks() != null) {
                    for (Chick chick : family.getChicks()) {
                        if (chick != null && chick.getIsChickAlive()) {
                            if (Math.random() < foxProbability) {
                                fox.killChick(family, chick);
                            }
                        }
                    }
                }
                if (family.getEggs() != null) {
                    for (Egg egg : family.getEggs()) {
                        if (egg != null && !egg.getIsEaten()) {
                            if (Math.random() < foxProbability) {
                                fox.eatEgg(family, egg);
                            }
                        }
                    }
                }
            }
        }
    }

    public void huntingByCat(PenguinFamily family) {
        double catProbability = (patrolDogs == 0) ? 0.04 : (patrolDogs == 1) ? 0.01 : 0.004;
        for (Cat cat : cats) {
            if (cat.getIsAlive()) {
                if (family.getParents() != null) {
                    for (Penguin penguin : family.getParents()) {
                        if (penguin != null && penguin.getIsAlive()) {
                            if (Math.random() < catProbability) {
                                cat.killPenguin(family, penguin);
                            }
                        }
                    }
                }
                if (family.getChicks() != null) {
                    for (Chick chick : family.getChicks()) {
                        if (chick != null && chick.getIsChickAlive()) {
                            if (Math.random() < catProbability) {
                                cat.killChick(family, chick);
                            }
                        }
                    }
                }
            }
        }
    }

    public void huntingByShark(PenguinFamily family) {
        double sharkProbability = 0.02;
        for (Shark shark : sharks) {
            if (family.getParents() != null) {
                for (Penguin penguin : family.getParents()) {
                    if (penguin != null && penguin.getIsAlive()) {
                        if (Math.random() < sharkProbability) {
                            shark.killPenguin(family, penguin);
                        }
                    }
                }
            }
        }
    }

    public void choosePawDogs() {
        do {
            System.out.print("How many patrol dogs? (0-2) :");
            try {
                patrolDogs = Integer.parseInt(sc.nextLine().trim());
                if (patrolDogs < 0 || patrolDogs > 2) {
                    System.out.println("Error :patrol dogs must be between 0 to 2");
                    continue;
                }
                isAcceptable = true;
            } catch (NumberFormatException e) {
                System.out.println("Error :value is not number!!");
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        } while (!isAcceptable);
    }

    public void simulatePerMonth() {
        System.out.println("  Number of dogs:" + patrolDogs);
        String ch;
        int m = 7;
        do {
            System.out.println();
            System.out.println("Simulating month " + m);
            simulate(m);
            calculateStat();
            System.out.println("press ENTER to continue");
            ch = sc.nextLine();
            if (m == 12)
                m = 0;
            if (m == 6) {
                printFinalStat();
                colonySurvivalStat();
                System.out.println("Writing survival rates into colonyFinal.txt");
                break;
            }
            m++;

        } while (!ch.equals("\n"));
    }

    public void calculateStat() {
        int newEggs = 0, noOfMalePenguinsKilled = 0, noOfFeMalePenguinsKilled = 0, noOfFoxesKilled = 0,
                noOfCatsKilled = 0, uneatenEggCount = 0, noOfAliveFox = 0, noOfAliveCat = 0;
        noOfCompleteFamily = 0;
        noOfAlivePenguins = 0;
        noOfEggsKilled = 0;
        newChicks = 0;
        for (PenguinFamily pf : pFamilies) {
            Penguin[] parents = pf.getParents();
            if (parents[0].getIsMale() && !parents[0].getIsAlive()) {
                noOfMalePenguinsKilled++;
            }
            if (!parents[1].getIsMale() && !parents[1].getIsAlive()) {
                noOfFeMalePenguinsKilled++;
            }
            newChicks += pf.getNoOfChicks();
            // noOfChicksKilled+=pf.getNoOfChicksKilled();
            // liveChicksCount+=pf.getNoOfChicksAlive();
            if (pf.getEggs() != null) {
                newEggs += pf.getEggs().size();
                for (Egg egg : pf.getEggs()) {
                    if (!egg.getIsEaten()) {
                        uneatenEggCount++;
                    }
                    if (egg.getIsEaten()) {
                        noOfEggsKilled++;
                    }
                }
            }
            if (pf != null) {
                if (parents[0].getIsAlive() && parents[1].getIsAlive()) {
                    noOfCompleteFamily++;
                }
                for (Penguin penguin : parents) {
                    if (penguin.getIsAlive()) {
                        noOfAlivePenguins++;
                    }
                }

            }
        }
        for (Fox fox : foxes) {
            if (!fox.getIsAlive())
                noOfFoxesKilled++;
            if (fox.getIsAlive())
                noOfAliveFox++;
        }
        for (Cat cat : cats) {
            if (!cat.getIsAlive())
                noOfCatsKilled++;
            if (cat.getIsAlive()) {
                noOfAliveCat++;
            }
        }
        // noOfChicksKilled=0;
        int temp = 0;
        for (int i = 0; i < foxes.length; i++) {
            temp += foxes[i].getNoOfChicksKilled();
        }
        for (int i = 0; i < cats.length; i++) {
            temp += cats[i].getNoOfChicksKilled();
        }
        temp = noOfEggsHatched - temp;
        liveChicksCount = temp;
        noOfChicksKilled = noOfEggsHatched - liveChicksCount - noOfChicksKilled;

        System.out.println(" + new chicks:" + newChicks);
        System.out.println(" + new eggs:" + newEggs);
        System.out.println(
                " - penguin killed:" + noOfMalePenguinsKilled + " male," + noOfFeMalePenguinsKilled + " female");
        System.out.println(" - chicks killed:" + noOfChicksKilled);
        System.out.println(" - eggs killed:" + noOfEggsKilled);
        System.out.println(" - fox killed:" + noOfFoxesKilled);
        System.out.println(" - cat killed:" + noOfCatsKilled);
        System.out.println(" End of month status:");
        System.out.println("  complete family:" + noOfCompleteFamily);
        System.out.println("  live chicks count:" + liveChicksCount);
        System.out.println("  uneaten egg count:" + uneatenEggCount);
        System.out.println("  fox count:" + noOfAliveFox);
        System.out.println("  cat count:" + noOfAliveCat);
        System.out.println("  shark count:" + sharks.length);
    }

    public void printFinalStat() {
        System.out.println("End of simulation summary:");
        System.out.println(" complete family:" + noOfCompleteFamily);
        System.out.println(" live penguin:" + noOfAlivePenguins);
        System.out.println(" live chicks:" + liveChicksCount);
        System.out.println("\nSimulation is done.");
    }

    public void colonySurvivalStat() {
        double familyGroupSurvivalRate = Math.round((((double) noOfCompleteFamily / pFamilies.length) * 100) * 100)
                / 100.0;
        double penguinSurvivalRate = Math.round((((double) noOfAlivePenguins / pFamilies.length * 2) * 100) * 100)
                / 100.0;
        double eggSurvivalRate = Math.round((((double) noOfEggsHatched / noOfEggsLaid) * 100) * 100) / 100.0;
        double chickSurvivalRate = Math.round((((double) liveChicksCount / noOfEggsHatched) * 100) * 100) / 100.0;
        double overallColonySurvival = Math
                .round((((double) (noOfAlivePenguins + liveChicksCount) / pFamilies.length * 2)) * 100) / 100.0;

        System.out.println(" * family group survival rate: " + familyGroupSurvivalRate + "%");
        System.out.println(" * penguin survival rate: " + penguinSurvivalRate + "%");
        System.out.println(" * eggs survival rate: " + eggSurvivalRate + "%");
        System.out.println(" * chick survival rate: " + chickSurvivalRate + "%");
        System.out.println(" * colony survival: " + overallColonySurvival + "%");
        new FileOutputHandler().writDataIntoFile(familyGroupSurvivalRate, penguinSurvivalRate, eggSurvivalRate,
                chickSurvivalRate, overallColonySurvival);
    }
}