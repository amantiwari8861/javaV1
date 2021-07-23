public class StringBuff4 {
    public static void main(String[] args) {
        
        // StringBuffer obj="aman";
        // System.out.println(obj);error
        StringBuffer obj2Buffer=new StringBuffer("amant");
        System.out.println(obj2Buffer.length());

        // System.out.println(obj2Buffer);//amant
        // System.out.println(obj2Buffer.capacity());
        // StringBuffer obj=new StringBuffer();
        // System.out.println(obj.capacity());
        obj2Buffer.append("iwari");
        System.out.println(obj2Buffer);
        System.out.println(obj2Buffer.length());

    }
}
