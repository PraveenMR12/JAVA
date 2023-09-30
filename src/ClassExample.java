public class ClassExample {
    public static void main(String[] args) {
        Apps app= new Apps();
        Soldier army= new Soldier();
        Teacher teacher= new Teacher();
        Mobile phone = new Mobile();
        Books book= new Books();

//        for Apps class
        app.name="Amazon";
        app.size= 23;
        app.grade='A';
        System.out.println("name of the = "+app.name+" of size "+app.size+" having the grade "+app.grade);

        app.lanuchApp();
        app.buyProducts();

        // For Soldier class
        army.id=123;
        army.name="Shreedar";
        army.rank="Lutenent";
        System.out.println("soldier with id "+army.id+" is "+army.name+" having the rank "+army.rank);

        army.operateGun();
        army.runSpeed();

        //For Teacher class
        teacher.id=32;
        teacher.name="saranya";
        teacher.salary=300000;
        teacher.sub="Maths";
        System.out.println("teacher with id no "+teacher.id+" is "+teacher.name+" teaching sub "+teacher.sub+" having salary "+teacher.salary);

        teacher.teach("maths","saranya");
        teacher.conductTest();

        // For mobile class
        phone.imei_no=4545423;
        phone.Brand="Samsung";
        phone.cost=30000;
        System.out.println("Phone with "+phone.imei_no+" is "+phone.Brand+" brand with cost "+phone.cost);

        phone.call();
        phone.installApps();

        // For Books class
        book.cost=300.00;
        book.name="marvel comics";
        book.pages=700;
        book.writer="stan lee";
        System.out.println("Book named "+book.name+" written by "+book.writer+" having pages "+book.pages+" costs "+book.cost);

        book.read();
        book.write();

}
}