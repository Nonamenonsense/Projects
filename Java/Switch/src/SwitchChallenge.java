public class SwitchChallenge {
    public static void main(String[] args) {
        char letter = 'C';

        switch (letter) {
            case ('A'):
                System.out.println(letter+ " = Able");
                break;
            case 'B':
                System.out.println(letter+ " = Baker");
                break;
            case 'C':
                System.out.println(letter+ " = Charlie");
                break;
            case 'D':
                System.out.println(letter+ " = Dog");
                break;
            case 'E':
                System.out.println(letter+ " = Easyr");
                break;
            default:
                System.out.println(letter+ " = Not found");
                break;

        }
    }
}
