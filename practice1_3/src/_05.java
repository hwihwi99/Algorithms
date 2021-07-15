import java.util.Stack;

public class _05 {
    public static void main(String [] args){
        Stack <Integer> stack = new Stack<>();
        int n = 50;
        while(n>0){
            stack.push(n%2);
            n /= 2;
        }
        for(int d : stack){
            System.out.print(d);
        } // 이러면 앞에서 부터 나오넹 010011
        System.out.println("");
        while (!stack.empty()){
            System.out.print(stack.pop());
        } // 이래야 110010이 출력된다.
    }
}

//2진수를 구하는 식이다.
// 1 1 0 0 1 0
