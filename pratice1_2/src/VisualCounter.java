public class VisualCounter {

    // N : 최대 작업 획수
    // max : 카운터가 가질 수 있는 최댓값
    private int N;
    private int max;
    private int count;
    private int times;

    // 생성자
    public VisualCounter(int N, int max){
        this.N = N;
        this.max = max;
        count = 0;
        times = 0;
    }

    public int getN() {
        return N;
    }

    public int getMax() {
        return max;
    }

    public int getCount() {
        return count;
    }

    public int getTimes() {
        return times;
    }

    public void increment(){
        if(count<max && times<N){
            count++;
            times++;
        }
    }

    public void decrement(){
        if(times<N){
            count--;
            times++;
        }
    }
}
