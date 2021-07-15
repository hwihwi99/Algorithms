import edu.princeton.cs.algs4.Counter;

public class _09 {
    public static int rank(int key, int [] arr){
        Counter counter = new Counter("count");
        return rank(key,arr,0,arr.length-1,counter);
    }
    public static int rank(int key, int []arr, int lo, int hi,Counter c){
        if(lo>hi){
            return -1;
        }
        int mid = lo + (hi-lo)/2;
        if(key < arr[mid]){
            c.increment();
            return rank(key,arr, lo, mid-1,c);
        }else if (key > arr[mid]){
            c.increment();
            return rank(key,arr,mid+1,hi,c);
        }else{
            c.increment();
            System.out.println(c.toString());
            return mid;
        }
    }
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        rank(15,arr);
    }
}
