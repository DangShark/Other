import java.util.Scanner;

public class Solution3 {
    /**
     * kiem tra so nguyen to.
     *
     * @param n la so nhap vao
     * @return
     */
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
