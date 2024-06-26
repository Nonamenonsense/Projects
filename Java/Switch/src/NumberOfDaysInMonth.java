public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1600));
        System.out.print(getDaysInMonth(2,2020));
    }

    public static boolean isLeapYear(int year){
       if(year>=1 && year<= 9999) {
           if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
               return true;
           } else {
               return false;
           }
       }
       else return false;
    }

    public static int getDaysInMonth(int month, int year){

        if((month<1 && month> 12) || (year<1 && year>9999))
            return -1;
        if(isLeapYear(year)== true && month==2)
            return 29;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            default:
                return 30;
        }
    }
}