import java.io.Serializable;

public class Animal implements Serializable{

    private char gender;
    private String name;

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
}