import java.util.Scanner;

public class Quest15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the Christmas tree: ");
        int height = sc.nextInt();

        int spaces = height - 1;
        int stars = 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
            spaces--;
            stars += 2;
        }

        // Printing the trunk
        int trunkHeight = height / 3;
        int trunkWidth = height / 3;

        int trunkTop = height - trunkHeight;
        for (int i = 0; i < trunkHeight; i++) {
            for (int j = 0; j < trunkTop; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < trunkWidth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
