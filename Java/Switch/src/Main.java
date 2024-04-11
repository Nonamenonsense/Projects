public class Main {
    public static void main(String[] args) {
      /*  int value = 1;

        if (value == 1){
            System.out.println("Value was 1");
        }
        else if (value == 2){
            System.out.println("Value was 2");
        }
        else{
            System.out.println("Was not 1 or 2");
        }*/
        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> System.out.println("Value was " + switchValue);
            default -> System.out.println("Not specified Values");
        }
        String month = "DECEMBER";
        System.out.println(month+ " is in the " +getQuarter(month)+ " quarter");
    }
    public static String getQuarter(String month){
          return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "BAD";
        };
    }
}
