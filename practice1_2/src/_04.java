public class _04 {
    public static void main(String []args){
        String string1 = "Hello";
        String string2 = string1;
        string1 = "world";
        System.out.println(string1);
        System.out.println(string2);
    }
}
//답
//world
//Hello

//String은 기본 데이터 타입이므로 string1과 string2는 다른 주소를 가르키고 있다.
//그래서 string1의 값을 바꾸어도 string2의 값이 변하지 않는다.
