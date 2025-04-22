public class Swap {
    public static void main(String[] args) {
        // using third variable
        int a=10;
        int b=20;
        System.out.println("Before swapping a: "+a+" b: "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping a: "+a+" b: "+b);
        // without using third variable
        // method 1
        int x=30;
        int y=40;
        System.out.println("Before swapping x: "+x+" y: "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping x: "+x+" y: "+y);
        // method 2
        int m=5;
        int n=6;
        System.out.println("Before swapping m: "+m+" n: "+n);
        m=m^n;
        n=m^n;
        m=m^n;
        System.out.println("After swapping m: "+m+" n: "+n);
    }
}
