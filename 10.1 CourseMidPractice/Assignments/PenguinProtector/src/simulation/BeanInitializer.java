package simulation;

import entities.Cat;
import entities.Fox;
import entities.PenguinFamily;
import entities.Shark;

public class BeanInitializer 
{
    PenguinFamily pFamilies[];
    Fox foxes[];
    Cat cats[];
    Shark sharks[];
    public BeanInitializer(Integer pfNo, Integer fNo, Integer cNo, Integer sNo) 
    {
        pFamilies = new PenguinFamily[pfNo];
        foxes = new Fox[fNo];
        cats = new Cat[cNo];
        sharks = new Shark[sNo];
        for (int i = 0; i < pfNo; i++) 
        {
            pFamilies[i]=new PenguinFamily();
        }
        for (int i = 0; i < fNo; i++) 
        {
            foxes[i]=new Fox();
        }
        for (int i = 0; i < cNo; i++) 
        {
            cats[i]=new Cat();
        }
        for (int i = 0; i < sNo; i++) 
        {
            sharks[i]=new Shark();
        }
    }

    
}
