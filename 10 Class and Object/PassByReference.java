import java.util.Arrays;

class Marksheet
{
    void update(int arr[])//here the main fxn passes the array as a reference
    {
        arr[0] = 100;
        arr[1] = 90;
        arr[2] = 80;
        arr[3] = 70;
        arr[4] = 60;
    }
}
public class PassByReference {
    public static void main(String[] args) {
        Marksheet m = new Marksheet();
        int arr[] = {10,20,30,40,50};
        //array is also an collection of objects
        m.update(arr);
        System.out.println(Arrays.toString(arr));
    }
}