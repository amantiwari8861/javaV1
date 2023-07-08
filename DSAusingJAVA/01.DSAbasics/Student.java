public class Student 
{
    private int id;
    private String name;
    private float fees;
    private long phone;
    
    public Student() {    }

    public Student(int id, String name, float fees, long phone) 
    {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getFees() {
        return fees;
    }
    public void setFees(float fees) {
        this.fees = fees;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    } 
    
}
