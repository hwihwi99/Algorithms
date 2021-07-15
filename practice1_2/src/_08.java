public class _08 {
    public static void main(String [] args){
        int [] a ={1,2,3,4,5};
        int [] b = {6,7,8,9,10,11};
        int [] t = a;
        a = b;
        b = t;

        for(int i = 0; i< a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for(int i = 0; i< b.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}

// 두 배열을 바꾼다.
// a와 b가 수백만 개의 정수값을 가지고 있다면
// 이는 참조 대상만 바꾼다. 즉 주소값만을 바꾸기 때문에
// 수백만 개의 정수값을 복제할 필요가 없다.