package com.pack;
//accesible
class Person
{
    int data=10;
    public int data2=100;
    private int data3=200;
    protected int data4=300;
    void show()
    {
        System.out.println(" public "+data2);
        System.out.println(" private "+data3);
        System.out.println(" protected "+data4);
        System.out.println(" default "+data);
    }
}
class InnerPerson {
    public static void main(String[] args) {
        Person objPerson2=new Person();
        // System.out.println(objPerson2.data3); //private
        System.out.println(objPerson2.data4);

        objPerson2.show();
    }
}

