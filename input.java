import java.util.*;

public class input {
        public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("What is your name? ");
            String name = in.nextLine();
            System.out.print("How old are you? ");
            int age = in.nextInt();
            System.out.println("Hi " + name + ", age " + age + ".");
        }
        System.out.println("Don't worrry, age is just number.");
        }
}
