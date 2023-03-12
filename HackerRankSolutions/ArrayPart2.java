import java.util.*;

public class ArrayPart2
{

    public static boolean canWin(int leap, int[] game) {

        for (int step = game.length; step > 0;) {
            step -= leap;
            try {
                if (game[step] == 0) {
                    continue;
                } else if (game[step - 1] == 0) {
                    step -= 1;
                } else if (game[step + 1] == 0) {
                    step += 1;
                } else {
                    return false;
                }
            } catch (ArrayIndexOutOfBoundsException ae) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
