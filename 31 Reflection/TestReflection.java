import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {

    public static void main(String[] s) {

        // Class c=String.class;
        // System.out.println(c);
        // c.getFields();
        s = new String[5];
        s[0] = "java.lang.String";
        try {
            Class c = Class.forName(s[0]);
            Method min[] = c.getDeclaredMethods();
            System.out.println("****Methods are*****");
            for (Method mm : min)
                System.out.println(mm);
            Field f[] = c.getDeclaredFields();
            System.out.println("****Fields are*****");
            for (Field ff : f)
                System.out.println(ff);
            Constructor con[] = c.getDeclaredConstructors();
            System.out.println("****Constructors are*****");
            for (Constructor cc : con)
                System.out.println(cc);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}