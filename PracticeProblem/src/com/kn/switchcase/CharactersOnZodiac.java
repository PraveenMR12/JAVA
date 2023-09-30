package com.kn.switchcase;

import java.util.Scanner;

public class CharactersOnZodiac {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Zodia sign =");
		String a = sc.next();
		zodiacConverter(a);
		sc.close();
	}

	static void zodiacConverter(String a) {
		switch(a) {
		case "Aries":
				System.out.println("Adventurous");
				break;
		case "Taurus":
			System.out.println("Dependable");
			break;
		case "Gemini":
			System.out.println("Expressive");
			break;
		case "Cancer":
			System.out.println("Intuitive");
			break;
		case "Leo":
			System.out.println("Passionate");
			break;
		case "Virgo":
			System.out.println("Analytical");
			break;
		case "Libra":
			System.out.println("Diplomatic");
			break;
		case "Scorpio":
			System.out.println("Determined");
			break;
		case "Sagittarius":
			System.out.println("Philosophical");
			break;
		case "Capricorn":
			System.out.println("Organized");
			break;
		case "Aquarius":
			System.out.println("Original");
			break;
		case "Pisces":
			System.out.println("Compassionate");
			break;
		default:
			System.out.println("Enter the valid Zodiac sign");	
		}
	}
		

}






//output:

/*Enter a Zodia sign =
Virgo
Analytical

Enter a Zodia sign =
Pisces
Compassionate
*/