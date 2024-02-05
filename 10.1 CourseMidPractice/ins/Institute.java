import java.util.Scanner;

public class Institute {

    Course courses[];
    Institute()
    {
        courses=new Course[100];
        courses[0]=new Course(1, "C", 4000, 36);
        courses[1]=new Course(2, "C++", 4000, 36);
        courses[2]=new Course(3, "JAVA", 10000, 46);
        courses[3]=new Course(4, "PYTHON", 8000, 36);
        courses[4]=new Course(5, "DSA", 12000, 46);
    }
    double getFeeOfCourses(String[] selectedCourses)//3
    {
        double fee=0.0;
        for (int i = 0; i < selectedCourses.length; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                if (selectedCourses[i].equals(courses[j].name)) 
                {
                   fee=fee+courses[j].fee; 
                   break;
                }
            }
        }
        return fee;
    }

    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        String courseEnrolled[];
        int noOfCourse;
        System.out.print("in how many courses you wanna enroll ? ");
        noOfCourse=sc.nextInt();
        courseEnrolled=new String[noOfCourse];
        sc.nextLine();
        System.out.println("Enter course Name ");
        for (int i = 0; i < noOfCourse; i++) 
        {
            courseEnrolled[i]=sc.nextLine().toUpperCase();
        }
        System.out.print("U enrolled in :[");
        for (int i = 0; i < courseEnrolled.length; i++) 
        {
            System.out.print(courseEnrolled[i]);
            if (i<courseEnrolled.length-1) 
            {
                System.out.print(",");
            }
        }
        System.out.println("]");

        Institute omega=new Institute();
        System.out.println("Your Total Fees is :"+omega.getFeeOfCourses(courseEnrolled));
        sc.close();
    }
}