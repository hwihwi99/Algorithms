public class _05 {
    public static void main(String[]args){
        String s = "Hello World!";
        s.toUpperCase(); // 모두 대문자로
        s.substring(6,11); // 6~ 11-1 번째 인덱스 값 출력하기
        System.out.println(s);
    }
}
//Hello World! 출력됨

//이유 : 위의 특정 두 함수는 String을 리턴한다.
//        s = s.toUpperCase();
//        s = s.substring(6,11);
//이런식으로 해주어야 원하는 값이 WORLD 를 출력할 수 있다.

