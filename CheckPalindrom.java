import java.util.Scanner;

public class CheckPalindrom {
    public static void checkPalindrom(int[]arr){
        int n = arr.length;
        boolean isPalindrome = true;
        for (int i = 0; i < n/2; i++) {
            if (arr[i]!=arr[n-i-1]) {
                isPalindrome=false;
                System.out.println("array is not palindrome");
                break;
            }
        }
        if (isPalindrome) {
            
            System.out.println("array is palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
       checkPalindrom(arr);
    }
}
