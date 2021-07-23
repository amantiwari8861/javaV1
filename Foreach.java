
public class Foreach {
public static void main(String[] args) {
    int arr[]=new int[]{10,20,30,40,50};
    // for (int i = 0; i < 5; i++) {
    //     System.out.println("the value at arr["+i+"] is "+arr[i]);
    // }
    // System.out.println("the length of array is "+arr.length);
    // for (int i = 0; i < arr.length; i++) {
    //     System.out.println("the value at arr["+i+"] is "+arr[i]);
    // }
        // for (int i : arr) {
        //         // i=i+10;
        //     System.out.println("the value of arr is "+i);
        // }
        // while (true) {
        //     System.out.println("hello");
        // }
        // do{
        //     System.out.println("hii");
        // } while (true);
        // for(;;)
        // {
        //     System.out.println("xyz");
        // }

            for (int i = 0; i < arr.length; i++) {
                // if (i==3) {
                //     break;
                // }
                if (i==3) {
                    continue;
                }
                System.out.println(arr[i]);
            }



}
    
}