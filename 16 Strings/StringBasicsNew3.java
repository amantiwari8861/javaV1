class StringFxn3
{
    public static void main(String[] args) {
        
        // String arr[]={"aman","apurv","meeta","sudhanshu"};
        // System.out.println("the array length is "+arr.length);
        
        // String sentence="  hello   everyone  ";//20
        // System.out.println("the actual length of sentence is :"+sentence.length());
        // String str3=sentence.trim();
        // System.out.println(str3.length());
        // System.out.println("the string \'"+sentence.trim()+"\' length is :"+sentence.trim().length());
        // System.out.println(sentence.length().trim());// ??
        
        // String name="aman";
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());

        // char ch[]=name.toCharArray();//string to character array
        // ch[0]=(char)(ch[0]-32); //97-32=65 (A)
        // String s=new String(ch); //convert character array to string
        // System.out.println(s);

        // String str="aanyhsentence";
        // System.out.println(str.substring(1));
        // System.out.println(str.substring(4));
        // System.out.println(str.substring(0,3));//aan
        // System.out.println(str.substring(4,str.length()));

        // String s1=new String("hello");
        // String s=s1;
        // System.out.println(s);
        // String s3="hello";
        // // System.out.println(s1==s3); //false
        // // System.out.println(s==s3);  //false

        // String str5=s1.intern();
        // System.out.println(str5==s3); //scp
        // System.out.println(str5);

        // String name="Aman";
        // System.out.println(name.equals("aman"));
        // System.out.println(name.equalsIgnoreCase("aman"));

        // String sentence="hello everyone my name is aman";
        // String strarr[]=sentence.split("\\s");//    \\s is for space 
        // String strarr[]=sentence.split(" ");//    \\s is for space 
       
        // for (String string : strarr) 
        // {
        //     System.out.println(string);
        // }

        // String str="hello.Aman.tiwari";
        // String ch[]=str.split("\\.");//here regular expression
        // System.out.println(ch.length);

        // for (String string : ch) 
        // {
        //     System.out.println(string);
        // }

        // String fnamString="Aman";
        // String lnamString="Tiwari";
        
        // System.out.println(String.join("@",fnamString,lnamString));
        // System.out.println(String.join("@",fnamString,lnamString,"is","my","name"));
        // System.out.println(String.join(" ",ch));

        // String first=String.join("_", fnamString,lnamString); //Aman_Tiwari
        // System.out.println(String.join("@",first,"gmail.com","hello"));//  Aman_Tiwari@gmail.com@hello
    }
}