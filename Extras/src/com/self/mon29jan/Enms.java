package com.self.mon29jan;
enum DaysOfWeek {
	// Enum constants (implicitly public, static, and final)
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}

public class Enms {
	public static void main(String[] args) {
		// Using enum constants
		DaysOfWeek today = DaysOfWeek.WEDNESDAY;

		// Switch statement with enum
		switch (today) {
		case MONDAY:
			System.out.println("It's Monday!");
			break;
		case TUESDAY:
			System.out.println("It's Wednesday!");
			break;
		case WEDNESDAY:
			System.out.println("It's Wednesday!");
			break;
		case THURSDAY:
			System.out.println("It's Wednesday!");
			break;
		case FRIDAY:
			System.out.println("It's Wednesday!");
			break;
		case SATURDAY:
			System.out.println("It's Wednesday!");
			break;
		case SUNDAY:
			System.out.println("It's Wednesday!");
			break;
			
		default: 
			System.out.println("Not Found");
			
		}

		// Iterating over enum constants
		for (DaysOfWeek day : DaysOfWeek.values()) {
			System.out.println(day);
		}
	}

}
