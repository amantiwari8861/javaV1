class StringFxn3
{
    public static void main(String[] args) {
        
        // String str="aman";

        // String arr[]={"aman","apurv","meeta","sudhanshu"};
        // System.out.println("the array length is "+arr.length);

        // String sentence="  hello   everyone  ";//20
        // System.out.println("the actual length of sentence is :"+sentence.length());
        // System.out.println("the length is :"+str.length());
        // String str3=sentence.trim();
        // System.out.println("the string \'"+sentence.trim()+"\' length is :"+sentence.trim().length());

        // System.out.println(str.toUpperCase());
        // System.out.println(str.toLowerCase());
        // char ch[]=str.toCharArray();//string to character array
        // ch[0]=(char)(ch[0]-32); //97 -32=65 (A)
        // String s=new String(ch); //convert character array to string
        // System.out.println(s);
        // String str="aanyhsentence";

        // System.out.println(str.substring(0,3));//aan
        // System.out.println(str.substring(4,str.length()));
        // System.out.println(str.substring(1));
        // System.out.println(str.substring(4));
        // String s1=new String("hello");
        // String s=s1;
        // System.out.println(s);
        // String s3="hello";
        // // System.out.println(s1==s3); //false
        // // System.out.println(s==s3);
        // String str5=s1.intern();
        // System.out.println(str5==s3); //scp
        // System.out.println(str5);

        // is == and equals() is same ?
        // String s1="aman";
        // String s2="aman";
        // //if there is 50 variable with same value then in scp only unique value stores at same memory location
        // System.out.println(s1==s2); //true
        // String s6=new String("aman");
        // String s3=new String("hello");
        // String s4=new String("hello");
        // System.out.println(s3==s4);//both objects stored at different places 
        // System.out.println(s1.equals(s2));//true
        // System.out.println(s3.equals(s4));//true
        // System.out.println(s1.equals(s6));//true

        // Aman equals aman

        // String name="Aman";
        // System.out.println(s1.equalsIgnoreCase(name));
        // String sentence="hello everyone my name is aman";
        // // String strarr[]=sentence.split("\\s");//    \\s is for space 
        // String strarr[]=sentence.split(" ");//    \\s is for space 
       
        // for (String string : strarr) {
        //     System.out.println(string);
        // }
            // String str="hello.Aman";
            // String ch[]=str.split("\\.");
            // System.out.println(ch.length);

            // for (String string : ch) {
            //     System.out.println(string);
            // }
            String fnamString="Aman";
            String lnamString="Tiwari";
            
            // System.out.println(String.join("@",fnamString,lnamString,"is","my","name"));
            String first=String.join("_", fnamString,lnamString); //Aman_Tiwari
            System.out.println(String.join("@",first,"gmail.com","hello"));//  Aman_Tiwari@gmail.com
    }
}