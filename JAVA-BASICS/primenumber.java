import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i;
        for (i = n; i <= m; i++) {
            if (i % 2 == 1) {
                if (prime(i) == 1) {
                    System.out.print(i +" ");
                }
            }
        }
    }

    public static int prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
