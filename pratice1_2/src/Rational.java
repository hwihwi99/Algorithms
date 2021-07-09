public class Rational {
    private int numerator, deniminator;// 분자, 분모
    private double fraction;
    public Rational (int numerator, int deniminator){
        this.numerator = numerator; // 분자
        this.deniminator = deniminator; // 분모
        fraction = (double)numerator / (double)deniminator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDeniminator() {
        return deniminator;
    }

    public double getFraction() {
        return fraction;
    }

    private int gcd (int p ,int q){
        if(q==0)
            return p;
        return gcd(q,p%q);
    }

    public Rational plus(Rational b){
        int n = getNumerator()*b.getDeniminator() + b.getNumerator()*getDeniminator();
        int d = getDeniminator() * b.getDeniminator();
        int s = gcd(n,d);
        n /= s;
        d /= s;
        Rational newNum = new Rational(n,d);
        return newNum;
    }

    public Rational minus(Rational b){
        int n = getNumerator()*b.getDeniminator() - b.getNumerator()*getDeniminator();
        int d = getDeniminator() * b.getDeniminator();
        int s = gcd(n,d);
        n /= s;
        d /= s;
        Rational newNum = new Rational(n,d);
        return newNum;
    }

    public Rational times(Rational b){
        int n = getNumerator()*b.getNumerator();
        int d = getDeniminator() * b.getDeniminator();
        int s = gcd(n,d);
        n /= s;
        d /= s;
        Rational newNum = new Rational(n,d);
        return newNum;
    }

    public Rational divideBy(Rational b){
        int n = getNumerator()*b.getDeniminator();
        int d = getDeniminator() * b.getNumerator();
        int s = gcd(n,d);
        n /= s;
        d /= s;
        Rational newNum = new Rational(n,d);
        return newNum;
    }

    public boolean equals(Rational that) {
        if (this == that) return true;
        if (that == null) return false;
        if (this.getClass() != that.getClass()) return false;
        return (getNumerator() == that.getNumerator() && getDeniminator() == that.getDeniminator());
    }

    public String toString(){
        return getNumerator() + "/" + getDeniminator();
    }

}
