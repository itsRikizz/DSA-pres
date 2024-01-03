import java.util.Scanner;

public class FindMissingNumber {
    public static int Missing(int[] arr, int n){
        
        int TotalSum = n*(n+1)/2;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }

        return TotalSum-sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int [] arr= new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        
        //Arr=[1,2,4]
        
       int res= Missing(arr,n);
       System.out.println(res);
       
    }
}
