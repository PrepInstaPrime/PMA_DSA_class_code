import java.util.Arrays;
public class Selection {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        for(int i=0;i<arr.length-1;i++){
           int min=i;
           for(int j=i+1; j<arr.length;j++){
             if(arr[min]>arr[j]){
                min=j;
             }
           }
           int temp= arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
