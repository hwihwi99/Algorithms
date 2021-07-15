public class _10 {
    public static void main(String[]args){
        //int []a;
        int []a = new int [10]; // 이 처리를 반드시 해주어야 한다.
        for(int i = 0;i<10;i++){
            a[i] = i*i;
        }

        // 이 코드에서 잘못된 점은 new int [크기]를 해주지 않은 것이다.
        //즉 메모리를 할당해주지 않고 사용하고 있다.
    }
}
