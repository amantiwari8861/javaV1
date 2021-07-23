class StrFxn8
{
    public static void main(String[] args) {
        
        // String s="this is a sentence";
        String name1="Aman";
        // String name2="Amna";
        // System.out.println(s.replace("s", "@"));
        // System.out.println(s.replace("this is", "that"));
        // System.out.println(s.contains("this"));
        // System.out.println(s.endsWith("s"));
        // System.out.println(s.endsWith("e"));
        // System.out.println(name1.compareTo(name2));  // 65-97 =-32
        // System.out.println(name2.compareTo(name1));  // 97-65=32
        // 97-110=-13
        // int i=200;
        // char ch='A';
        // String str1=String.valueOf(i);
        // String str2=String.valueOf(ch);
        // System.out.println("the value of str is "+str1+10);
        // System.out.println("the value of str2 :"+str2);
        // String str3=" ";
        String sent="this is anything  t   t   t  tried";
        // System.out.println(str3.isEmpty());//false (it recognizes the space also)
        // System.out.println(str3.isBlank());//true (ignores space)
        // System.out.println(sent.lastIndexOf("t"));//11
        // System.out.println(sent.indexOf("t"));//0
        // System.out.println(sent.indexOf("t",1));
        // byte strarr[]= name1.getBytes();

        // for (byte b : strarr) {
        //     System.out.println(b);
        // }
        // char pos=name1.charAt(1);
        // System.out.println(pos);
        int pos=0;
        System.out.println(sent.indexOf("t"));
        for (int i = 0; i < sent.length(); i++) {
            pos=sent.indexOf("t",pos+1);
            System.out.println(pos);
            if(pos==sent.lastIndexOf("t"))
            {
                break;
            }
        }
    }
}