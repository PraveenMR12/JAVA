import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a charector");
		char a=sc.next().charAt(0);
		if(a =='a'|| a=='e'|| a=='i'|| a=='o' ||a=='u'|| a=='A'||a== 'E'||a=='I'||a=='O'||a=='U'){
			System.out.println("the given character "+a+ " is a vowel");
		}
		else {
			System.out.println("the given character "+a+ " is a consanent");
		}
		sc.close();
	}

}
