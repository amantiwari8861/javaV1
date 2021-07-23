class ToStr2 {
   
    String name;//instance variable //Aman
   
   ToStr2(String name)
   {
       this.name=name;
   }
    public String toString() {
       return "hello "+name;
   }
}
class Main
{
    public static void main(String[] args) {
    
        ToStr2 obj=new ToStr2("Aman");//obj is reference variable

        System.out.println("the name is :"+obj);//before toString it's giving the address

    }
}
