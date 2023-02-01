class StringBuffer3
{
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();
        str.append("Aman");
        // str.insert(1,"N");
        // str.insert(0,"Naman");
        // str.insert(0,'N');
        // int num=20;
        // float pi=3.14f;
        // str.insert(1,num);
        // str.insert(1,3.56);
        // str.insert(1,pi);
        // System.out.println(str);
        StringBuffer s=new StringBuffer("hii");
        str.insert(1,s);//Ahiiman
        str.replace(1, 3, "byee"); //Abyeeiman //here 3 is not included
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(1, 3);//3 is not included
        System.out.println("the value is :"+str);
        System.out.println(str.charAt(4));
        // str.toLowercase(); //not supported
    }
}