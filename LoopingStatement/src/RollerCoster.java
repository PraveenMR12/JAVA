import java.util.Scanner;

public class RollerCoster {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age = sc.nextInt();
		if(age>12) {
			System.out.println("Ride access granted");
		}
		sc.close();
	}

}
