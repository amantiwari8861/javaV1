public class pool {
    

    public static void main(String[] args) {
        
        String str="hello"; //string constant pool
        String str2=new String("hello");//heap memory
        String str3=new String("hello");//heap memory

        System.out.println(str==str2);
    }
}