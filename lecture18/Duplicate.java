import java.util.*;
public class Duplicate {
     static  List<Integer> findDuplicates(int[] nums) {
        int n= nums.length;
        int freq[]= new int[n+1];
        for(int val:nums){
            freq[val]++;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1;i<freq.length;i++){
            if(freq[i]==2){
                res.add(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        List<Integer> res= findDuplicates(arr);
        System.out.println(res);
    }
}
