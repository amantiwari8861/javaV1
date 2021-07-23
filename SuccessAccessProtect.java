package com.pack1.pack11;
import com.package2.differentpack;
 class SuccessAccessProtect extends differentpack{
    void fxn3()
    {
        // super.fxn();
        fxn();
    }
public static void main(String[] args) {
    SuccessAccessProtect obj=new SuccessAccessProtect();
    obj.fxn3();
    // differentpack obj2=new differentpack();
    // obj2.fxn();  //error
    // fxn();  //error
}
}