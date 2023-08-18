import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		if (a>=10) {
			System.out.println("if body");
			if (a>=15) {
				System.out.println("if if body");
				
			}else {
				System.out.println("if else body");
			}
		}else {
			System.out.println("else body");
			if(a>5) {
				System.out.println("else body");
				
			}else{
				System.out.println("else else body ");
			}
		}
		System.out.println("--- The End ---");
		sc.close();
	}

}
