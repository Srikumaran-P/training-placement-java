import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        // substring from start to end (exclusive)
        System.out.println(S.substring(start, end));
    }
}
