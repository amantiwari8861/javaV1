public class Obj {

    public static void main(String[] args) {
        
        Object object=(Object)true;
        System.out.println(object);
        System.out.println(object instanceof Boolean);
        boolean b=(boolean)object;
        System.out.println(b);
    }
}