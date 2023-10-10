import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the Number");
        int n=sc.nextInt();
        int rev=0;
        while(n!=0) {
            rev = rev * 10 + n % 10;  //32
            n = n / 10;
        }
        if(n==rev){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("its not a palindrome");
        }
        sc.close();
    }
}
