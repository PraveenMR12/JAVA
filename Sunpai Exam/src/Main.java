import java.util.*;

public class Main {

    public static int elementRemoval(int N, int K, int[] A) {
        // Write your logic here
        int result = 0;
        Map<Integer, Integer> freqCount = new HashMap<>();

        // Count the frequency of each element
        for (int num : A) {
            freqCount.put(num, freqCount.getOrDefault(num, 0) + 1);
        }

        // Calculate the minimum number of elements to be removed
        for (int count : freqCount.values()) {
            if (count % K != 0) {
                result += count % K;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // INPUT [uncomment & modify if required]
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        
        // OUTPUT [uncomment & modify if required]
        int b = elementRemoval(n,k,a);
        System.out.println(b);
        sc.close();
        }
}