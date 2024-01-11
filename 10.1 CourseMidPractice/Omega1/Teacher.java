public class Teacher 
{
    int tId;
    String name;
    double salary;
    long phoneNo;
    String skills[];

    public Teacher() {}

    public Teacher(int tId, String name, double salary, long phoneNo, String[] skills) {
        this.tId = tId;
        this.name = name;
        this.salary = salary;
        this.phoneNo = phoneNo;
        this.skills = skills;
    }
    void showTeacherdetails()
    {
        System.out.println("\n********** Teacher Details *********");
        System.out.println("tId :"+tId);
        System.out.println("name :"+name);
        System.out.println("salary :"+salary);
        System.out.println("phoneNo :"+phoneNo);
    }
}
