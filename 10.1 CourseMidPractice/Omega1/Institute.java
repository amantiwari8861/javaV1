import java.util.Scanner;

public class Institute
{
    Address address;
    String name;
    Student students[];
    Teacher teachers[];
    Course courses[];
    int noOfStudents;
    Scanner sc;

    Institute(Scanner sc)
    {
        this.sc=sc;
        students=new Student[1000];
        teachers=new Teacher[10];
        courses=new Course[250];
        noOfStudents=0;
    }

    void enrollStudent()
    {
        Student st=new Student();
        st.inputDetails(sc);
        students[noOfStudents]=st;
        noOfStudents++;
    }
    void showAllStudentsDetails()
    {
        if (noOfStudents>0) 
        {
            System.out.println("There are "+noOfStudents+" Students Listed Below :");
            for (int i = 0; i < noOfStudents; i++) 
            {
                Student tempStu=students[i];
                tempStu.showStudentDetails();
            }
        }
        else
        {
            System.out.println("There is no students enrolled!!!");
        }
    }
    void hireTeacher()
    {

    }
    void makeNewCourse()
    {

    }
    void getStudentDetailById()
    {
        System.out.print("Enter student Id:");
        int id=sc.nextInt();
        boolean isFound=false;
        for (int i = 0; i < noOfStudents; i++) 
        {
            Student tempStudent=students[i];
            if (tempStudent.stId==id)
            {
                System.out.println("Here is the Student detail :");
                tempStudent.showStudentDetails();
                isFound=true;
            }
        }
        if(!isFound)
        {
            System.out.println("Student Record Not Found!!");
        }
    }
    void updateStudentdetails()
    {
        System.out.print("Enter student Id to be updated:");
        int id=sc.nextInt();
        boolean isFound=false;
        for (int i = 0; i < noOfStudents; i++) 
        {
            Student tempStudent=students[i];
            if (tempStudent.stId==id)
            {
                tempStudent.inputDetails(sc);
                isFound=true;
                System.out.println("Student Record Updated!!");
            }
        }
        if(!isFound)
        {
            System.out.println("Student Record Not Found!!");
        }
    }
    void deleteStudentDetails()
    {
        System.out.println("Enter student id to be deleted :");
        int id=sc.nextInt();
        boolean isFound=false;

        for (int i = 0; i < noOfStudents; i++) 
        {
            Student tempStudent=students[i];
            if (tempStudent.stId==id)
            {
                for (int j = i; j < noOfStudents-1; j++) 
                {
                    students[j]=students[j+1];
                }
                students[noOfStudents]=null;
                noOfStudents--;
                isFound=true;
                System.out.println("Student Record Deleted!!");
            }
        }
        if(!isFound)
        {
            System.out.println("Student Record Not Found!!");
        }
    }
}