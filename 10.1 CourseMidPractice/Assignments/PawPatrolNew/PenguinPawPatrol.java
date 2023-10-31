import java.util.Random;
import java.util.Scanner;

public class PenguinPawPatrol {
    int monthNo;
    int patrolDogs;
    boolean isAcceptable = false;
    Scanner sc;
    PenguinFamily pFamilies[];
    Fox foxes[];
    Cat cats[];
    Shark sharks[];
    int noOfAlivePenguins;
    int noOfCompleteFamily;
    int liveChicksCount;
    int noOfEggsLaid;
    int noOfEggsHatched;
    int newChicks;

    public PenguinPawPatrol() {
        sc= new Scanner(System.in);
        noOfCompleteFamily = liveChicksCount = noOfEggsLaid = noOfEggsHatched = newChicks = 0;
        try 
        {
            String[] fileInp = new FileInputHandler().readDataFromFile();
            initialize(Integer.parseInt(fileInp[0]), Integer.parseInt(fileInp[1]), Integer.parseInt(fileInp[2]),Integer.parseInt(fileInp[3]));
        } 
        catch (NullPointerException e) 
        {
            System.out.println("unable to initialize data from file colony.txt!!");
            System.exit(1);
        }
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
        int noOfMalePenguinsKilledPerMonth = 0, noOfFemalePenguinsKilledPerMonth = 0, uneatenEggCount = 0,totalNoOfAliveFox = 0, totalNoOfAliveCat = 0, noOfCatsKilledPerMonth = 0, noOfFoxesKilledPerMonth = 0, newEggsPerMonth = 0, totalChicksKilled = 0, numberOfChicksEatenPerMonth = 0, noOfEggsEatenPerMonth = 0; noOfCompleteFamily = 0;
        noOfAlivePenguins = newChicks = 0;

        // total alive foxes
        for (Fox fox : foxes) {
            if (fox.getIsAlive())
                totalNoOfAliveFox++;
        }
        // total alive cats
        for (Cat cat : cats) {
            if (cat.getIsAlive()) {
                totalNoOfAliveCat++;
            }
        }
        // increment age of chicks,eggs and hatch accordingly
        for (PenguinFamily pFamily : pFamilies) {
            pFamily.incrementEggAge();
            pFamily.incrementChickAge();
            noOfEggsHatched += pFamily.hatchEgg();
        }
        // lay eggs and hunting by fox,cat and shark
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
            int countEaten[] = new int[4];
            countEaten = huntingByFox(pFamily);
            noOfMalePenguinsKilledPerMonth += countEaten[0];
            noOfFemalePenguinsKilledPerMonth += countEaten[1];
            numberOfChicksEatenPerMonth += countEaten[2];
            noOfEggsEatenPerMonth += countEaten[3];
            countEaten = huntingByCat(pFamily);
            noOfMalePenguinsKilledPerMonth += countEaten[0];
            noOfFemalePenguinsKilledPerMonth += countEaten[1];
            numberOfChicksEatenPerMonth += countEaten[2];
            countEaten = huntingByShark(pFamily);
            noOfMalePenguinsKilledPerMonth += countEaten[0];
            noOfFemalePenguinsKilledPerMonth += countEaten[1];
        }

        // hunting by patrol dogs
        if (patrolDogs > 0) {
            PawpatrolDog pd = new PawpatrolDog(patrolDogs);
            if (totalNoOfAliveCat > noOfCatsKilledPerMonth)
                noOfCatsKilledPerMonth += pd.killCats(cats);
            // System.out.println("no. of fox killed :"+noOfFoxesKilledPerMonth+"
            // "+monthNo);
            PawpatrolDog pd2 = new PawpatrolDog(patrolDogs);
            if (totalNoOfAliveFox > noOfFoxesKilledPerMonth)
                noOfFoxesKilledPerMonth += pd2.killFoxes(foxes);
        }

        for (PenguinFamily pf : pFamilies) {
            Penguin[] parents = pf.getParents();
            newChicks += pf.getNoOfChicks();
            if (pf.getEggs() != null) {
                newEggsPerMonth += pf.getEggs().size();
                for (Egg egg : pf.getEggs()) {
                    // eggs saved
                    if (!egg.getIsEaten()) {
                        uneatenEggCount++;
                    }
                }
            }
            if (pf != null) {
                // complete family
                if (parents[0].getIsAlive() && parents[1].getIsAlive()) {
                    noOfCompleteFamily++;
                }
                // total alive penguins
                for (Penguin penguin : parents) {
                    if (penguin.getIsAlive()) {
                        noOfAlivePenguins++;
                    }
                }

            }
        }

        // chicks alived
        for (int i = 0; i < foxes.length; i++) {
            totalChicksKilled += foxes[i].getNoOfChicksKilled();
        }
        for (int i = 0; i < cats.length; i++) {
            totalChicksKilled += cats[i].getNoOfChicksKilled();
        }
        liveChicksCount = noOfEggsHatched - totalChicksKilled;

        System.out.println(" + new chicks:" + newChicks);
        System.out.println(" + new eggs:" + newEggsPerMonth);
        System.out.println(
                " - penguin killed:" + noOfMalePenguinsKilledPerMonth + " male," + noOfFemalePenguinsKilledPerMonth
                        + " female");
        System.out.println(" - chicks killed:" + numberOfChicksEatenPerMonth);
        System.out.println(" - eggs killed:" + noOfEggsEatenPerMonth);
        System.out.println(" - fox killed:" + noOfFoxesKilledPerMonth);
        System.out.println(" - cat killed:" + noOfCatsKilledPerMonth);
        System.out.println(" End of month status:");
        System.out.println("  complete family:" + noOfCompleteFamily);
        System.out.println("  live chicks count:" + liveChicksCount);
        System.out.println("  uneaten egg count:" + uneatenEggCount);
        System.out.println("  fox count:" + totalNoOfAliveFox);
        System.out.println("  cat count:" + totalNoOfAliveCat);
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

    public int[] huntingByFox(PenguinFamily family) {
        double foxProbability = (patrolDogs == 0) ? 0.08 : (patrolDogs == 1) ? 0.02 : 0.008;
        int countEaten[] = { 0, 0, 0, 0 };// malepenguin femalepenguin chick egg
        Random rndm = new Random();
        for (Fox fox : foxes) {
            if (fox.getIsAlive()) {
                if (family.getParents() != null) {
                    for (Penguin penguin : family.getParents()) {
                        if (penguin != null && penguin.getIsAlive()) {

                            int num = rndm.nextInt(100) + 1;
                            double randm;
                            if (patrolDogs == 0)
                                randm = (num / 100.0) * rndm.nextInt(1);// Hiii
                            else
                                randm = (num / 100.0);
                            if (randm > 0 && randm < foxProbability) {
                                // System.out.println("random :" + randm + " by fox " + foxProbability);
                                if (penguin.getIsMale()) {
                                    countEaten[0] += fox.killPenguin(family, penguin);
                                } else {
                                    countEaten[1] += fox.killPenguin(family, penguin);
                                }
                            }
                        }
                    }
                }
                if (family.getChicks() != null) {
                    for (Chick chick : family.getChicks()) {
                        if (chick != null && chick.getIsChickAlive()) {
                            if (Math.random() < foxProbability) {
                                countEaten[2] += fox.killChick(family, chick);
                            }
                        }
                    }
                }
                if (family.getEggs() != null) {
                    for (Egg egg : family.getEggs()) {
                        if (egg != null && !egg.getIsEaten()) {
                            if (Math.random() < foxProbability) {
                                countEaten[3] += fox.eatEgg(family, egg);
                            }
                        }
                    }
                }
            }
        }
        return countEaten;
    }

    public int[] huntingByCat(PenguinFamily family) {
        double catProbability = (patrolDogs == 0) ? 0.04 : (patrolDogs == 1) ? 0.01 : 0.004;
        int countEaten[] = { 0, 0, 0, 0 };// malepenguin femalepenguin chick egg

        for (Cat cat : cats) {
            if (cat.getIsAlive()) {
                if (family.getParents() != null) {
                    for (Penguin penguin : family.getParents()) {
                        if (penguin != null && penguin.getIsAlive()) {
                            if (Math.random() < catProbability) {
                                if (penguin.getIsMale())
                                    countEaten[0] += cat.killPenguin(family, penguin);
                                else
                                    countEaten[1] += cat.killPenguin(family, penguin);
                            }
                        }
                    }
                }
                if (family.getChicks() != null) {
                    for (Chick chick : family.getChicks()) {
                        if (chick != null && chick.getIsChickAlive()) {
                            if (Math.random() < catProbability) {
                                countEaten[2] += cat.killChick(family, chick);
                            }
                        }
                    }
                }
            }
        }
        return countEaten;
    }

    public int[] huntingByShark(PenguinFamily family) {
        double sharkProbability = 0.02;
        int countEaten[] = { 0, 0, 0, 0 };
        for (Shark shark : sharks) {
            if (family.getParents() != null) {
                for (Penguin penguin : family.getParents()) {
                    if (penguin != null && penguin.getIsAlive()) {
                        if (Math.random() < sharkProbability) {
                            if (penguin.getIsMale())
                                countEaten[0] += shark.killPenguin(family, penguin);
                            else
                                countEaten[1] += shark.killPenguin(family, penguin);
                        }
                    }
                }
            }
        }
        return countEaten;
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

    public static void main(String[] args) throws Exception {
        PenguinPawPatrol simulation = new PenguinPawPatrol();
        System.out.println("Welcome to Paw Patrol");
        System.out.println("=====================");
        simulation.choosePawDogs();
        System.out.println("\nRunning simulation from month 7- 6");
        simulation.simulatePerMonth();
        System.out.println("Goodbye");
    }
}