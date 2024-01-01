import java.util.Scanner;

public class ReverseArray {
    static void reverse(int[]arr,int n){
        int temp[] = new int[n];
        int j=n;
        for (int i = 0; i < n; i++) {
            temp[j-1]=arr[i];
            j--;
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
       
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
           
        }
        reverse(arr,n);
        
    }
}
