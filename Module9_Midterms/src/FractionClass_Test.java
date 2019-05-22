public class FractionClass_Test {

    public static void main(String []args) {

        Fraction frac1 = new Fraction(20, 5);
        Fraction frac2 = new Fraction(22,12);
        System.out.println(frac1.equals(frac2));
        System.out.println(frac1.findGCD());
        frac1.simplify();
    }
}
