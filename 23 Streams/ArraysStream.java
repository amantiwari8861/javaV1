import java.util.Arrays;

public class ArraysStream {
    public static void main(String pars[]) {
        int no [] = { 11,22,33,44,55,66};
        Arrays.stream(no)
            .filter(n -> n%3 == 0 || n%5 == 0)
            .forEach(System.out::print);
    }
}