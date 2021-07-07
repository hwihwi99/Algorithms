public class _24 {
    public static int gcd(int p, int q){
        if(q==0){
            return p;
        }
        else{
            return gcd(q,p%q);
        }
    }
    public static void main(String[] args){
        System.out.println(gcd(105,15));
        System.out.println(gcd(105,24));
        System.out.println(gcd(1111111,1234567));
    }
}
