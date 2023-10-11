package com.kn.studentarray;

import java.util.Scanner;

public class StudentUtilityDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentUtility student = new StudentUtility();
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("1.Create Student\t2.Display Students\t3.Search student\t4.Sort Student\t5.Give Grace Marks\t6.Rate the Application\t7.Close");
			System.out.println("Choose the Right option");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				student.createStudent();
				break;
				
			case 2:
				student.printStudents();
				break;
	
			case 3:
				System.out.println("1.Search Student By ID\t2.Search Student By Name\t3.Close");
				System.out.println("Select the option");
				int opt1=sc.nextInt();
				switch(opt1) {
				case 1:
					student.searchStudentById();
					break;
					
				case 2:
					student.searchStudentByName();
					break;
					
				case 3:
					isTrue=false;
					break;
					
					default:
						System.out.println("You selected wrong option");
				}
				break;
			case 4:
				System.out.println("1.Sort Student By ID\t2.Sort Student By Marks\t3.Close");
				System.out.println("Select the option");
				int opt2=sc.nextInt();
				switch(opt2) {
				case 1:
					student.sortAccordingTOId();
					break;
					
				case 2:
					student.sortAccordingToMarks();
					break;
				case 3:
					isTrue =false;
					break;
					
					default:
						System.out.println("You selected wrong option");
				}
				break;
				
			case 5:
				student.giveGraceMarks();
				break;
	
			case 6:
				student.rateApplication();
				break;
			case 7:
				isTrue= false;
				break;
	
				default:
					System.out.println("You selected wrong option");
					
			}
		}
		
		sc.close();
		
	}

}
