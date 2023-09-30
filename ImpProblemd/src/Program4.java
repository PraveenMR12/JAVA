import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numbers (separated by commas): ");
        String input = scanner.nextLine();

        String[] numberStrings = input.split(",");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i].trim());
        }
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            counts.put(i, 0);
        }

        for (int number : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    counts.put(i, counts.get(i) + 1);
                }
            }
        }

        System.out.println(counts);
    }
}
