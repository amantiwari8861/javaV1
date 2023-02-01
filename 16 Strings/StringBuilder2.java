class StringBuilder2
{
    public static void main(String[] args) {
        

        // String class is located at java.lang.String;
        //by default java.lang.*; is imported

        // StringBuffer str=new StringBuffer("hello");
        // StringBuffer str2="hello2"; //error
        String name="Aman";
        // char arr[]={'A','m','a','n','2'};
        StringBuffer str2=new StringBuffer(name); //mutable class in java
        // StringBuffer str4=new StringBuffer(arr);//error char array is not supported
        // System.out.println(str);
        // System.out.println(str2);
        // System.out.println(str4);
        str2.append(" Tiwari");
        System.out.println("the value is :"+str2);

    }
}