import java.util.*;

public class RemoveDuplicate {
    static void removeDuplicate(int[]arr,int n){
        LinkedHashSet <Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
      }
      removeDuplicate(arr,n);
      
  }
}
