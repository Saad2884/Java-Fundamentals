public class PrimeNumbers {
    public static void main(String args[]) {
        int num = 1000;
        boolean[] bool = new boolean[num];
        System.out.println(bool.length);

        for (int i = 0; i < bool.length; i++) {
            bool[i] = true;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (bool[i] == true) {
                for (int j = (i * i); j < num; j = j + i) {
                    bool[j] = false;
                }
            }
        }
        System.out.println("List of prime numbers upto given number are : ");
        for (int i = 2; i < bool.length; i++) {
            if (bool[i] == true) {

                System.out.printf(i + " ");
            }
        }
    }
}
