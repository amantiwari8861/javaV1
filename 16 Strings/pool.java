public class pool {
    

    public static void main(String[] args) {
        
        String str="hello"; //string leteral (string constant pool)
        String str1="hello"; //string leteral (string constant pool)
        String str2=new String("hello");// Object (heap memory)
        String str3=new String("hello");// Object (heap memory)

        System.out.println(str==str1);
        System.out.println(str1==str2);
        System.out.println(str2==str3);
    }
}