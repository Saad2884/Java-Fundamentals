public class FormattedNumbers {
    public static void main(String[] args) {
        double numberIncorrectCast = 100/3;
        double numberCorrectCast = 100.0/3.0;
        System.out.printf("Compare: %6.2f %10.2f\n", numberIncorrectCast, numberCorrectCast);
        String name = "Chris";
        char letter = 'J';
        boolean fact = true;
        int age = 18;
        System.out.printf("Details: %s %c %b %d\n", name, letter, fact, age);
        }
}
