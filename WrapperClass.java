import java.util.ArrayList;

public class WrapperClass 
{
    public static void main(String[] cla) 
    {
        System.out.println("the value passed at cmd is "+cla[0]);
        System.out.println("the value passed at cmd is "+cla[1]);
        System.out.println(cla[0]+cla[1]);
        // int sum=Integer.parseInt(cla[0])+Integer.parseInt(cla[1]);
        // System.out.println("the sum is "+sum);


        // Integer j=Integer.valueOf(20);
        // // Integer j=20;//auto-boxing
        // System.out.println(j.getClass().getName());
        // System.out.println("value of j object "+j);
        // int k=j;//unboxing
        // System.out.println("value of k primitive int "+k);

        // ArrayList<int> arrO=new ArrayList<>();
        // ArrayList<Integer> arr=new ArrayList<>();
        // arr.add(20);// AUTOBOXING OCCURING HERE
        // arr.add(30);
        // arr.add(40);
        // System.out.println("at 1th index "+arr.get(1));
        // System.out.println(arr.get(1).getClass().getName());

        // System.out.println("length : "+arr.size()+" 1th index : "+arr.get(1));
        // for (int num : arr) {
        //     System.out.println(num);
        // }
    }
}