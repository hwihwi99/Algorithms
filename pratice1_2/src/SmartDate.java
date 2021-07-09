import java.time.Year;
import java.util.Calendar;

public class SmartDate {
    private int month;
    private int day;
    private int year;

    public SmartDate(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return getMonth() + "/" + getDay() + "/" + getYear();
    }

    public boolean checkDate(){
        if(getYear()<0){
            System.out.println("Wrong year");
            return false;
        }
        switch (getMonth()){
            case 2:
                if((getYear()%4==0 && getYear()%100 != 0)||getYear()%400 == 0){
                    if(getDay()>=1 && getDay()<=29)
                        return true;
                    else
                        return false;
                }else{
                    if(getDay()>=1 && getDay()<=28)
                        return true;
                    else
                        return false;
                }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(getDay()>=1 && getDay()<=31)
                    return true;
                else
                    return false;
            case 4:
            case 6:
            case 9:
            case 11:
                if(getDay()>=1 && getDay()<=30)
                    return true;
                else
                    return false;
            default:
                return false;
        }
    }
    public String dayOfTheWeek(){
        int month = getMonth();
        int year = getYear();
        if(getMonth() == 1|| getMonth() == 2){
            month += 12;
            year -= 1;
        }
        String[] week = {"일","월","화","수","목","금","토"};
        int weekday= (int) (year-2000+Math.floor((year-2000)/4)+5-40+Math.floor(26*(month+1)/10)+getDay()-1);
        weekday %= 7;
        return week[weekday];
    }
}
