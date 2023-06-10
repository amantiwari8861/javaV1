// class Student
// {
//     private int stid;
//     private String name;
//     private int rollNo;
//     private char gender;
//     public Student(){}

//     public Student(int stid, String name, int rollNo, char gender) {
//         this.stid = stid;
//         this.name = name;
//         this.rollNo = rollNo;
//         this.gender = gender;
//     }
    
//     public void showDetails()
//     {
//         System.out.println("Student Details");
//         System.out.println("Student Id :"+stid);
//         System.out.println("Student name :"+name);
//         System.out.println("Student rollNo :"+rollNo);
//         System.out.println("Student gender :"+gender);
//     }
// }

// POJO -> plain old java object or Bean File(for bean it must implement serializable interface )
class Student
{
    private int stId;
    private String name;
    private int rollNo;
    private char gender;

    public void setStId(int stId)// setter or mutator
    {
        this.stId=stId;
    }
    public int getStId()//getter or accesor
    {
        return stId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    // @Override
    // public String toString()
    // {
    //     return "harsh ka data";
    // }
    @Override
    public String toString() {
        return "Student [stId=" + stId + ", name=" + name + ", rollNo=" + rollNo + ", gender=" + gender + "]";
    }
}

public class Accesormutator {
    public static void main(String[] args) 
    {
        // Student s= new Student();
        // s.stid=101;//error
        // Student s2= new Student(101, "aman", 10, 'M');
        // System.out.println(s2.stid);
        // s2.showDetails();
        // Student s3= new Student();
        // s3.stId=100;//error
        // s3.setStId(100);
        // System.out.println(s3.stId);//error
        // System.out.println(s3.getStId());

        // int num=100;
        Student s4=new Student();
        s4.setStId(100);
        s4.setName("Aman");
        s4.setRollNo(12);
        s4.setGender('M');

        System.out.println(s4);

    }
}