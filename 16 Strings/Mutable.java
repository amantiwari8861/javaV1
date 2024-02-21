
public class Mutable 
{
    public static void main(String[] args) {
        
        // String str="Aman";
        // str.concat(" tiwari");
        // System.out.println(str);
        StringBuffer sbuff=new StringBuffer();
        StringBuilder sbuild=new StringBuilder();

        sbuff.append(1);
        sbuff.append(".Aman");
        // System.out.println(sbuff);
        // sbuff.insert(2,"_Tiwari_");
        // System.out.println(sbuff);
        // sbuff.delete(2, 4);
        // System.out.println(sbuff);
        // sbuff.replace(2, 8, "Singh");
        // System.out.println(sbuff);
        // sbuff.reverse();
        // System.out.println(sbuff);
        // System.out.println(sbuff.lastIndexOf("n"));
        // System.out.println(sbuff.indexOf("h"));

        // String str2=new String(sbuff);
        // System.out.println(str2);

        // String str3=10;
        // String str3="Aman_"+String.valueOf(2024);
        // System.out.println(str3);

        // String str4="100";
        // String str5="120";
        // int sum= Integer.parseInt(str4)+Integer.parseInt(str5);
        // // System.out.println(str4+str5);
        // System.out.println(sum);


        // StringBuffer sb3=new StringBuffer("Aman");

        byte nums[]="Aman".getBytes();
        for (byte i : nums) 
        {
            System.out.println(i);
        }
        String str4=new String(nums);
        System.out.println(str4);

    }
}