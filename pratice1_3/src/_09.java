import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
        Queue<String> queue = new LinkedList<>();
        StringBuilder builder = new StringBuilder();
        for(String s : input){
            if(s.equals(")")){

            }else{
                queue.offer(s);
            }
        }
    }
}
