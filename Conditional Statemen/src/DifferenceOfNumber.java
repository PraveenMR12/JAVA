import java.util.Scanner;

public class DifferenceOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 2 number to Subtract");
        int a = sc.nextInt();
        int b =sc.nextInt();
        if(a>b)
        {
            System.out.println("Result = " + (a-b));
        }
        else{
            System.out.println("Result = "+ (b-a));
        }
        sc.close();

    }
}
