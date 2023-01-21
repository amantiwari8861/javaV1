public class Array {

    public static void main(String[] args) {
        // int arr[]=new int[5];
        int arr[]={10,20,30,40,50};
        // arr[0]=50;
        // System.out.println(arr[0]);
   
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
   
    }
}