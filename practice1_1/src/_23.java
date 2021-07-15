import java.util.Arrays;
import java.util.Scanner;

public class _23 {
    public static int rank(int key, int[]a){
        int lo = 0;
        int hi = a.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(key < a[mid])
                hi = mid - 1;
            else if (key>a[mid])
                lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] whitelist = {84,48,68,10,18,98,12,23,54,57,48,33,16,77,11,29};
        int [] input = {84,48,68,10,18,98,12,23,50,54,99,57,13,48,33,16,77,11,29};
        Arrays.sort(whitelist);

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char c = s.charAt(0);

        if(c == '+'){
            for(int i = 0 ; i< input.length;i++){
                int key = input[i];
                if(rank(key,whitelist) == -1){
                    System.out.println(key);
                }
            }
        }
        else if(c == '-'){
            for(int i = 0 ; i< input.length;i++){
                int key = input[i];
                if(rank(key,whitelist) != -1){
                    System.out.println(key);
                }
            }
        }
    }
}
