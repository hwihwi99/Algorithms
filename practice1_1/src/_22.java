public class _22 {
    public static int rank(int key, int []a){
        return rank(key,a,0,a.length-1);
    }

    public static int rank(int key, int[]a,int lo, int hi){
        if(lo>hi)
            return -1;
        int mid = lo + (hi-lo)/2;
        if(key<a[mid]){
            return rank(key,a,lo,mid-1);
        }else if (key > a[mid]){
            return rank(key,a,mid+1,hi);
        }else{
            return mid;
        }
    }
// 원래 이 코드인데 저 위에 있는 함수만을 이용해서 해보기!

//    public static int rank(int key, int [] arr , int count){
//        int lo = 0;
//        int hi = arr.length-1;
//        int mid = lo + (hi-lo)/2;
//        if(lo == hi){
//            if(arr[lo] != key)
//                return -1;
//            return lo;
//        }
//        if (key<arr[mid]){
//            int []tmp = new int [mid-lo];
//            for(int i = lo;i<mid;i++){
//                tmp[i] = arr[i];
//                System.out.println(tmp[i]);
//            }
//            count++;
//            System.out.println(count);
//            return rank(key,tmp,count);
//        }else if (key>arr[mid]){
//            int [] tmp = new int [hi-mid];
//            for(int i = mid+1;i<=hi;i++){
//                tmp[i-mid-1] = arr[i];
//                System.out.println(tmp[i-mid-1]);
//            }
//            count++;
//            System.out.println(count);
//            return rank(key,tmp,count);
//        }else{
//            return mid;
//        }
//    }
// 실패했다...ㅎ....ㅎ

    public static void main(String [] args){
        int [] arr = {1,3,5,6,7,8,9};
        System.out.println(rank(8,arr));
    }
}
