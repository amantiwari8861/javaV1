class Student
{
    private String name;
    private int id;

    public void setName(String name) {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

class GetterAndSetter {

   public static void main(String[] args) {
       Student obj=new Student();
       obj.setName("Aman");

       System.out.println(obj.getName());
   } 
}