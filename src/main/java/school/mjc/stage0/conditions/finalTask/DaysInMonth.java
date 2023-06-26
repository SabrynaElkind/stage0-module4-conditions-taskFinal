package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year>1584 && (year%400==0)|| (year%4==0 && year%100!=0)){ // високостный год
            switch (month){
                case 1,3,4,5,6,7,8,9,10,11,12:
                    System.out.println("30");break;
                case 2:
                    System.out.println("29"); break;
                default:
                    System.out.println( "invalid date");
            }
        } else {
            switch (month){
                case 1,3,4,5,6,7,8,9,10,11,12:
                    System.out.println("30");break;
                case 2:
                    System.out.println("28"); break;
                default:
                    System.out.println( "invalid date");
            }
        }

    }
}
