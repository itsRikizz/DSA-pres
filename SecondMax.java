import java.util.Scanner;

public class SecondMax {
    public static int secondMaximum(int[] arr,int n){
        // 1 1 1 1 1
        int Max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]==Max){
                continue;
            }else if(arr[i]>SecondMax){
                SecondMax=arr[i];
            }
        }
        return SecondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
       
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
           
        }
       int result= secondMaximum(arr,n);
       System.out.println(result);
    }
}
