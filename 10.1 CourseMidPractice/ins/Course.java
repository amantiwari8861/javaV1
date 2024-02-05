public class Course 
{
    int courseId;
    String name;
    double fee;
    double duration;
    public Course() {
    }
    public Course(int courseId, String name, double fee, double duration) {
        this.courseId = courseId;
        this.name = name;
        this.fee = fee;
        this.duration = duration;
    }
    void showDetails()
    {
        System.out.println("****** Course Detail **********");
        System.out.println("Course Id :"+courseId);
        System.out.println("Course Name :"+name);
        System.out.println("Course Fee :"+fee);
        System.out.println("Course Duration :"+duration);
    }
}