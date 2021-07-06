public class _19 {

    public static long F(int N){
        if(N == 0) return 0;
        if(N == 1) return 1;
        return F(N-1)+F(N-2);
    } //피보나치 정석 풀이 -> 하지만 시간이 too much

    public static long []fibo = new long[100];

    public static long DP_F(int N){
        if(N==0)
            return 0;
        if(N==1 || N == 2)
            return 1;

        if(fibo[N] == 0){
            fibo[N] = DP_F(N-1) + DP_F(N-2);
        }
        return fibo[N];
    } //피보나치 + 동적 계획법.. 기존의 연산결과를 가져오는 것 뿐! so fast!

    public static void main(String [] args){
        for(int i = 0;i<90;i++)
            System.out.println(i + " " + DP_F(i));
    }
}
