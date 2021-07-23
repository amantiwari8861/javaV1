class Building
{
//   int a=30,b=50;  
  int a,b;  
}

class run
{
    public static void main(String args[])
    {
        Building building1=new Building();
        Building building2=new Building();
        building1.a=60;
        building2.a=70; 

        int c=building1.a+building2.a;
        System.out.println("the value of c is\t " + c+ "\n hello ");
    }
}