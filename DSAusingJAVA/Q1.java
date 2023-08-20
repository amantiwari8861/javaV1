import java.util.HashSet;
import java.util.Set;

class Q1
{
    public static void solution(String s)
    {
        char items[]=s.toCharArray();
        Set<Character> uniquItems=new HashSet<>();
        for (int i = 0; i < items.length; i++) 
        {
            if (items[i]>=65 && items[i]<=90 ||items[i]>=97 && items[i]<=122) 
            {
                if(items[i]=='a'||items[i]=='e'||items[i]=='i'||items[i]=='o'||items[i]=='u'||items[i]=='A'||items[i]=='E'||items[i]=='I'||items[i]=='O'||items[i]=='U')
                {
                    // System.out.println(items[i]);
                    uniquItems.add(items[i]);
                }
            }
        }
        System.out.println(uniquItems.size());
    }
    public static void main(String[] args) {
        
        solution("qwertyueiws");

    }
}