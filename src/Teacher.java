public class Teacher {
    int id;
    int salary;
    String name;
    String sub;

    void teach(String sub, String name){
        System.out.println(name+"can teach"+sub);
    }
    void conductTest(){
        System.out.println("teacher can conduct exam for 50 marks");
    }
}
