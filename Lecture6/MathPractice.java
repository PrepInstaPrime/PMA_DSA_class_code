public class MathPractice {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int max= Math.max(a,b);
        int min=Math.min(a, b);
        System.out.println("Maximum of "+a+" and "+b+" is: "+max + " and Minimum of "+a+" and "+b+" is: "+min);
        int c=-5;
        System.out.println(Math.abs(c));
        double d=5.5;
        // System.out.println(Math.ceil(d));
        // System.out.println(Math.floor(d));
        // System.out.println(Math.round(d));
        int e=8;
        // System.out.println(Math.sqrt(e));
        // System.out.println(Math.cbrt(e));
        // System.out.println(Math.pow(2, 3));
        // System.out.println(Math.random()+1);
        // System.out.println(Math.random()*10);
        System.out.println(Math.floor(Math.random()*(10-1))+1);

    }
}
