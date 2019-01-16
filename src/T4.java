import java.util.Arrays;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] students = new String[n];
        sc.nextLine();
        String[][] s_students = new String[n][3];

        for(int i = 0; i < n; i ++) {
            students[i] = sc.nextLine();
            s_students[i] = students[i].split(" ");
        }
        int[] score = new int[n];
        int[] ans = new int[n];
        for(int i = 0; i < n; i ++) {
            score[i] = Integer.parseInt(s_students[i][2]);
            ans[i] = Integer.parseInt(s_students[i][2]);
        }
        Arrays.sort(score);
        for (int i = 0; i < n; i++) {
            if (ans[i]==score[n-1]){
                System.out.println(s_students[i][0] +" "+ s_students[i][1]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (ans[i]==score[0]){
                System.out.println(s_students[i][0] +" "+ s_students[i][1]);
            }
        }
    }
}
