import java.util.Scanner;

public class Solution {

    static int NO_OF_CHARS = 256; 

    static boolean isAnagram(String a, String b) {
        String alower = a.toLowerCase();
        String blower = b.toLowerCase();

        char[] str1 = alower.toCharArray();
        char[] str2 = blower.toCharArray();

        int count1[] = new int[NO_OF_CHARS];  
        int count2[] = new int[NO_OF_CHARS];
        for(int c=0; c<NO_OF_CHARS; c++){
            count1[c] = 0;
            count2[c] = 0;
        } 

        int i; 
        for (i = 0; i < str1.length && i < str2.length; i++) { 
            count1[str1[i]]++; 
            count2[str2[i]]++; 
        } 

        if (str1.length != str2.length) 
            return false; 

        for (i = 0; i < NO_OF_CHARS; i++) 
            if (count1[i] != count2[i]) 
                return false; 
        return true; 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}