import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution2
{
    public static List<List<String>> getProductSuggestions(List<String> products,String search)
    {
        // System.out.println(products);
        // System.out.println(search);
        // List<String> sortedProd=products.stream().sorted().collect(Collectors.toList());
        List<List<String>> finalRes=new ArrayList<>(3);
        List<String> temp=null;
        String tempStr;
        for (int i = 0; i < search.length(); i++) 
        {
            tempStr=search.substring(0,i+1);
            temp=new ArrayList<>(3);
            for (int j = 0; j < products.size(); j++) 
            {
                if (products.get(j).startsWith(tempStr) && temp.size()<=3) 
                {
                    temp.add(products.get(j));
                }
            }
            finalRes.add(temp);
        }
        return finalRes;
    }
}
public class Hello2 {

    public static void main(String[] args) {
        //UBS
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String search;
        List<String> products=new ArrayList<>(n);
        sc.nextLine();
        for (int i = 0; i < n; i++) 
        {
            products.add(sc.nextLine());
        }
        search=sc.nextLine();
        Solution2.getProductSuggestions(products,search).forEach(res->{
            System.out.println(res);
        });
        sc.close();
    }
}