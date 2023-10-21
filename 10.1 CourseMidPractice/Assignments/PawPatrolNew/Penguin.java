public class Penguin 
{
    private Boolean isMale;
    private Boolean isAlive;
    public Penguin() {
    }
    public Penguin(Boolean isMale, Boolean isAlive) 
    {
        this.isMale = isMale;
        this.isAlive = isAlive;
    }
    
    public Boolean getIsMale() {
        return isMale;
    }
    public void setIsMale(Boolean isMale) {
        this.isMale = isMale;
    }
    public Boolean getIsAlive() {
        return isAlive;
    }
    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }
    @Override
    public String toString() {
        return "Penguin [isMale=" + isMale + ", isAlive=" + isAlive + "]";
    }
}