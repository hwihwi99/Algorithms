import edu.princeton.cs.algs4.In;

public class _15 {

    public static int[] readAllInts(String s){
        int []ans = new int [s.length()];
        String [] input = s.split("");
        for(int i = 0; i<ans.length;i++){
            ans[i] = Integer.parseInt(input[i]);
        }
        return ans;
    }

    public static void main(String [] args){
        int [] result = readAllInts("10473974823974");
        for(int i = 0; i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
