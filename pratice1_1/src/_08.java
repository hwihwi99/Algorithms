public class _08 {
    public static void main(String []args) {
        System.out.println('b'); // b
        System.out.println('b' + 'c'); // bc 가 아니라 아스키코드로 변환한 98+99 -> 197이 정답!
        System.out.println((char)('a'+4)); // e
    }
}
