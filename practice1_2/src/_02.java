import edu.princeton.cs.algs4.Interval1D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _02 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int numberOfInterval = Integer.parseInt(st.nextToken());

        LinkedList<Interval1D> list = new LinkedList<>();

        for(int i = 0; i<numberOfInterval;i++){
            Scanner scanner = new Scanner(System.in);
            double min = scanner.nextDouble();
            double max = scanner.nextDouble();
            Interval1D it = new Interval1D(min,max);
            System.out.println(it.toString());
            list.add(it);
        }
        System.out.println("");
        System.out.println("now overlap interval!!!");
        System.out.println("");
        for(int i = 0; i<list.size();i++){
            for(int j = i+1;j<list.size();j++){
                if(list.get(i).intersects(list.get(j))){
                    double overlapMin;
                    double overlapMax;
                    if(list.get(i).min() < list.get(j).min()){
                        overlapMin = list.get(j).min();
                        overlapMax = list.get(i).max();
                    }else{
                        overlapMin = list.get(i).min();
                        overlapMax = list.get(j).max();
                    }
                    System.out.println("["+overlapMin+", "+overlapMax + "]");
                }
            }
        }
    }
}
