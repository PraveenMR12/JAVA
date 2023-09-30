import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n==0||n==1){
            System.out.println("not a prime");
        }else{
            boolean flag=false;
            for(int i=2; i<n/2; i++){
                if(n%i==0) {
                    System.out.println("not a prime");
                    flag=true;
                    break;
                }
            }if(!flag){
                System.out.println("prime number");
            }
        }
    }
}
