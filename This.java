class one
{
    int var;
    one(){
        System.out.println("default constructor ");
    }
    void show()
    {
        System.out.println("show any value "+var);
    }
    one(int var2)
    {
      //  this.var=var;
    //   this.var=var;
      var=var2;
      System.out.println("the value sent from main is "+var);
    }
}
class Main 
{
    public static void main(String[] args) {
        one obj=new one(10);
        obj.show();
    }
}