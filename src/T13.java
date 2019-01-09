import java.util.Scanner;
public class T13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        int[] arr=new int[10000];
        boolean[] isPrime = new boolean[104730];
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i]=true;
        }
        for (int i=2;i<isPrime.length;i++){
            if (isPrime[i]){
                for (int k=2;i*k<isPrime.length;k++){
                    isPrime[i*k]=false;
                }
            }
        }
        int n=0;
        int n1=1;
        for (int i=2;i<isPrime.length;i++) {
            if (isPrime[i]){
                arr[n]=i;
                if (n==right-1){
                    for (int j = left-1; j < right-1; j++) {
                        n1++;
                        if ( (n1-1)%10==0){
                            System.out.println(arr[j]);
                        }else
                            System.out.print(arr[j]+" ");
                    }
                    System.out.print(arr[right-1]);
                    break;
                }
                n++;
            }
        }
    }
}
