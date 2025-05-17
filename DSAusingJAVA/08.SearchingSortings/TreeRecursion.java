public class TreeRecursion {

    public static void printVal(int num)
    {
        if (num>0) {
            System.out.println("num="+num);
            printVal(num-1);
            printVal(num-1);
        }
    }
    public static void main(String[] args) 
    {
        printVal(3);
    }
}