import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class _10 {
    public static void main(String [] args) {
        VisualCounter vc = new VisualCounter(100, 30);

        StdDraw.setXscale(0,vc.getN()+5);
        StdDraw.setYscale(-vc.getMax(),vc.getMax());
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
        for(int i = 0; i<vc.getN();i++){
            if(StdRandom.bernoulli(0.5)){
                vc.increment();
            }else{
                vc.decrement();
            }
            StdDraw.point(vc.getTimes(),vc.getCount());
        }

    }
}
