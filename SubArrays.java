import java.util.*;

public class SubArrays {
    public static void print_subarray(int arr[],int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];  
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
            
        }
        print_subarray(arr, n);
        
    }
}
