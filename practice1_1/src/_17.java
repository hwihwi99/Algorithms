public class _17 {
    public static String exR2(int n) {
        String s = exR2(n-3) + n + exR2(n-2)+n;
        if(n<=0) return "";
        return s;
    }
    public static void main(String [] args){
        System.out.println(exR2(3));
    }
}

//이 함수의 문제는 종료 조건에 도달할 수 없다는 점이다. exR2(0),exR2(-3) 등등,, 호출이 계속해서 발생하고
//결국 StackOverflowError가 발생한다.
