public class _07 {
    public static void main(String [] args){

        double t = 9.0;
        while(Math.abs(t-9.0/t)>.001){
            t = (9.0/t + t) / 2.0;
        }
        System.out.printf("%.5f\n",t); //3.00009

        int sum = 0;
        for(int i = 1;i<100;i++){
            for(int j = 0;j<i;j++)
                sum++;
        }
        System.out.println(sum); // 1~99까지의 합인 4950

        int sum1 = 0;
        for(int i = 1;i<1000;i*=2){ //1 2 4 8 16 32 64 128 256 512 -> 10번의 전체 for문
            for(int j = 0;j<1000;j++)
                sum1++; // 한번에 1000
        }
        System.out.println(sum1); //10000
    }
}
