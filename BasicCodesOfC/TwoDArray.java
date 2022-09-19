import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        int matr[][];

        System.out.println("enter row and column");
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        matr = new int[r][c];

        System.out.println("enter the matrix");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("\t"+matr[i][j]);
            }
            System.out.println();
        }

    }
}
