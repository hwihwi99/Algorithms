public class _11 {
    public static void main(String [] args){
        boolean [][] boolarr = {{true,true,false,true},{false,false,true,true},{true,true,true,false}};
        int col = boolarr.length;
        int row = boolarr[0].length;
        for(int i = 0; i< col;i++){
            for(int j = 0; j<row;j++){
                if(boolarr[i][j] == true)
                    System.out.printf("%d 행 %d 열 *\n",i,j);
                else
                    System.out.printf("%d 행 %d 열  \n",i,j);
            }
        }
    }
}
