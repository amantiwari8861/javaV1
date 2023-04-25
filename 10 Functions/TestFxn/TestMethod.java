import java.util.Scanner;

class TestMethod
{
    //No argument no return type
    void greet()
    {
        System.out.println("Good Morning Sir");
    }
    //with argument no return type
    void add(int arr[])
    {
        int sum=0;
        for (int i : arr) 
        {
            sum=sum+i;
        }
        System.out.println("the sum is "+sum);
    }
    //no argument with return type
    double getPieValue()
    {
        return 3.14;
    }
    //with argument and return type
    double volumeOfCylinder(double r,double h)
    {
        // return 3.14*r*r*h;
        // return getPieValue()*Math.pow(r,2)*h;
        return Math.PI*Math.pow(r,2)*h;
    }

    public static void main(String args[])
    {
        // greet();
        TestMethod myobj=new TestMethod();
        // myobj.greet();
        // myobj.greet();
        // myobj.greet();
        // int arr[]={10,23,2,4,56,9};
        // myobj.add(arr);
        // myobj.add(new int[]{4,6,8,12,9,10});
        // myobj.add(new int[]{4,6,1,9,10});
        // myobj.add(new int[]{4,9,10});
        // myobj.add(new int[]{4,6,10});
        
        
        // double res=Math.pow(2,9);
        // System.out.println("the result is "+res);

        // double pi=myobj.getPieValue();
        // System.out.println(pi);

        // double result=myobj.volumeOfCylinder(2, 3);
        // System.out.println(result);
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter r and h");
        double r=sc.nextDouble();
        double h=sc.nextDouble();
        double result=myobj.volumeOfCylinder(r,h);
        System.out.println(result);


        //shortcut
        // System.out.println("Enter r and h");
        // double result2=myobj.volumeOfCylinder(sc.nextDouble(),sc.nextDouble());
        // System.out.println(result2);


    }
}