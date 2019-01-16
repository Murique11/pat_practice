import java.util.Scanner;

public class T37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        String[] P = s1[0].split("\\.");
        String[] A = s1[1].split("\\.");
        int p1 = (Integer.parseInt(P[0]) * 17 + Integer.parseInt(P[1])) * 29 + Integer.parseInt(P[2]);
        int a1 = (Integer.parseInt(A[0]) * 17 + Integer.parseInt(A[1])) * 29 + Integer.parseInt(A[2]);
        if (a1>=p1) System.out.println((a1 - p1) / (17 * 29) + "." + (a1 - p1) % (17 * 29) / 29 + "." + (a1 - p1) % 29);
        else {
            int c;
            c=a1;a1=p1;p1=c;
            System.out.println("-"+(a1 - p1) / (17 * 29) + "." + (a1 - p1) % (17 * 29) / 29 + "." + (a1 - p1) % 29);
        }
    }
}
