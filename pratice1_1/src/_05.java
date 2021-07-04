public class _05 {
    public static String checkZeroToOne(double n){
        if(0<n && n<1)
            return "true";
        else
            return "false";
    }
    public static void main(String[] args){
        System.out.println(checkZeroToOne(0.435));
        System.out.println(checkZeroToOne(5.435));
        System.out.println(checkZeroToOne(10));
    }
}
