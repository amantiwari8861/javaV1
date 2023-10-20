package entities;

public class Egg 
{
    private Integer eggAge;
    private Boolean isEaten;
    public Egg() {
        eggAge=0;
        isEaten=false;
    }
    public Egg(Integer eggAge, Boolean isEaten) 
    {
        this.eggAge = eggAge;
        this.isEaten = isEaten;
    }
    
    public Integer getEggAge() {
        return eggAge;
    }
    public void setEggAge(Integer eggAge) {
        if (eggAge<=0) 
        {
            System.out.println("Age Must not be less than or equal to zero");
            return;
        }
        this.eggAge = eggAge;
    }
    public Boolean getIsEaten() {
        return isEaten;
    }
    public void setIsEaten(Boolean isEaten) {
        this.isEaten = isEaten;
    }
    @Override
    public String toString() {
        return "Egg [eggAge=" + eggAge + ", isEaten=" + isEaten + "]";
    }

}
