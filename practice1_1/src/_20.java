public class _20 {
    public static long factorial(int N){
        if(N <= 1){
            return 1;
        }
        return factorial(N-1) * N;
    }
    public static void main(String[]args){
        System.out.println(Math.log(factorial(5)));
    }
}
