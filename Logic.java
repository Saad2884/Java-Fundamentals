public class Logic {

    public static void main(String[] args) {
        int zero = 0, one = 1;
        boolean never = false, always = true;
        if (zero < one && never != always) {
            System.out.println("Possible");
        } else {
            System.out.println("Not possible");
        }
        boolean result = zero < one ? true : false;
        System.out.println(result);
        int size = 1;
        String label = switch (size) {
            case 0 -> "SMALL";
            case 1, 2 -> "MEDIUM";
            case 3, 4 -> "LARGE";
            default -> "UNKNOWN";
        };
        System.out.println(label);
    }
}
