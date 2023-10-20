package entities;

public class Chick 
{
    private Integer chickAge;
    private Boolean isChickAlive;
    public Chick() {
        chickAge=0;
        isChickAlive=true;
    }
    public Chick(Integer chickAge, Boolean isChickAlive) 
    {
        this.chickAge = chickAge;
        this.isChickAlive = isChickAlive;
    }
    public Integer getChickAge() {
        return chickAge;
    }
    public void setChickAge(Integer chickAge) {
        if (chickAge<=0) 
        {
            System.out.println("Age Must not be less than or equal to zero");
            return;
        }
        this.chickAge = chickAge;
    }
    public Boolean getIsChickAlive() {
        return isChickAlive;
    }
    public void setIsChickAlive(Boolean isChickAlive) {
        this.isChickAlive = isChickAlive;
    }
    @Override
    public String toString() 
    {
        return "Chick [chickAge=" + chickAge + ", isChickAlive=" + isChickAlive + "]";
    }
}
