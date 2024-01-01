import java.util.Scanner;

public class CalculateAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int avg =0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
            sum+=arr[i];
        }
        avg = sum/n;

        System.out.println("Total avg of all array elements is"+" "+avg);
    }
}
