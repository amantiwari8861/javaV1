import java.util.*;

public class ArrayListProblem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        ArrayList<ArrayList<Integer>> aList=new ArrayList<>();
        for(int i=0;i<line;i++)
        {
            int n=sc.nextInt();
            ArrayList<Integer> subList=new ArrayList<>();
            for (int j = 0; j < n; j++) 
            {
               subList.add(sc.nextInt()); 
            }
            aList.add(subList);
        }
        int qsize=sc.nextInt();
        for (int i = 0; i < qsize; i++) 
        {
           int ln=sc.nextInt();
           int pos=sc.nextInt();
           try
           {
                System.out.println(aList.get(ln-1).get(pos-1));
           }
           catch(RuntimeException re)
           {
               System.out.println("ERROR!");
           }
        }
        sc.close();
    }
}