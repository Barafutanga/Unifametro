package AP1.Recursivity;
import java.util.Arrays;
public class Question1 {

    public static int randomNum(int repeat) {
        int[] num = new int[repeat];

        do {
            repeat--;
            num[repeat] = (int) Math.floor(Math.random() * 99);
        } while (repeat > 0);
    
        return num[repeat];
    }

    public static void main(String[] args) {
        
    int size = 4; 
    int[] vect = new int[size];

        for (int i = 0; i < size; i++) {
            vect[i] = randomNum(size);
        }

        Arrays.sort(vect);

        for (int i = 0; i < size; i++) {
            System.out.print("| " + vect[i] + " |");
        }
        
        System.out.println("\nLowest number: " + vect[0]);
        System.out.println("Hightest number: " + vect[size - 1]);
    }
}