import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class TCS {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int W= sc.nextInt();
        if(V>=W||W%2==1 || W<2){
            System.out.println("Invalid Input");
        }else{
            int FW=(W-2*V)/2;
            int TW=V-FW;
            if(FW<0||TW<0){
                System.out.println("Invalid Input");
            }else{
                System.out.println("TW="+TW+" FW="+FW);
            }
        }
    }
}
