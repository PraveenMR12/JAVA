import java.util.*;

public class Main2 {
    public static int[] maximumObstacles(int N, int[] E, int Q, int[] K) {
        int[] result = new int[Q];

        // write your Logic here:
        for (int i = 0; i < Q; i++) {
            int energy = K[i];
            int levelsPassed = 0;

            for (int j = 0; j < N; j++) {
                if (E[j] <= energy) {
                    energy -= E[j];
                    levelsPassed++;
                }
            }

            result[i] = levelsPassed;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // INPUT [uncomment & modify if required]
        int N = sc.nextInt();
        int[] E = new int[N];
        for (int i = 0; i < N; i++) {
            E[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] K = new int[Q];
        for (int i = 0; i < Q; i++) {
            K[i] = sc.nextInt();
        }

        sc.close();

        // OUTPUT
        int[] results = maximumObstacles(N, E, Q, K);
        for (int res : results) {
            System.out.println(res);
        }
    }
}