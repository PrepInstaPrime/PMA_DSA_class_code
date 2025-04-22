// second way of achieving abstraction is by using interface

interface Shape {
    void draw();  // abstract method means no body
    void display();  // abstract method means no body
    default void show(){  // in interface for concrete method we use default keyword
        System.out.println("Showing the shape.");
    }
}
interface Area {
 void area();
}
class Rectangle implements Shape, Area{
    public void draw(){
        System.out.println("Drawing a rectangle.");
    }
    public void display(){
        System.out.println("Displaying a rectangle.");
    }
    public void area(){
        System.out.println("Calculating the area of a rectangle.");
    }
}
public class AbstractionWithInterface {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.draw();
        obj.display();
        obj.area();
        obj.show();
    }
}

// Q1. What is the difference between abstract class and interface?
// Ans:
// 1. Abstract class can have abstract methods and concrete methods. Interface can have only abstract methods before 2008 or java 8.
// 2. Abstract class can have constructors. Interface cannot have constructors.
// 3. Abstract class can have instance variables. Interface cannot have instance variables.
// 4. for concrete methods in abstract class we use method body. for concrete methods in interface we use default keyword.
// 5. Abstract class can have static methods. Interface cannot have static methods.