public class Course 
{
    String courseName;
    int courseId;
    double duration;
    float fees;
    String content[];//instance variable(global)

    Course()
    {
    }
    public Course(String courseName, int courseId, double duration, float fees, String[] content) 
    {
        this.courseName = courseName;
        this.courseId = courseId;
        this.duration = duration;
        this.fees = fees;
        this.content = content;
    }
    void showCourseDetails()
    {
        System.out.println("\n********* Course Details ********");
        System.out.println("courseName :"+courseName);
        System.out.println("courseId :"+courseId);
        System.out.println("duration :"+duration);
        System.out.println("fees :"+fees);
    }
}
