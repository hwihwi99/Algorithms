import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _06 {
    public static void main(String [] args){
        Stack <String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            queue.offer(i+"yes!");
        }
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }
    }
}
// 처음 큐에 들어오는 내용을 거꾸로 뒤집기 연산을 수행한다.