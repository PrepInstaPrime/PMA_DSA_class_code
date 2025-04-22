public class Scope {
    public static void main(String[] args) {
        PublicExample obj= new PublicExample();
        int a=10;  // a is global variable
        { 
            int b=20; // b is local variable
            System.out.println(a);
            System.out.println(b);
        }
        System.out.println(obj.name);
        System.out.println(a); // a is accessible here
        // System.out.println(b); // Error: b cannot be resolved to a variable
    }
}
