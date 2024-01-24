import java.util.Scanner;

public class EqualScoresGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int N = scanner.nextInt();  // Number of turns
        int M = scanner.nextInt();  // Total number of players (always 3)
        int X = scanner.nextInt();  // Cost of rotating a permutation
        int Y = scanner.nextInt();  // Cost of reversing a permutation

        // Initialize scores for each player
        int[] scores = new int[M];

        // Read permutations and accumulate scores
        int[][] permutations = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                permutations[i][j] = scanner.nextInt();
            }
        }

        // Iterate through permutations and accumulate scores
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int originalIndex = permutations[i][j] - 1;
                int rotationCost = Math.min(X, Y);  // Minimum cost for rotating left or right
                scores[(j + originalIndex) % M] += rotationCost;
                scores[(j + originalIndex + 1) % M] += rotationCost;
                scores[(j + originalIndex + 2) % M] += Y;  // Cost for reversing
            }
        }

        // Check if it is possible to have equal scores for all players
        for (int i = 1; i < M; i++) {
            if (scores[i] != scores[0]) {
                System.out.println("-1");  // If not possible, output -1
                return;
            }
        }

        // Output the minimum cost to achieve the objective
        System.out.println(scores[0]);
    }
}
