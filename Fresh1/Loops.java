public class Loops {
    public static void main(String[] args) {
        
        // int i;
        // for ( i = 1; i <= 10; i++) {
           
        //     System.out.println(i);
        // }
        // for (int i = 0; i < 11; i++) {
        //     System.out.println(i);
        // }
        // int i=10;

        // while (i>0) {
        //     System.out.println(i);
        //     i--;
        // }
        // do {
        //     System.out.println(i);
        //     i--;
        // } while (i>0);
        // for(;;) //infinite for loop
        // {
        //     System.out.println("hii");
        // }
        // while (true) {
        //     System.out.println("hii");
        // }
        // int arr[]={10,20,30,40};

            // for (int i = 0; i < 4; i++) {
            //     System.out.println(arr[i]);
            // }
            // or 
            // System.out.println("array length is "+arr.length);

            // for (int i = 0; i < arr.length; i++) {
            //     System.out.println(arr[i]);
            // }
            //or
            // for (int i : arr) { //foreach loop

            //     System.out.println("the value in i  "+i);

            // }
            //LABELLED LOOP
            last:
            for (int i = 0; i < 10; i++) {
               
                System.out.println(i);

                if (i==5) {
                    break last;
                }
            }
            System.out.println("end of loop");

    }
}
