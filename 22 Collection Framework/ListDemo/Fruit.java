public class Fruit 
{
    private String name;
    private String taste;
    
    public Fruit() {
    }
    public Fruit(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTaste() {
        return taste;
    }
    public void setTaste(String taste) {
        this.taste = taste;
    }
    @Override
    public String toString() {
        return "Fruit [name=" + name + ", taste=" + taste + "]";
    }    
}
