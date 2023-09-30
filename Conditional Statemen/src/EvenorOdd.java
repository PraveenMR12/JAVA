import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 2 number");
		int a =sc.nextInt();
		int b =sc.nextInt();
		if(a%b==0) {
			System.out.println("it is even");
		
		}else {
			System.out.println("it is odd");
		}
		sc.close();
	}

}
