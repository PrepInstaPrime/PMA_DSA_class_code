package mypack;
class Student {
    String stdname="Priyam";
    int stdage=20;    
}
public class Mentor {
    static String name="Mentor";
    int age=30;
    public static void main(String[] args) {
        Student obj= new Student();
        Mentor obj1= new Mentor();
        System.out.println(obj.stdname);
        System.out.println(name);
        System.out.println(obj1.age);

    }
}
