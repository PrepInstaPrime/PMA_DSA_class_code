public class Methods {
    // methods are block of code that perform a specific task and provide reusability of code

    static int add(int a,int b){
        int sum=a+b;
        // System.out.println(sum);
        return sum;
    }
    static int subtract(int a, int b){
        return a-b;
    }
    static int multiply(int a,int b){
        return a*b;
    }
    static float division(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        // int sum1=add(3,4,5);
        // System.out.println(sum1);
        // int sum2=add(20,30,40);
        // System.out.println(sum2);
        // int sum=add(2,4);
        // int sub=subtract(4,2);
        // int mul=multiply(2,3);
        // float div=division(4,2);
        // System.out.println(sum+sub+mul+div);
        // widening type casting byte->short->int->long->float->double
        byte a=45;
        int b=a;
        System.out.println(b);
        // narrowing type casting double->float->long->int->short->byte
        int c=45;
        byte d= (byte)c;
        System.out.println(d);

    
    }
}
//write a java program by defining 4 methods add, subtract, multiply, division and call them with different different values and store that value in a varaible and print the some of the result of all the methods
// sum=add(2,4);
// sub=subtract(4,2);
// mul=multiply(2,3);
// div=division(4,2);
// print -> sum+sub+mul+div
