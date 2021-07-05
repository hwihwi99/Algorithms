public class _15 {
    public static int[] histogram(int []a,int M){
        int [] ans = new int [M];
        for(int i = 0;i<ans.length;i++)
            ans[i] = 0;
        for(int i : a){
            if(i<M)
                ans[i]++;
        }
        for(int i = 0 ;i<ans.length;i++){
            System.out.println(ans[i]);
        }
        return ans;
    }
    public static void main(String [] args){
        int [] arr = {1,4,3,5,6,2,3,4,2,5};
        histogram(arr,7);
    }
}
