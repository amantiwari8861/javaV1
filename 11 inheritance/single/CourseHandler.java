import java.util.Scanner;

class Course 
{
    int courseId;
    String cName;
    float price;
    Scanner sc;
    Course() 
    {
        System.out.println("Course Defined");
        sc = new Scanner(System.in);
    }
    void inputCourseData() 
    {
        System.out.print("Enter Course Id:");
        courseId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course Name:");
        cName = sc.nextLine();
        System.out.print("Enter Course Price:");
        price = sc.nextFloat();
    }
}
class CertificateCourse extends Course 
{
    float noOfHours;

    CertificateCourse() 
    { 
        System.out.println("Certificate Course Created");   
    }
    void inputCertificateCourseData() 
    {
        System.out.print("Enter no. of Hours:");
        noOfHours=sc.nextFloat();
    }
    void showCertificateData()
    {
        System.out.println("******** Certificate Course Details *********");
        System.out.println("Course Id :"+courseId);
        System.out.println("Course Name :"+cName);
        System.out.println("Course Price :"+price);
        System.out.println("Course Duration(in hrs) :"+noOfHours);
    }
}
// class DegreeCourse { }
public class CourseHandler {

    public static void main(String[] args) {
        CertificateCourse cc = new CertificateCourse();
        cc.inputCourseData();
        cc.inputCertificateCourseData();
        cc.showCertificateData();

        /* There are 5 types of inheritance :
         * 1.single 
         * 2.multi level
         * 3.heirarichal
         *       these 2 are not directly supported by java but
         *       we can impliment this with interfaces
         * 4.multiple
         * 5.Hybrid
        */
    }
}