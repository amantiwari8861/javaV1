import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class HourGlass 
{
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new
        // InputStreamReader(System.in));

        // List<List<Integer>> arr = new ArrayList<>();

        // IntStream.range(0, 6).forEach(i -> {
        // try {
        // arr.add(
        // Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        // .map(Integer::parseInt)
        // .collect(toList())
        // );
        // } catch (IOException ex) {
        // throw new RuntimeException(ex);
        // }
        // });

        // bufferedReader.close();

        // arr.forEach(line -> {
        // line.forEach(e->{
        // System.out.print(e+" ");
        // });
        // System.out.println();
        // });
        int matr[][] = new int[6][6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = sc.nextInt();
            }
        }
        int sum = 0, tempsum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tempsum = matr[i][j] + matr[i][j + 1] + matr[i][j + 2] + matr[i + 1][j + 1] + matr[i + 2][j]
                        + matr[i + 2][j + 1] + matr[i + 2][j + 2];
                if (i == 0 && j == 0) {
                    sum = tempsum;
                } else {
                    if ((tempsum > sum))
                        sum = tempsum;
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
/* Java 2D Array
You are given a 6∗6 2D array. An hourglass in an array is a portion shaped like this:
a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually there are many hourglasses in the array above. The three leftmost hourglasses are the following:
1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.
In this problem you have to print the largest sum among all the hourglasses in the array.
Input Format
There will be exactly 6 lines, each containing 6 integers seperated by spaces. Each integer will be between −9 and 9 inclusive.
Output Format
Print the answer to this problem on a single line.
Sample Input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output
19 
*/