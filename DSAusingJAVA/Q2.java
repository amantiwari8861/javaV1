import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int numMarks=sc.nextInt();
        sc.nextLine();
        String marks[]=sc.nextLine().split(" ");
        List<Integer> allMarks=new ArrayList<>(numMarks);
        for (String string : marks) 
        {
            allMarks.add(Integer.parseInt(string) );
        }
        int min=sc.nextInt();
        int max=sc.nextInt();

        List<String> output=new ArrayList<>();

        Collections.sort(allMarks);

        // for (Integer integer : allMarks) 
        // {
        //     System.out.println(integer+" "+integer.getClass());
        // }

        
    }
}