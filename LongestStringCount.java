import java.util.Scanner;

public class LongestStringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s = sc.next();
        int count =0;
        int answer=0;
        char ch = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (ch!=s.charAt(i)) {
                ch=s.charAt(i);
                count =0;
            }
            if(ch==s.charAt(i)){
                count++;
            }
            answer = Math.max(answer, count);
        }
        System.out.println(answer);
    }
}
