class abc
{
    abc(){num=30;}
    //const to make constant in c
    final float PI=3.14F; //read only variable
    final int num;//blank final variable
    void fxn()
    {
        // PI=50; //error we cannot change a constant value 
        //num=100; //you can't initialize here
        final char ch;
        ch='A';
        System.out.println("the value of pi and num is "+PI+" "+num);
        System.out.println("the value of pi and ch is "+PI+" "+ch);
    }
}
class Main
{
    public static void main(String[] args) {
        abc obj=new abc();
        obj.fxn();
    }
}
//if you use final keyword before any variable then u cannot change it's value (i.e final makes variable constant)
//you cannot  initialize a blank final variable in a function
//you can declare/initialize and use a blank final variable in any function locally
//you can initialize a blank final instance variable in a constructor