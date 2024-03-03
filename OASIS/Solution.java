import java.util.Scanner;

public class Solution {
    private int numerator;
    private int denominator;

    /**
     * calculates gcd of two number.
     *
     * @param a is the 1st parameter
     * @param b is the 2nd parameter
     * @return
     */
    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * tim uoc chung lon nhat.
     *
     * @return this
     */
    public Solution reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
        return this;
    }

    /**
     * cong 2 phan so.
     *
     * @param fraction phan so khac
     * @return
     */
    public Solution add(Solution fraction) {
        int num = this.numerator * fraction.denominator + this.denominator * fraction.numerator;
        int den = this.numerator * this.denominator;
        return new Solution(num, den).reduce();
    }

    /**
     * tru 2 phan so.
     *
     * @param fraction phan so khac
     * @return
     */
    public Solution subtract(Solution fraction) {
        int num = this.numerator * fraction.denominator - this.denominator * fraction.numerator;
        int den = this.numerator * this.denominator;
        return new Solution(num, den).reduce();
    }

    /**
     * nhan 2 phan so.
     *
     * @param fraction phan so khac
     * @return
     */
    public Solution multiply(Solution fraction) {
        int num = this.numerator * fraction.numerator;
        int den = this.numerator * this.denominator;
        return new Solution(num, den).reduce();
    }

    /**
     * chia 2 phan so.
     *
     * @param fraction phan so khac
     * @return
     */
    public Solution divide(Solution fraction) {
        int num = this.numerator * fraction.denominator;
        int den = this.denominator * fraction.numerator;
        return new Solution(num, den).reduce();
    }

    /**
     * tranh mau bang 1.
     */
    public Solution() {
        this.denominator = 1;
    }

    /**
     * ham khoi tao phan so.
     *
     * @param numerator   tu so
     * @param denominator mau so
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    /**
     * so sanh 2 phan so xem co bang nhau khong.
     *
     * @param obj object moi
     * @return
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            Solution thisReduced = this.reduce();
            Solution otherReduced = other.reduce();
            if (thisReduced.numerator == otherReduced.numerator && thisReduced.denominator == otherReduced.denominator) {
                return true;
            }
        }
        return false;
    }

    /**
     * lay tu so ra.
     *
     * @param numerator tu so
     * @return
     */
    public int getNumerator(int numerator) {
        return this.numerator;
    }

    /**
     * lay mau so ra.
     *
     * @param denominator mau so
     * @return
     */
    public int getDenominator(int denominator) {
        return this.denominator;
    }

    /**
     * nhap tu so.
     *
     * @param numerator tu so
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * nhap mau so.
     *
     * @param denominator mau so
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }
}