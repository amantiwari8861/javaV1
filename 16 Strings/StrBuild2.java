class StrBuild2
{
        public static void main(String[] args) {
        //StringBuilder str=new StringBuilder();
        //System.out.println("the default size is : "+str.capacity()); //16 bytes
        
        // StringBuilder str2=new StringBuilder(20);
        // System.out.println("the user-defined size is : "+str2.capacity()); //20 bytes
        //StringBuilder str3=new StringBuilder("hello");
        // System.out.println(str3);
        StringBuilder str2=new StringBuilder(5);
        System.out.println("the user-defined old capacity(size) is : "+str2.capacity()); //
        str2.append("hel");// 12 capacity
        // str2.append("hello_s");// 12 capacity
        // str2.append("123456789abcdefghijbhvjbj");
        System.out.println("the length is "+str2.length());
        System.out.println("the new capacity(size) of str2 is "+str2.capacity());
        // = (oldcapacity*2)+2
        // = (5*2)+2 ==> 12 ans.
    }
}