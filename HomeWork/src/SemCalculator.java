import java.util.Scanner;

public class SemCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your 1-8 sem marks:");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		int g=sc.nextInt();
		int h=sc.nextInt();
//		if(a<=800||b<=800||c<=800||d<=800||e<=800||f<=800||g<=800||h<=800)
		double average=averageMarks(a,b,c,d,e,f,g,h);
		System.out.println("average is = "+average);
		sc.close();
	
	}

	static double averageMarks(int a, int b, int c, int d, int e, int f, int g, int h) {
		double result= (a+b+c+d+e+f+g+h)/8;
		return result;
	}

}
