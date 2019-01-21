import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        if (j<5) {
            System.out.println(0);
            return;
        }
        int count=0;
        for (int i = 3; i <= j-2; i=i+2) {
            if (isPrime(i)&&isPrime(i+2)) count++;
        }
        System.out.println(count);
    }
    private static boolean isPrime(int n){
        if (n%2==0) return false;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <=sqrt; i=i+2) {
            if (n%i==0) return false;
        }
        return true;
    }
}
