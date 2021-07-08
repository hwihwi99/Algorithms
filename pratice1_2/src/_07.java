public class _07 {
    public static String mystery(String s){
        int N = s.length();
        if(N<=1)
            return s;
        String a = s.substring(0,N/2);
        String b = s.substring(N/2,N);
        return mystery(b) + mystery(a);
    }
    public static void main(String[] args){
        System.out.println(mystery("hwijeong"));
    }
}
//문자열을 거꾸로 출력하는 함수
//위의 예시의 답안 gnoejiwh 이런식으로!
