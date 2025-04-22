// runtime polymorphism/ method overriding: same method name and same number of arguments or same type of arguments. 
// why do we call it runtime polymorphism? because the compiler decides which method to call at runtime.
class Main{
    int num=5;
    void intro(){
        System.out.println("I am a parent class.");
    }
    void Parent(){
        System.out.println("I am a parent class. but unique.");
    }
}
class Subclass extends Main{
    int num=10;
    // overriding the method of parent class
    void intro(){
        System.out.println("I am a child class.");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.intro();  // overriding the method of parent class
        obj.Parent();  // calling the method of parent class
        Main obj1 = new Subclass();
        obj1.intro(); // calling from parent class
    }
}
