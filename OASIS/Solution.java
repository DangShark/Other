import java.util.Scanner;

public class Solution {
    private int numerator;
    private int denominator;

    public Solution() {
        this.denominator = 1;
    }

    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        setDenominator(denominator);
    }

    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public Solution reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
        return this;
    }

    public Solution add(Solution fraction) {
        int num = this.numerator * fraction.denominator + this.denominator * fraction.numerator;
        int den = this.denominator * fraction.denominator;
        return new Solution(num, den).reduce();
    }

    public Solution subtract(Solution fraction) {
        int num = this.numerator * fraction.denominator - this.denominator * fraction.numerator;
        int den = this.denominator * fraction.denominator;
        return new Solution(num, den).reduce();
    }

    public Solution multiply(Solution fraction) {
        int num = this.numerator * fraction.numerator;
        int den = this.denominator * fraction.denominator;
        return new Solution(num, den).reduce();
    }

    public Solution divide(Solution fraction) {
        int num = this.numerator * fraction.denominator;
        int den = this.denominator * fraction.numerator;
        return new Solution(num, den).reduce();
    }

   public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            return this.numerator * other.denominator == this.denominator * other.numerator;
        }
        return false;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }
}
