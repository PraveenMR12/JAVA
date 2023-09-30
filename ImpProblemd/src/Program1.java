import java.util.Scanner;

public class Program1{


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            double a= sc.nextDouble();
            double b= sc.nextDouble();
            String op=sc.next();
            double result;

            Calculator c= new Calculator(a,b,op);

            switch (op){
                case "+":
                    result=c.addition();
                    System.out.println(result);
                    break;

                case "-":
                    result=c.subtraction();
                    System.out.println(result);
                    break;

                case "*":
                    result=c.Multiplication();
                    System.out.println(result);
                    break;

                case "/":
                    result=c.Division();
                    System.out.println(result);
                    break;

                default:
                    System.out.println("Invalid operator");


            }


        }
}

class Calculator{
    double a;
    double b;
    String op;

    Calculator(double a, double b, String op){
        this.a=a;
        this.b=b;
        this.op=op;

    }
    public double addition(){

        return a+b;
    }
    public double subtraction(){

        return a-b;
    }
    public double Multiplication(){
        return a*b;
    }
    public double Division(){
        return a/b;
    }



}