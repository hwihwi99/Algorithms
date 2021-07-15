public class _18 {
    public static int mystery1(int a, int b){
        //곱하기 연산을 한다.
        if(b==0)
            return 0;
        if(b%2==0)
            return mystery1(a+a,b/2);
        return mystery1(a+a,b/2) + a;
    }
    public static int mystery2(int a, int b){
        //제곱근 계산을 한다.
        if(b==0)
            return 1;
        if(b%2==0)
            return mystery2(a*a,b/2);
        return mystery2(a*a,b/2) * a;
    }
    public static void main(String [] args){
        System.out.println(mystery1(2,25));
        System.out.println(mystery1(3,11));

        System.out.println(mystery2(2,10));
        System.out.println(mystery2(3,11));
    }
}
