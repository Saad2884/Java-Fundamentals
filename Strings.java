public class Strings {
    public static void main(String[] args) {
        String firstName = "Micro", lastName = "Soft";
        System.out.println(firstName + lastName);
        String namesWithSpace = String.join(" ",firstName,lastName);
        System.out.println(namesWithSpace);
        System.out.println(firstName.repeat(3));
        System.out.println(firstName.substring(0,3));
        System.out.println(firstName.equals(lastName));
        System.out.println(firstName.equalsIgnoreCase("MICRO"));
        System.out.println(firstName.length());
        }
        }
        
