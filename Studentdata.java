public class Studentdata {
    public static void main(String[] args) {
        int studentNumber;
        studentNumber = 93704723;
        System.out.print("Student Number ");
        System.out.println(studentNumber);
        char entryCode = 'C';
        System.out.println("Entry Route " + entryCode);
        double fees = 3000.00, feesPaid = 1500.00;
        System.out.println("Fees " + fees + " Paid " + feesPaid);
        boolean enrolled = true;
        var stage = 1;
        var coordinator = "John";
        System.out.println("Enrolled: " + enrolled);
        System.out.println("Stage " + stage);
        System.out.println("Coordinator " + coordinator);
        final int MODULES_PER_TRIMESTER = 6;
        System.out.println("Number of modules " + MODULES_PER_TRIMESTER);
        enum Grade {
            A, B, C, D, FAIL, NO_GRADE
        }
        ;
        Grade studentGrade = Grade.B;
        System.out.println("Grade " + studentGrade);
    }
}
