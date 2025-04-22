class Parent{
    String pname="Tony";
    int page=20;
    void Intro(){
        System.out.println("My name is "+pname+" and I am "+page+" years old.");
    }
}
class Child extends Parent{
    String name="John";
    int age=50;
    void IntroDuction(){
        System.out.println("My name is "+name+" and I am "+age+" years old.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.Intro();
    }
}
