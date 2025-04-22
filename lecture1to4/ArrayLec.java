import java.util.Arrays;
public class ArrayLec {
    public static void main(String[] args) {
        // first way to cr3,eate an array
        int arr[]={1,2,4,5};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // second way to create an array
        // int arr2[]=new int[5];
        // arr2[0]=1;
        // System.out.println(Arrays.toString(arr2));
        // length of the array
        // System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*5;
        }
        System.out.println(Arrays.toString(arr));
        // for each loop
        for(int val:arr){
            System.out.println(val);
        }
    }
}
