import java.util.Arrays;
public class ArrayMethods {
    public static void main(String[] args) {
        int arr[][]={{2,3},{1,4},{4,5},{3,6}};
        Arrays.sort(arr, (a,b)->b[0]-a[0]);
        for(int []num:arr){
            System.out.print(Arrays.toString(num)+" ");
        }
        
    }
}
