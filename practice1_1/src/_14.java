public class _14 {
    public static int lg(int num){
        int index = 0;
        for(int i = 1;i*i<=num;i++){
            index = i;
        }
        return index;
    }
    public static void main(String[] args){
        System.out.println(lg(645));
    }
}
