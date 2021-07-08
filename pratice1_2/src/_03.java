import edu.princeton.cs.algs4.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _03 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int M = Integer.parseInt(st.nextToken());
        double min = Double.parseDouble(st.nextToken());
        double max = Double.parseDouble(st.nextToken());

        for(int i = 0; i<M;i++){
            double x = Math.random()*(max-min+1) + min;
            double y = Math.random()*(max-min+1) + min;
            StdDraw.setCanvasSize(300,300);
            StdDraw.setScale(min,max);
            StdDraw.setPenRadius(0.01);
            StdDraw.point(x,y);
        }

    }
}
//점이 하나밖에 안찍힌다.. 좀 더 고민이 필요한 문제다..
