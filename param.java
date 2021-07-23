class Student
{
    String name;
    int id;
    char Gender;
    Student(){}
    Student(String name){//parameterized constructor
        this.name=name;
    }
    void setDetail(int abc){
        id=abc;
    }
    void print()
    {
        System.out.println("hello my name is "+name+" "+id+" "+Gender);
    }
}
class Main 
{
    public static void main(String[] args) {
        Student obj=new Student("Aman");
        obj.Gender='M';
        obj.setDetail(1001);
        obj.print();
    }
}