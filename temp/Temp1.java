class Temp1 
{
    public static void main(String[] args) 
    {
        //Design patterns : 
        //      DAO -> data accesing object 
        //OOPs -> 
        //    Inheritance
        //    encapsulation
        //    polymorphism
        //    abstraction

        // Building
        // class -> blueprint
        // objects -> real world entity
        // new -> dynamic memory allocaltion
        // Constructor -> initiate the building

        // Student stu1;//reference variable of class Student
        // stu1=new Student();// here Student() is default constructor
        // // stu1.showDetails();
        // stu1.rollNo=1;
        // stu1.name="samridhi";
        // stu1.showDetails();

        // System.out.println("===================================================");
        // Student stu2=new Student();
        // stu2.name="Aman Tiwari";
        // stu2.showDetails();

        Student stu3=new Student(1, "Samriddhi sharma", "KVS");
        stu3.showDetails();
        
        Student stu4=new Student(2, "Aman Tiwari", "RPVV");
        stu4.showDetails();
    }
}