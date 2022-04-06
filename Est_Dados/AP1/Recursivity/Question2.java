package AP1.Recursivity;

public class Question2 {
    public static String numb(int num) {
        String textnum = String.valueOf(num);
        StringBuilder variable = new StringBuilder();

        variable.append(textnum);
        variable.reverse();

        return String.valueOf(variable);
    }
    public static void main (String[] args) {
        Integer number = (int) Math.floor(Math.random() * 99999);
        int numberReverse = Integer.valueOf(numb(number));
        System.out.printf("Original value: %d\nReverse value: %d", number, numberReverse);
    }
}