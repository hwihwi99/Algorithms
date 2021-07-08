import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _01 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int numberOfPoint = Integer.parseInt(st.nextToken());

        LinkedList<Point2D> list = new LinkedList<>();

        for(int i = 0; i<numberOfPoint;i++){
            double x = Math.random();
            double y = Math.random();
            Point2D p = new Point2D.Double(x,y);
            System.out.println(p.toString());
            list.add(p);
        }

        ArrayList<Double> dis = new ArrayList<>();

        for(int i = 0; i<list.size();i++){
            for(int j = i+1; j<list.size();j++){
                dis.add(list.get(i).distance(list.get(j)));
            }
        }

        Collections.sort(dis);
        System.out.println(dis.get(0));

    }
}

// N을 입력받고 N개의 0~1 사이의 좌표를 표현해서 그 점들 중 가장 가까운 거리를 구하는 문제!
