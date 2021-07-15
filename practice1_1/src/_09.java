public class _09 {
    public static String toBinary(int num){
        StringBuilder answer = new StringBuilder();

        while(num > 0){
            int tmp = num % 2;
            answer.append(tmp);
            num /= 2;
        }
        answer.reverse();
        return answer.toString();
    }
    public static void main(String[] args){
        System.out.println(toBinary(24));
    }
}
