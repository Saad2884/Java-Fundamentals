public class ControlFlow {
    public static void main(String[] args) {
        int j = 5;
        while (j > 0) {
            System.out.println("A " + j);
            j--;
        }
        int k = 0;
        do {
            System.out.println("B " + k);
            k++;
        } while (k < 5);
        for (int i = 0; i < 5; i++) {
            if (i < 2)
                System.out.println("C " + i);
            else if (i < 4)
                System.out.println("D " + i);
            else
                System.out.println("E " + i);
        }
        for (int l = 0; l < 5; l++) {
            switch (l) {
                case 0, 1 -> System.out.println("F " + l);
                case 2, 3 -> System.out.println("G " + l);
                default -> System.out.println("H " + l);
            }
        }
    }
}
