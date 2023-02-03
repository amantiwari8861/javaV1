//setter and getter
//accesor and mutators
//pojo : plain old java objects 

class encap1
{
    private String name;
    private int id;

    public void setname(String name) { //setter (mutator)
        this.name=name;
    }
    public String getname() {  //getter (accesor)
        return name;
    }
}
class Main 
{
    public static void main(String[] args) {
        encap1 obj=new encap1();
        obj.setname("Aman");
        System.out.println("the name is "+obj.getname());
        obj.setname("sudhanshu");
        System.out.println("the name is "+obj.getname());
    }
}