public class WrapperClasses {
    public static void main(String[] args) {
        
        //there are 8 primitive data types
        //int, double, float, long, short, byte, boolean, char

        // int i=100;
        // Integer i1=Integer.valueOf(i);//convert int to Integer object (Boxing)
        // System.out.println("Integer :"+i1);

        // int i2=i1.intValue();//convert Integer object to int (Unboxing)
        // System.out.println("int :"+i2);

        //auto boxing
        // Integer num=i;
        // System.out.println("Integer :"+num);

        //auto unboxing
        // int i3=num;
        // System.out.println("int :"+i3);

        // System.out.println(num.getClass().getName()+" class Object");


        Byte b=127;
        Short s=32767;
        Integer i4=2147483647;
        Long l=9223372036854775807L;
        Float f=3.14f;
        Double d=3.14;
        Boolean b1=true;
        Character c='A';

        System.out.println(b.getClass().getName()+" class Object & value = "+b);
        System.out.println(s.getClass().getName()+" class Object & value = "+s);
        System.out.println(i4.getClass().getName()+" class Object & value = "+i4);
        System.out.println(l.getClass().getName()+" class Object & value = "+l);
        System.out.println(f.getClass().getName()+" class Object & value = "+f);
        System.out.println(d.getClass().getName()+" class Object & value = "+d);
        System.out.println(b1.getClass().getName()+" class Object & value = "+b1);
        System.out.println(c.getClass().getName()+" class Object & value = "+c);




    }
}
