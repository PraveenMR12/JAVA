import java.util.Scanner;

public class Jump {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the range of number=");
	int range = sc.nextInt();
	for(int i=1; i<=range; i++) {
		if(i%7==0) {
			System.out.println(i+" is divisible by 3");
			break;
			
		}else {
			System.out.println(i+ "not divisible by 3");
		}
		System.out.println("within the body of for loop");
	}
	System.out.println("--- The End ---");
	sc.close(); 
}
}
