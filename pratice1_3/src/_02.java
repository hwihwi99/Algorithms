import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _02 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Stack<String> stack = new Stack<>();
        for(String s : input){
            if(s.equals("-"))
                System.out.println(stack.pop());
            else
                stack.push(s);
        }
    }
}

// 입력 : it was - the best - of times - - - it was - the - -
// 출력 : was best times of the was the it