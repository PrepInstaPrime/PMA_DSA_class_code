public class Fibbo {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=6;
        for(int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println(b);
    }
}
