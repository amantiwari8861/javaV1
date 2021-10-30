package com.pack;
import com.pack2.Engine;
class CarFactory2
{
    Engine objEngine=new Engine();
    int num=100;
     void Fxn() {
        System.out.println("Hii "+num);
        objEngine.startEngine();
    }
    public static void main(String[] args) {

            CarFactory2 obj=new CarFactory2();
            obj.Fxn();
    }
}