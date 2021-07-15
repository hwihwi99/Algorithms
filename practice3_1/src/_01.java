import edu.princeton.cs.algs4.ST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _01 {
    public static void main(String[] args) throws IOException {
        ST<String,Double> symbolTable = new ST <>();

        symbolTable.put("A+",4.33);
        symbolTable.put("A",4.00);
        symbolTable.put("A-",3.67);

        symbolTable.put("B+",3.33);
        symbolTable.put("B",3.00);
        symbolTable.put("B-",2.67);

        symbolTable.put("C+",2.33);
        symbolTable.put("C",2.00);
        symbolTable.put("C-",1.67);

        symbolTable.put("D",1.00);
        symbolTable.put("F",0.00);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");

        double score = 0;
        int SubjectNumber = 0;
        for(String grade : input){
            score += symbolTable.get(grade);
            SubjectNumber++;
        }

        System.out.println("총 학점은 : " + score/SubjectNumber);
    }
}
