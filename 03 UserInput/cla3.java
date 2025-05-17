import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class cla3 {
    public static void main(String[] data) { // commandline argument

        // System.out.println(data[0]);
        // System.out.println(data[0].getClass());
        // byte b = Byte.parseByte(data[0]);
        // short s = Short.parseShort(data[1]);
        // int a = Integer.parseInt(data[2]);
        // long l = Long.parseLong(data[3]);
        // float f = Float.parseFloat(data[4]);
        // double d = Double.parseDouble(data[5]);
        // boolean bool = Boolean.parseBoolean(data[6]);
        // char ch = data[7].charAt(0);
        // System.out.println(ch);
        // // boolean ch2=Character.isUpperCase('B');

        // System.out.println(" All values ");
        // System.out.println("b :"+b);
        // System.out.println("s :"+s);
        // System.out.println("a :"+a);
        // System.out.println("l :"+l);
        // System.out.println("f :"+f);
        // System.out.println("d :"+d);
        // System.out.println("bool :"+bool);
        // System.out.println("ch :"+ch);

        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);

        // int i=-1;
        // System.out.println(i);

        // List<int> numsList=new ArrayList<>();

        // int num = 50;
        // Integer i = num;// auto-boxing
        // i=null;
        // int num2=i;// un-boxing
        // System.out.println(i);
        // System.out.println(i.getClass().getName());
        // System.out.println(num2);

        // int a,b,result;
        // a=10;
        // b=20;
        // result=a+b;
        // System.out.println(result);
        // List<Number> numsList=new ArrayList<>();
        List<String> numsList = new ArrayList<>();
        numsList.add(10);
        numsList.add(2);
        numsList.add(99);
        // numsList.add("aman");
        // numsList.add(10.566);
        // numsList.add(10.566f);
        // numsList.add(true);

        Collections.sort(numsList);

        System.out.println("***********************");
        // for (Object obj : numsList) {
        for (Integer obj : numsList) {
            System.out.println(obj + " " + obj.getClass().getName());
        }

        // numsList.

    }
}