public class ExceptionHandling {
    public static void main(String[] args) throws ArithmeticException{
        try{
            int a=5;
            int b=a/2;
            if(a>b){
                throw new Error("This is a custom exception");
            }
            System.out.println(a);
            System.out.println(b);
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            System.out.println("try block 1 has executed");
        }
        System.out.println("code has executed");
       
    }
}
