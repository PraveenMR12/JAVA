import java.util.Scanner;

class Base{
    int x;
    public static void greeting(){
        System.out.println("good morning");
    }
    Base(){
        System.out.println("hii my name is base");
    }
    Base(int x){
        System.out.println("hii its base with x = "+x);
    }
}

class Derived extends Base{
    int y;
    public void greet(){
        System.out.println("good evening");

    }
    Derived(){
        System.out.println("hii my name is Derived");
    }

    Derived(int y,int x){
        System.out.println("hii its base with y = "+y);
    }
}


public class Program2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        Base b=new Base();

    }
}
