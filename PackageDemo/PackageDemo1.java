package com.pack;


class CarFactory
{
    int num=100;
    public void Fxn() {
        System.out.println("Hii "+num);
    }
}

class PackageDemo1
{
    public static void main(String[] args) {

            CarFactory obj=new CarFactory();
            obj.Fxn();
    }
}