public class Pattern4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                for (int j = 5; j >= i - 4; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                for (int j = i; j >=1; j--) {
                    System.out.print(" ");
                }
                for (int k = 7; k >=i; k--) {
                    System.out.print(" "+(8-k));
                }
                System.out.println();
            }
        }
        
    }
}