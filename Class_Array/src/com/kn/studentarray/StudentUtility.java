package com.kn.studentarray;

import java.util.Scanner;

public class StudentUtility {
	Student[] srr;
	Scanner sc = new Scanner(System.in);
	
	public void createStudent() {
		System.out.println("Enter the number of student");
		int n = sc.nextInt();
		srr= new Student[n];
		for(int i=0; i<srr.length; i++) {
			System.out.println("Student "+(i+1));
			System.out.print("\tEnter id :");
			int id = sc.nextInt();
			System.out.print("\tEnter name :");
			String name = sc.next();
			System.out.print("\tEnter marks :");
			int marks = sc.nextInt();
			srr[i]=new Student(id, name, marks);
		}
		
	}
	
	
	public void printStudents() {
		System.out.println("\nStudents in the College is :");
		for(int i=0; i<srr.length;i++) {
			System.out.println("Student "+(i+1));
			System.out.println("\tID = "+srr[i].id+",\n\tName = "+srr[i].name+",\n\tMarks = "+srr[i].marks);
		}
	}
	
	
	public void searchStudentById() {
		System.out.println("Enter the ID to be searched");
		int num = sc.nextInt();
		int high = srr.length-1;
		int low = 0;
		int mid = 0;
		int position=-1;
		while(low<high) {
			mid = (high + low)/2;
			if(srr[mid].id==num) {
				position = mid;
			}else if(srr[mid].id>num) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		if(position==-1) {
			System.out.println("Student not found");
		}else {
			System.out.println("Student id :"+srr[position].id);
			System.out.println("Student name :"+srr[position].name);
			System.out.println("Student marks :"+srr[position].marks);

		}
		
	}
	
	
	public void giveGraceMarks() {
		for(int i=0; i<srr.length;i++) {
			if(srr[i].marks<35) {
				System.out.println(srr[i].name);
				System.out.println("\tExisting Marks of = "+srr[i].marks);
				System.out.println("\tAfter Grace");
				srr[i].marks=35;
				System.out.println("\tUpgraded Marks of = "+srr[i].marks);
			}
		}
	}
	
	
	public void sortAccordingToMarks() {
		for(int i=0; i<srr.length-1;i++) {
			for(int j=0; j<srr.length-1-i;j++) {
				if(srr[j].marks>=srr[j+1].marks) {
					Student temp = srr[j];
					srr[j]=srr[j+1];
					srr[j+1]=temp;
				}
			}
		}
	}
	
	
	public void sortAccordingTOId() {
		for(int i=0; i<srr.length-1;i++) {
			for(int j=0; j<srr.length-1-i;j++) {
				if(srr[j].id>=srr[j+1].id) {
					Student temp = srr[j];
					srr[j]=srr[j+1];
					srr[j+1]=temp;
				}
			}
		}
	}
	
	
	public void searchStudentByName() {
		System.out.println("Enter the Name to be searched");
		String nme = sc.next();
		int position=-1;
		
		for(int i=0; i<srr.length; i++) {
			if(srr[i].name.equalsIgnoreCase(nme)) {
				position=i;
				break;
				
			}
		}
		if(position==-1) {
			System.out.println("Student not found");
		}else {
			System.out.println("Student id :"+srr[position].id);
			System.out.println("Student name :"+srr[position].name);
			System.out.println("Student marks :"+srr[position].marks);

		}
		
	}
	
	
	public void rateApplication() {
		System.out.println("Rate the App in 1-5");
		int rate = sc.nextInt();
		for(int i=0; i<rate; i++) {
			System.out.print("* ");
		}
		
		
	}

}
