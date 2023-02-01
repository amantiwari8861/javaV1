class StringConstantPool
{
    public static void main(String[] args) {
        //String str=new String("Aman"); //by creating object stores in heap memory 
        //String str3=new String("Aman");
        String str2="Aman"; //string literal stored in StringConstantPool(scp)
        String str4="Aman";
        // System.out.println("the value  of str :"+str+"\n and str2 : "+str2);
        // System.out.println("str is equal to str2 ?  : "+str==str2);
        // System.out.println("str is equal to str3 ?  : ");
        // System.out.print(str==str3);
        System.out.println("str2 is equal to str4 ?  : ");
        System.out.print(str2==str4);
    }
}