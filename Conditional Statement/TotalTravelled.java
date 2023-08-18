import java.util.*;

public class TotalTravelled {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        JourneyCalculator calculator = new JourneyCalculator();
        double distance = calculator.calculateDistance(120, 20);
        System.out.println(distance);
        sc.close();
    }
}
