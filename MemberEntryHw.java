import java.util.*;

public class MemberEntryHw {
    public static void main(String[] args) {
        String first_name, middle_initials, last_name;
        int mem_number;
        double Oeuros;
        final double euros;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter your first name: ");
            first_name = in.nextLine();
            first_name = first_name.substring(0, 1).toUpperCase() + first_name.substring(1).toLowerCase();

            System.out.print("Enter your middle name: ");
            middle_initials = in.nextLine();
            middle_initials = middle_initials.toUpperCase();
            middle_initials = middle_initials.substring(0, 1);

            System.out.print("Enter your last name: ");
            last_name = in.nextLine();
            last_name = last_name.substring(0, 1).toUpperCase() + last_name.substring(1).toLowerCase();

            System.out.print("Enter your membership number: ");
            mem_number = Integer.parseInt(in.nextLine());

            System.out.printf("Name: %s %s %s \n", first_name, middle_initials, last_name);
            System.out.println("Membership number: " + mem_number);

            euros = 322.99;

            System.out.println("The member ship fees is: " + euros);
            System.out.print("Enter your membership amount you have paid: ");
            double Peuros = Double.parseDouble(in.nextLine());
            Oeuros = euros - Peuros;

            System.out.println("Your owing membership amount is: " + Oeuros);

            enum status {
                eihter, active, inactive, hold
            }
            status mem_Status;
            // System.out.println(mem_Status);

            if (Oeuros == 0) {
                mem_Status = status.active;
            } else if (Oeuros >= euros) {
                mem_Status = status.inactive;
            } else if (Oeuros > 0 && Oeuros < 322.99) {
                mem_Status = status.hold;
            } else {
                System.out.println("write correct amount: ");
                mem_Status = status.eihter;
            }

            System.out.println("Your membership status is: " + mem_Status);

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
