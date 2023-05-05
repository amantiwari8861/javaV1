class one
{
    int var;//instance variable
    void show()   {        System.out.println("in show fxn var = "+var);    }
    // one(int var2)
    one(int var)//here var is local variable
    {
      // var=var2;
      // var=var; //here compiler is confused that local variable is assigning to instance variable or instance variable is assigning to local variable
      this.var=var;
      // System.out.println("the value sent from main is "+var);
      this.show();
    }
}
class This 
{
    public static void main(String[] args) {
        one obj=new one(10);
        // obj.show();
    }
}
//this represents to current class object and this.var represents to instance variable of current class
//this.var=var;
//this is generally used for differentiating between instance variable(global) and local variable