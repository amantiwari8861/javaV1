import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonsterHunter {

    public static int[] destroyMonsters(int[][] A, int[][] B) {
        List<int[]> monsters = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = A[i][0]; j <= A[i][1]; j++) {
                monsters.add(new int[]{j, A[i][2]});
            }
        }
        monsters.sort((a, b) -> a[0] - b[0]);
        int[] result = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            int count = 0;
            for (int j = 0; j < monsters.size(); j++) {
                if (monsters.get(j)[0] > B[i][0]) {
                    break;
                }
                if (monsters.get(j)[1] < B[i][1]) {
                    count++;
                }
            }
            result[i] = monsters.size() - count;
            monsters.subList(0, count).clear();
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] A = {{1,3,7},{2,5,4}};
        int[][] B = {{3,5},{5,8}};
        int[] result = destroyMonsters(A, B);
        System.out.println(Arrays.toString(result)); // Output: [11, 9]
    }
}
