public class _12 {
    public static void main(String [] args){
        SmartDate smartDate = new SmartDate(7,9,2021);
        if(smartDate.checkDate()){
            System.out.println(smartDate.dayOfTheWeek());
        }else{
            System.out.println("Wrong date");
        }
    }
}
