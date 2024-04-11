public class IfStatement {
    public static void main(String[] args) {
        boolean isAlien = true;
        if(isAlien == false)
        {
            System.out.println("Oh Ha ha i knew it");
            System.out.println("I am scared");
        }
        else
        {
            System.out.println("AAAAAAAAAAAAHHH");
        }

        int topScore = 93;
        if (topScore <= 100)
        {
            System.out.println("Wow nice");
        }
        int secondScore = 86;
        if ((secondScore < topScore) && (topScore > 100)){
            System.out.println("Good luck next time bozo");
        }

        if((topScore > 95)|| (secondScore < 40)){
            System.out.println("Either of the both conditions are true");
        }
        int newValue = 50;
        if(newValue == 50){
            System.out.println("Error");
        }
        boolean isCar = true;
        if(isCar == false){
            System.out.println("Its not supposed to happen");
        }
        String makeOfCar = "Mahindra";
        boolean isDomestic = makeOfCar == "Mahindra" ? false : true;
        if(isDomestic){
            System.out.println("Kono caru wa domestic desu");
        }

        int age = 16;
        String ages = age <18 ? "Super bro" : "ada poda";
        System.out.println(ages);

        int bros = 20;
        String bross = bros < 20 ? "Bad" : "Good";
        System.out.print(bross);
    }
}
