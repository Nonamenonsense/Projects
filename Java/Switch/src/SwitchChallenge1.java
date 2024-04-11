public class SwitchChallenge1 {
    public static void main(String[] args) {
        printDayofWeek(0);
        printDayofWeek(1);
        printDayofWeek(2);
        printDayofWeek(3);
        printDayofWeek(4);
        printDayofWeek(5);
        printDayofWeek(6);
        printDayofWeek(7);

        for (int i = 0; i < 8; i++) {
            printWeekDay(i);
        }


    }

    public static void printDayofWeek(int number) {
        String nameOfTheDay = "Null";
        switch (number) {
            case 0 -> nameOfTheDay = "Sunday";
            case 1 -> nameOfTheDay = "Monday";
            case 2 -> nameOfTheDay = "Tuesday";
            case 3 -> nameOfTheDay = "Wednesday";
            case 4 -> nameOfTheDay = "Thursday";
            case 5 -> nameOfTheDay = "Friday";
            case 6 -> nameOfTheDay = "Saturday";
            default -> nameOfTheDay = "Invalid Day";
        }
        System.out.println(number + " = " + nameOfTheDay);
    }

    public static void printWeekDay(int number) {
        String dayName;
        if (number == 0){
            dayName = "Sunday";}
        else if (number == 1)
        {dayName = "Monday";}
        else if (number == 2)
         dayName = "Tuesday";
        else if (number == 3)
         dayName = "Wednesday";
        else if (number == 4)
         dayName = "Thursday";
        else if (number == 5)
         dayName = "Friday";
        else if (number == 6)
        dayName = "Saturday";
        else
            dayName ="Invalid Day";

    System.out.println(number + " = " +dayName);
    }
}
