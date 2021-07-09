public class _16 {
    public static void main(String [] args){
        Rational r1 = new Rational(2,3);
        Rational r2 = new Rational(3,4);
        Rational ans1 = r1.plus(r2);
        Rational ans2 = r1.minus(r2);
        Rational ans3 = r1.times(r2);
        Rational ans4 = r1.divideBy(r2);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(ans1.toString());
        System.out.println(ans2.toString());
        System.out.println(ans3.toString());
        System.out.println(ans4.toString());
    }
}
