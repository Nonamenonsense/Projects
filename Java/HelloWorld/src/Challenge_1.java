public class Challenge_1 {
    public static void main(String[] args) {
        double a = 20.00d;
        double b = 80.00d;
        double c = (a + b)*100;
        double remainder = c % 40.00d;

        boolean d = (remainder == 0.00) ? true : false;
        System.out.println(d);

        if( d != true){
            System.out.println("Got some remainder");
        }
    }
}
