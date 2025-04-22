import java.util.Arrays;
public class Insertion {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        for(int i=1;i<arr.length;i++){
            int feou= arr[i];
            int sw= i-1;
            while(sw>=0&&arr[sw]>feou){
                arr[sw+1]=arr[sw];
                sw--;
            }
            arr[sw+1]=feou;
        }
        System.out.println(Arrays.toString(arr));
    }
}
