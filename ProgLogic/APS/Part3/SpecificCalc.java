public class SpecificCalc {
    public static void main(String[] args) {
        int compare = 1000, x = 0;

        for (int i = 0; i > -1; i++) {
            if (x > compare && x % 11 == 5) {
                System.out.println(x);
                break;
            }
            x = i;
        }
    }
}
