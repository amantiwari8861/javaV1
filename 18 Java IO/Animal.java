import java.io.Serializable;
/**
 * in this bean class Serializable is a marker interface
 */
public class Animal implements Serializable
{
    // bean class
    private static final long serialVersionUID = 1L;
    private char gender;
    private String name;
    private transient String animalWeight;

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalWeight() {
        return animalWeight;
    }
    public void setAnimalWeight(String animalWeight) {
        this.animalWeight = animalWeight;
    }
    @Override
    public String toString() {
        return "Animal [gender=" + gender + ", name=" + name + "]";
    }
}