public class MemberDataHw {
    public static void main(String[] args){
        String first_name, middle_initials, last_name;
        int mem_number, Oeuros, Ocents;
        final int euros, cents;
        first_name = "Muhammad";
        middle_initials = "S";
        last_name = "Memon";
        System.out.println("NAME: " + first_name + " " + middle_initials + " " + last_name);
        mem_number = 222045238;
        System.out.println("Membership number: " + mem_number);
        euros = 322;
        cents = 99;
        System.out.println("Membership fees: " + euros + "." + cents + " euros" );
        Oeuros = 155;
        Ocents = 50;
        System.out.println("Membership Owing: " + Oeuros + "." + Ocents + " euros" );
        enum status {
            eihter, active, past, hold
        }
        status mem_status = status.hold;
        System.out.println("Membership status: " + mem_status);
    }
}
