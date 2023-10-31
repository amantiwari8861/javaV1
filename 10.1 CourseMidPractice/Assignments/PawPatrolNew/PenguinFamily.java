import java.util.ArrayList;
import java.util.Arrays;

public class PenguinFamily {
    private String pnnn;// Pnnn
    private Penguin parents[];
    private ArrayList<Egg> eggs;
    private ArrayList<Chick> chicks;
    private int noOfEggs, noOfChicks, noOfChicksAlive, noOfChicksKilled,newChicks;
    private int eggsHatchedPerFamily;

    public PenguinFamily() {
        parents = new Penguin[2];
        parents[0] = new Penguin(true, true);
        parents[1] = new Penguin(false, true);
        pnnn = GenerateThreedigitUniqueNo.generate();
        eggs = new ArrayList<>();
        chicks = new ArrayList<>();
        noOfEggs = 0;
        noOfChicks = 0;
        noOfChicksAlive = 0;
        eggsHatchedPerFamily = 0;
        noOfChicksKilled = 0;newChicks=0;
    }

    public int layEggs() {
        int eggNos = (int) (Math.random() * 3);
        for (int i = 0; i < eggNos; i++) {
            Egg egg = new Egg(0, false);
            eggs.add(egg);
            noOfEggs++;
        }
        // System.out.println("laid(" + eggNos + "/" + noOfEggs + ") eggs by " + pnnn + "(" + eggs + ")");
        return eggNos;
    }

    public void incrementEggAge() {
        if (eggs != null) {
            for (Egg egg : eggs) {
                egg.setEggAge(egg.getEggAge() + 1);
            }
        }
    }

    public void incrementChickAge() {
        if (chicks != null) {
            for (Chick chick : chicks) {
                if (chick.getIsChickAlive()) {
                    chick.setChickAge(chick.getChickAge() + 1);
                    // System.out.println(chick + " age incremented.....");
                }
            }
        }
    }

    public int hatchEgg() {
        newChicks=0;
        eggsHatchedPerFamily=0;
        if (eggs != null) {
            for (Egg egg : eggs) {
                if (egg.getEggAge() == 1 && !egg.getIsEaten()) {
                    double probability = Math.random();
                    if (probability <= 0.7) {
                        Chick ck = new Chick(0, true);
                        chicks.add(ck);
                        eggsHatchedPerFamily++;
                        noOfChicks++;
                        newChicks++;
                        // System.out.println("hatched :" + egg + " of family " + pnnn + "got" + ck);
                    } 
                    // else {
                    //     System.out.println("Not hatched :" + egg + " of family " + pnnn);
                    // }
                }
            }
            eggs.removeIf(e -> e.getEggAge() == 1);
        }
        return eggsHatchedPerFamily;
    }

    public String getPnnn() {
        return pnnn;
    }

    public void setPnnn(String pnnn) {
        this.pnnn = pnnn;
    }

    public Penguin[] getParents() {
        return parents;
    }

    public void setParents(Penguin[] parents) {
        this.parents = parents;
    }

    public ArrayList<Egg> getEggs() {
        return eggs;
    }

    public void setEggs(ArrayList<Egg> eggs) {
        this.eggs = eggs;
    }

    public ArrayList<Chick> getChicks() {
        return chicks;
    }

    public void setChicks(ArrayList<Chick> chicks) {
        this.chicks = chicks;
    }

    public int getNoOfEggs() {
        return eggs.size();
    }

    public void setNoOfEggs(int noOfEggs) {
        this.noOfEggs = noOfEggs;
    }

    public int getNoOfChicks() {
        
            return newChicks;
    }

    public void setNoOfChicks(int noOfChicks) {
        this.noOfChicks = noOfChicks;
    }

    public int getNoOfChicksAlive() {
        if (chicks != null) {
            for (int i = 0; i < chicks.size(); i++) {
                if (chicks.get(i).getIsChickAlive()) 
                {
                    noOfChicksAlive++;
                }
            }
            return noOfChicksAlive;
        }
        return 0;
    }

    public void setNoOfChicksAlive(int noOfChicksAlive) {
        this.noOfChicksAlive = noOfChicksAlive;
    }

    public int getEggsHatchedPerFamily() {
        return eggsHatchedPerFamily;
    }

    public void setEggsHatchedPerFamily(int eggsHatchedPerFamily) {
        this.eggsHatchedPerFamily = eggsHatchedPerFamily;
    }

    public int getNoOfChicksKilled() {
        if (chicks != null) {
            for (Chick ck : chicks) {
                if (!ck.getIsChickAlive()) {
                    noOfChicksKilled++;
                }
            }
        }
        return noOfChicksKilled;
    }

    public void setNoOfChicksKilled(int noOfChicksKilled) {
        this.noOfChicksKilled = noOfChicksKilled;
    }

    @Override
    public String toString() {
        return "PenguinFamily [pnnn=" + pnnn + ", parents=" + Arrays.toString(parents) + ", eggs=" + eggs + ", chicks="
                + chicks + ", noOfEggs=" + noOfEggs + ", noOfChicks=" + noOfChicks + ", noOfChicksAlive="
                + noOfChicksAlive + ", eggsHatchedPerFamily=" + eggsHatchedPerFamily + "]";
    }

}
