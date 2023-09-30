//write a cgpa as an input from a user and if cgpa >=90 A grade,
//											cgpa>=75 & <90 B grade 
//											cgpa>=60 & <75 C grade
//											cgpa>=45 & <60 D grade
//											cgpa>=35 & <45 E grade
//											cgpa<35 Try again grade

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=sc.nextInt();
		if(marks>=90) {
			System.out.println("A Grade");
		}else if(marks>=75 && marks<=90){
			System.out.println("B grade");
			
		}
		sc.close();
		
	}

}
