// compile time polymorphism/method overloading: same method name but different number of arguments or different type of arguments. 
// why do we call it compile time polymorphism? because the compiler decides which method to call at compile time based on number of parameter and datatype.
public class CompilePolymorphism {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    static void add(float a, int b){
        System.out.println(a+b);
    }
    static void add(float a, double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        add(5,3);
        add(2,4,5);
        add(2.5f, 5);
        add(2.5f,3.5d);
    }
}
