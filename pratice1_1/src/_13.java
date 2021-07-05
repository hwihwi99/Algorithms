public class _13 {
    public static void main(String[] args){
        int [][] arr = {{1,2},{3,4},{5,6}};
        int M = arr.length;
        int N = arr[0].length;

        int [][] newarr = new int [N][M];
        for(int i = 0;i<N;i++){
            for(int j = 0; j<M;j++){
                newarr[i][j] = arr[M-1-j][i];
                System.out.print(newarr[i][j]);
            }
            System.out.println("");
        }
    }
}
