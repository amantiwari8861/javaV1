package com.pack.aman;
//class One  //default access modifier
public class One 
{
    //private>default>protected>public     //security level (Scope)
    //packages 
    // void fxn()  //default 
    public void fxn()  //public
    {
        System.out.println("hello");
    }
}
class Run
{
    public static void main(String[] args) {
        One objChild=new One();
        objChild.fxn();
    }
}
// javac -d . Filename.java  //to compile
// java pack.subpack.Run    //to run