import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _21 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String a = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        double d = (double) b / (double) c;
        System.out.printf("%s %d %d %.3f",a,b,c,d);
    }
}
