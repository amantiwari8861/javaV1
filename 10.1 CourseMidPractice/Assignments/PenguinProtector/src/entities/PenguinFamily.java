package entities;

import java.util.ArrayList;
import java.util.Arrays;

import util.GenerateThreedigitUniqueNo;

public class PenguinFamily {
    private String pnnn;// Pnnn
    private Penguin parents[];
    private ArrayList<Egg> eggs;
    private ArrayList<Chick> chicks;
    public int noOfEggs, noOfChicks,noOfChicksAlive;
    

    public PenguinFamily() {
        parents = new Penguin[2];
        parents[0] = new Penguin(true, true);
        parents[1] = new Penguin(false, true);
        pnnn = GenerateThreedigitUniqueNo.generate();
        eggs = new ArrayList<>();
        chicks = new ArrayList<>();
        noOfEggs = 0;noOfChicks = 0;
        noOfChicksAlive=0;
    }

    public String getPnnn() {
        return pnnn;
    }

    public Penguin[] getParents() {
        return parents;
    }

    public ArrayList<Egg> getEggs() {
        return eggs;
    }

    public ArrayList<Chick> getChicks() {
        return chicks;
    }

    public void setPnnn(String pnnn) {
        this.pnnn = pnnn;
    }

    public void setParents(Penguin[] parents) {
        this.parents = parents;
    }

    public void setEggs(ArrayList<Egg> eggs) {
        this.eggs = eggs;
    }

    public void setChicks(ArrayList<Chick> chicks) {
        this.chicks = chicks;
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

    public int ageOfChickAndEggAfterOneMonth() 
    {
        int eggsHatchedPerFamily=0;
        noOfChicks=0;
        if (eggs != null) 
        {
            for (Egg egg : eggs) 
            {
                egg.setEggAge(egg.getEggAge() + 1);
            }
        }
        if (chicks != null) 
        {
            for (Chick chick : chicks) {
                if(chick.getIsChickAlive())
                {
                    chick.setChickAge(chick.getChickAge() + 1);
                    // System.out.println(chick+" age incremented.....");
                }
            }
            // System.out.println(chicks.size());
        }
        if (eggs != null) {
            for (Egg egg : eggs) {
                if (egg.getEggAge() == 1 && !egg.getIsEaten()) {
                    double probability = Math.random();
                    if (probability <= 0.7) {
                        Chick ck=new Chick(0, true);
                        chicks.add(ck);
                        eggsHatchedPerFamily++;
                        noOfChicks++;
                        // System.out.println("hatched :"+egg+" of family "+pnnn+"got"+ck);
                    }
                    // else
                    // {
                    //     System.out.println("Not hatched :"+egg+" of family "+pnnn);
                    // }
                }
            }
            eggs.removeIf(e -> e.getEggAge() == 1);
        }
        return eggsHatchedPerFamily;
    }
    public int checkAliveChicks()
    {
        chicks.forEach(c->{
            if (c.getIsChickAlive()) {
                noOfChicksAlive++;
            }
        });
        return noOfChicksAlive;
    }
    @Override
    public String toString() {
        return "PenguinFamily [pnnn=" + pnnn + ", parents=" + Arrays.toString(parents) + ", eggs=" + eggs + ", chicks="
                + chicks + "]";
    }

}
