public class _02 {
    public static void main(String[]args){
        System.out.println((1+2.236)/2); // float
        System.out.println(1+2+3+4.0); // float
        System.out.println(4.1>=4);//boolean
        System.out.println("1"+2+3); // 이러면 123 출력 아마도 1이 문자열이라서 더할 수 없기에 그런 것 같다
        System.out.println(1+"2"+3); // 당연히 123 출력
        System.out.println(1+2+"3"); // 33 앞에 두개는 숫자 계산, 뒤에 문자열 붙음
    }
}
