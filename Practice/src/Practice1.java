import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Take the 1st input and sort in descending order
        System.out.println("Enter the 1st input (numbers separated by space):");
        String[] input1 = scanner.nextLine().split("\\s");
        Arrays.sort(input1, (a, b) -> Integer.parseInt(b) - Integer.parseInt(a));
        System.out.println("Sorted in descending order: " + Arrays.toString(input1));

        // Task 2: Take the 2nd input and round off to 2 digits
        System.out.println("Enter the 2nd input (a number):");
        double input2 = scanner.nextDouble();
//        double roundedValue = Math.round(input2 * 100.0) / 100.0;
        BigDecimal dec = new BigDecimal(input2).setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println("Rounded to 2 digits: " + dec);

        // Task 3: Take the 3rd input, convert to BigDecimal, subtract, and print the value
        System.out.println("Enter the 3rd input (a number):");
        BigDecimal input3 = new BigDecimal(scanner.next());
        BigDecimal subtractionResult = input3.subtract(BigDecimal.TEN);
        System.out.println("Subtraction result: " + subtractionResult);

        // Task 4: Take the 4th input and sort in ascending order
        System.out.println("Enter the 4th input (numbers separated by space):");
        String[] input4 = scanner.nextLine().split("\\s");
        Arrays.sort(input4);
        System.out.println("Sorted in ascending order: " + Arrays.toString(input4));
    }
}
