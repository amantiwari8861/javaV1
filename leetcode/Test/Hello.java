import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Solution
{
    public static List<List<String>> getProductSuggestions(List<String> products,String search)
    {
        // System.out.println(products);
        // System.out.println(search);
        // List<String> sortedProd=products.stream().sorted().collect(Collectors.toList());
        List<List<String>> finalRes=new ArrayList<>();
        List<String> temp=null;
        String tempStr;
        for (int i = 0; i < search.length(); i++) 
        {
            tempStr=search.substring(0,i+1);
            temp=new ArrayList<>();
            for (int j = 0; j < products.size(); j++) 
            {
                if (products.get(j).startsWith(tempStr) && temp.size()<3) 
                {
                    temp.add(products.get(j));
                }
            }
            Collections.sort(temp);
            finalRes.add(temp);
        }
        return finalRes;
    }
}
public class Hello {

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
        Solution.getProductSuggestions(products,search).forEach(res->{
            System.out.println(res);
        });
        sc.close();
    }
}