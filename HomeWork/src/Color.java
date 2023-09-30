import java.util.Scanner;

public class Color {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color");
		char s=sc.next().charAt(0);
		if(s=='v'||s=='i'||s=='b'||s=='g'||s=='y'||s=='o'||s=='r'||s=='V'||s=='I'||s=='B'||s=='G'||s=='Y'||s=='O'||s=='R')
		{
			System.out.print("rainbow color = ");
			if(s=='v'||s=='V')
			{
				System.out.println("violet");
			}else if(s=='i' ||s=='I')
			{
				System.out.println("indigo");
			}else if(s=='b' || s=='B')
			{
				System.out.println("blue");
			}else if(s=='g' || s=='G')
			{
				System.out.println("green");
			}else if(s=='o' || s=='O')
			{
				System.out.println("orange");
			}
			else{
				System.out.println("red");
			}
		}else {
			System.out.println("not a Rainbow color");
		}
		sc.close();
	}

}
