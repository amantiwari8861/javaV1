import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

    public static void main(String[] args) {
        
        StringBuilder s=new StringBuilder("Hello aman sir.");
        // Pattern p=Pattern.compile("AmAn");
        Pattern p=Pattern.compile("AmAn",Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(s);

        // System.out.println(m);
        // if (m.find()) {
        //     System.out.println(m);
        //     System.out.println("Match found");
        //     System.out.println(m.group());
        // }
        // else
        // {
        //     System.out.println("Match not found");
        // }
        s.append("how r u AmAn");
        m=p.matcher(s);
        while (m.find()) 
        {
            System.out.println("Pattern found from "+m.start()+" to "+(m.end()-1));
        }
        // System.out.println(Pattern.matches("[a-z]","g"));
        // System.out.println(Pattern.matches("[a-z]","Ag"));//regex given for only single character
        // System.out.println(Pattern.matches("[A-Z][a-z]","Ag"));//regex given for only single character
        System.out.println(Pattern.matches("\\p{Lower}","g"));//regex given for only single character
    }
}