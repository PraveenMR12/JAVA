public class ArithmeticOperations {
    public static int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public static double divideNumbers(int num1, int num2) {
        
        return num1/(double)num2;
    }

    public static int findRemainder(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        int subtractResult = subtractNumbers(20, 5);
        int multiplyResult = multiplyNumbers(4, 5);
        double divideResult = divideNumbers(20, 3);
        int remainderResult = findRemainder(10, 3);

        System.out.println(subtractResult);  
        System.out.println(divideResult); 
        System.out.println(multiplyResult);
        System.out.println(remainderResult);   
}
}
