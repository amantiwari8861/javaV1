import java.util.ArrayList;
import java.util.Arrays;

public class Hashing {

    static int hashFxn(int key)
    {
        int modifiedKey=key%64;
        return modifiedKey;
    }
    public static void main(String[] args) 
    {
        // 2^32 is max size of array

        ArrayList<Integer> key=new ArrayList<>(Arrays.asList(7,12,64,71,83));
        ArrayList<Integer> value=new ArrayList<>(Arrays.asList(5,4,3,9,8));
        ArrayList<Integer> mKey=new ArrayList<>();

        for (int i = 0; i < key.size(); i++) 
        {
            mKey.add(hashFxn(key.get(i)));
        }
        System.out.println(mKey);
        

    }
}