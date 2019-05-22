public class Fraction {

    private int numerator, denominator;

    public Fraction(int top, int bottom) {
        if (bottom == Integer.valueOf(0)) {
            throw new IllegalArgumentException();
        }
        this.numerator = Integer.valueOf(top);
        this.denominator = Integer.valueOf(bottom);
    }

    public Fraction(int top) {
        this.numerator = top;
        this.denominator = 1;
    }

    public int findGCD() {
        int gcd = 0;
        if (numerator > denominator) {
            gcd = denominator;
        } else  {
            gcd = numerator;
        }
        for (int i = gcd; i> 0; i--) {
            if ((numerator % i == 0) && (denominator % i == 0)) {
                return i;
            }
        }
        return -1;
    }

    public void simplify() {
        if (findGCD() > 1) {
            System.out.println((this.numerator / findGCD()) / (this.denominator / findGCD()));
        }

    }

    /*public Fraction add(Fraction another) {
        if (this.denominator == another.denominator) {
            return (this.numerator + another.numerator);
        }
    }*/

    @Override
    public String toString() {
        return String.valueOf(this.numerator) + "/" + String.valueOf(this.denominator);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction otherFraction = (Fraction) other;
            return this.numerator == otherFraction.numerator &&
                    this.denominator == otherFraction.denominator;
        } else {
            return false;
        }

    }
}
