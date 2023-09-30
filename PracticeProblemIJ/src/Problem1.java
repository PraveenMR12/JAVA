import java.sql.SQLOutput;
import java.util.Scanner;
class Animal {
    public static void eatFood(){
        System.out.println("Eats Foods");
    }
}
class Lion extends Animal {
    public static void eatFood() {
        System.out.println("praveen eats only non veg");
    }
}
class SubClass1 extends Animal {
    public static void praveen() {
        System.out.println("praveen is master in tech");
    }
}

    class Base {
        public static void main(String[] args) {

           Lion a=new Lion();
           a.eatFood();
           Practice2 b=new Practice2();
           b.praveen();

        }
    }
