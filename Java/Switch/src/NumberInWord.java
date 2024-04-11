public class NumberInWord {
    public static void main(String[] args) {
        int i;
         for( i=0 ; i<=10; i++) {
             printNumberInWord(i);
        }
    }
    public static void printNumberInWord(int number){
        String inWords;
        switch (number) {
            case 0:
                inWords = "ZERO";
                break;
            case 1:
                inWords = "ONE";
                break;
            case 2:
                inWords = "TWO";
                break;
            case 3:
                inWords = "THREE";
                break;
            case 4:
                inWords = "FOUR";
                break;
            case 5:
                inWords = "FIVE";
                break;
            case 6:
                inWords = "SIX";
                break;
            case 7:
                inWords = "SEVEN";
                break;
            case 8:
                inWords = "EIGHT";
                break;
            case 9:
                inWords = "NINE";
                break;
            default:
                inWords = "OTHER";
                break;
        }
        System.out.println(number+ " number in words is " +inWords);
    }
}
