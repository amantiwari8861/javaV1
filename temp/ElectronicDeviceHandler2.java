import java.util.Scanner;

class ElectronicDevice
{
    String brandName;
    boolean powerStatus;
    double height;
    float width;
    double price;
    int itemNo;
    String modelNo;
    Scanner sc;

    ElectronicDevice(Scanner s)
    {
        brandName="Realme";
        sc=s;
    }
    ElectronicDevice(String bn,boolean isOn,double h,float w,double p,int idno,String mn)
    {
        brandName=bn;
        powerStatus=isOn;
        height=h;
        width=w;
        price=p;
        itemNo=idno;
        modelNo=mn;
    }
    void inputDeviceDetails()
    {
        sc.nextLine();
        System.out.println("\n*************** Enter Device Details *****************");
        System.out.print("Enter Brand Name :");
        brandName=sc.nextLine();
        System.out.print("Is Device On :");
        powerStatus=sc.nextBoolean();
        System.out.print("Enter Height :");
        height=sc.nextDouble();
        System.out.print("Enter Width :");
        width=sc.nextFloat();
        System.out.print("Enter price :");
        price=sc.nextDouble();
        System.out.print("Enter Item no :");
        itemNo=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Model No. :");
        modelNo=sc.nextLine();
    }
    void printDeviceDetails()
    {
        System.out.println("\n**** Electronic Device Details **********");
        System.out.println("brandName :"+brandName);
        System.out.println("powerStatus :"+powerStatus);
        System.out.println("height :"+height);
        System.out.println("width :"+width);
        System.out.println("price :"+price);
        System.out.println("itemNo :"+itemNo);
        System.out.println("Model No. :"+modelNo);
        System.out.println("*******************************************");
    }
}
public class ElectronicDeviceHandler2
{
    public static void main(String[] args) 
    {
        // ElectronicDevice phone=new ElectronicDevice();
        // phone.printDeviceDetails();

        // ElectronicDevice phone2=new ElectronicDevice("Redmi",true,5.6,2.5f,18000,10001,"Redmi Note 13");
        // phone2.printDeviceDetails();

        // ElectronicDevice laptop=new ElectronicDevice();
        // laptop.inputDeviceDetails();
        // laptop.printDeviceDetails();
        
        Scanner sc=new Scanner(System.in);

        ElectronicDevice devices[];
        System.out.print("How many electronic devices data u wanna input:");
        int n=sc.nextInt();
        devices=new ElectronicDevice[n];
        for (int i = 0; i < devices.length; i++) 
        {
            devices[i]=new ElectronicDevice(sc);
            devices[i].inputDeviceDetails();
        }
        System.out.println("All Devices Details:");
        for (int i = 0; i < devices.length; i++) 
        {
            devices[i].printDeviceDetails();
        }
        sc.close();
    }
}