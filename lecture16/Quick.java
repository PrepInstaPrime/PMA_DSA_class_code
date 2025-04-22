import java.util.Arrays;
public class Quick {
    static void divide(int arr[], int start, int end){
        if(start>end){
            return;
        }
        int pivotIndex=findIndex(arr, start, end);
        divide(arr, start, pivotIndex-1);  // left part
        divide(arr, pivotIndex+1, end);  // right part
    }
    static int findIndex(int arr[], int start, int end){
        int i=start-1;
        int pivot=arr[end];
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, end);
        return i+1;
    }
    static void swap( int arr[], int i,int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void main(String[] args) {
        int arr[]={7,3,8,4,5};
        int start=0;
        int end= arr.length-1;
        divide(arr, start, end);
        System.out.println(Arrays.toString(arr));

    }
}
