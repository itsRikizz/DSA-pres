import java.util.*;

public class MaxSumSubArrays {
    public static int print_subarray(int arr[],int n){
        int maxSum= Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            int currentSum =0;
            for (int j = i; j < n; j++) {
                currentSum+=arr[j];
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];  
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
            
        }
       int res= print_subarray(arr, n);
       System.out.println(res);
        
    }
}
