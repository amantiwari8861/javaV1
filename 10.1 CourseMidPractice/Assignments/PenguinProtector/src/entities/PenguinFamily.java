package entities;

import java.util.ArrayList;

import util.GenerateThreedigitUniqueNo;

public class PenguinFamily 
{
    private String pnnn;//Pnnn
    private Penguin parents[];
    private ArrayList<Egg> eggs;
    private ArrayList<Chick> chicks;

    public PenguinFamily() 
    {
        parents=new Penguin[2];
        parents[0]=new Penguin(true, true);
        parents[1]=new Penguin(false,true);
        pnnn=GenerateThreedigitUniqueNo.generate();
    }
    
    public String getPnnn() {
        return pnnn;
    }

    public Penguin[] getParents() {
        return parents;
    }

    public ArrayList<Egg> getEggs() 
    {
        return eggs;
    }
    public ArrayList<Chick> getChicks() 
    {
        return chicks;
    }
    
}
