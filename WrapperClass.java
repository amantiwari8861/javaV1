import java.util.ArrayList;
public class WrapperClass {
    public static void main(String[] cla) 
    {
        // System.out.println("the value passed at cmd is "+cla[0]);
        // System.out.println("the value passed at cmd is "+cla[1]);
        // System.out.println(cla[0]+cla[1]);
        // int sum=Integer.parseInt(cla[0])+Integer.parseInt(cla[1]);
        // Integer j=Integer.valueOf(20);
        // Integer j=20;//auto-boxing
        // int k=j;//unboxing
        // System.out.println(k);
        // ArrayList<int> arrO=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(20);// AUTOBOXING OCCURING HERE
        arr.add(30);
        arr.add(40);
        arr.remove(1);
        System.out.println("length : "+arr.size()+" 1th index : "+arr.get(1));
        for (int num : arr) {
            System.out.println(num);
        }
    }
}