import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _08 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");

        ResizingArrayStack<String> s = new ResizingArrayStack<>();

        for(String str : input){
            if(str.equals("-")){
                System.out.println(s.pop());
            } else{
                s.push(str);
            }
        }
        System.out.println("스택 속 남은 원소 갯수 : " + s.size());
        System.out.println("스택 배열의 크기 : " + s.arr_size());
    }
}

//it was - the best - of times - - - it was - the - -
// 최종 스택 배열의 크기 : 2