// first way to achieve abstraction is by using abstract classes
// why do we need it? 
// abstract classes: 
// 1. these classes cannot be instantiated
// 2. they can have abstract methods
// 3. they can have concrete methods
// 4. they can have constructors
// 5. they can have instance variables
// 6. they can have static methods
// 7. they can have final methods
abstract class Shape {
    abstract void draw();  // abstract method means no body
    public void display(){  // concrete method means body
        System.out.println("Displaying the shape.");
    }
}
class Circle extends Shape{
    // if Circle class want to inherit the abstract class Shape, it must implement the abstract method draw()
    // void draw(){
    //     System.out.println("Drawing a circle.");
    // }
    void Intro(){
        System.out.println("I am a circle.");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.draw();
        obj.display();
    }
}
