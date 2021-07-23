class StudentBean {
    private int id;
    private String name;
    //getter(accesor) and setter(mutator)
    public int getId() 
    {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
}
class InnerStudentBean {
public static void main(String []args) 
{
    StudentBean obj=new StudentBean();
    obj.setId(101);
    obj.setName("Aman Tiwari");
    System.out.println("the student name is :"+obj.getName()+" \n id : "+obj.getId());
}
}