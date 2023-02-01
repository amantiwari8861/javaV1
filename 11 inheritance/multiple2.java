interface p1
{
    int i=100;
}
interface p2
{
    int j=500;
}
interface p3
{
    int k=10000;
    char ch='a';
}

class xyz
{
    int classvar=200;
}

class Main extends xyz implements p1,p2,p3 
{
    public static void main(String[] args) {
        // p1 objP1=new Main();
        // p2 objP2=new Main(); // bad programming practice
        // p3 objP3=new Main();
        // System.out.println("value of i ="+objP1.i+" j = "+objP2.j+" k="+objP3.k);
        xyz obj=new xyz();
        System.out.println("value of i ="+i+" j = "+j+" k="+k+"  "+ch+ " class variable ="+obj.classvar);

    }
} 