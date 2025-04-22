
public class Constructor {
    // Rules for Constrctor: 
    // 1. Constructor name should be same as class name.
    // 2. Constructor should not have any return type.
    // 3. Constructor can have any access modifier.
    // 4. Constructor can have any number of parameters.
    // 5. Constructor will be executed when the object of the class is created.
    // types of constructor:
    // 1. Default constructor: no parameter constructor.
    // 2. Parameterized constructor: constructor with parameters.
    Constructor(int a, int b){
        System.out.println("This is a constructor. and the sum of a and b is: "+(a+b));
    }
    public static void main(String[] args) {
        Constructor obj = new Constructor(5,4);
        System.out.println("this is form main mathod");
    }
}
