import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Practice2 {

	public static void main(String[] args) {
		System.out.println(validateEmail("test@example.com")); // true
		System.out.println(validatePanNumber("ABCDE1234F")); // true
		System.out.println(validateMobileNumber("9876543210")); // true
		System.out.println(validatePincode("560001")); // true

	}
	public static boolean validateEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static boolean validatePanNumber(String panNumber) {
		String panRegex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		Pattern pattern = Pattern.compile(panRegex);
		Matcher matcher = pattern.matcher(panNumber);
		return matcher.matches();
	}

	public static boolean validateMobileNumber(String mobileNumber) {
		String mobileRegex = "^[6-9]\\d{9}$";
		Pattern pattern = Pattern.compile(mobileRegex);
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}

	public static boolean validatePincode(String pincode) {
		String pincodeRegex = "^[1-9][0-9]{5}$";
		Pattern pattern = Pattern.compile(pincodeRegex);
		Matcher matcher = pattern.matcher(pincode);
		return matcher.matches();
	}


}
