import java.util.ArrayList;

public class WrapperClass 
{
    public static void main(String[] cla) 
    {
        //command line argument
        // System.out.println("the value passed at cmd is "+cla[0]);
        // System.out.println("the value passed at cmd is "+cla[1]);
        // // System.out.println(cla[0]+cla[1]); //it will be concatenated
        // int sum=Integer.parseInt(cla[0])+Integer.parseInt(cla[1]);
        // System.out.println("the sum is "+sum);


        // Integer j=Integer.valueOf(20);
        // Integer j=20;//auto-boxing
        // System.out.println(j.getClass().getName());
        // System.out.println("value of j object "+j);
        // int k=j;//unboxing
        // System.out.println("value of k primitive int "+k);

        ArrayList al=new ArrayList();
        // ArrayList<int> al=new ArrayList<>();
        // ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add("Abc");
        System.out.println(al.get(0).getClass());
        System.out.println(al);
        
    }
}