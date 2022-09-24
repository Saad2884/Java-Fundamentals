public class ControlFlowWithBreaks {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("A " + i);
            if (i > 5)
                break;
        }
        // breaks to here
        main_loop: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("B " + i + " " + j);
                if (i > 3)
                    break main_loop;
            }
        }
        // breaks to here
        for (int i = 0; i < 5; i++) {
            if (i == 3) //skip value if i == 3
                continue;
            System.out.println("C " + i);
        }
    }
}
