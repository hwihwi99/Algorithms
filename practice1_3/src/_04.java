import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _04 {
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] input = br.readLine().toCharArray();

        Stack<Character> stack = new Stack<>();
        for(char c : input){
            if(c == '{' || c == '[' || c == '(')
                stack.push(c);
            else{
                if(c == '}' && stack.peek() == '{')
                    stack.pop();
                else if(c == ']' && stack.peek() == '[')
                    stack.pop();
                else if(c == ')' && stack.peek() == '(')
                    stack.pop();
                else{
                    System.out.println("false");
                    return;
                }
            }
        }
        if(stack.empty())
            System.out.println("true");
        else
            System.out.println("false");
    }
}
