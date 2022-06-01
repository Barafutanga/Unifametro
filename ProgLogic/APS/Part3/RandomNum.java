public class RandomNum {
    public static void main(String[] args) {
        int num, aux, stop = 0, count = 0, higher = 0;
        
        do {
            num = (int) Math.floor(Math.random() * 999);
            aux = (int) Math.floor(Math.random() * 999);
            
            if (num == aux) {
                stop = -1;
            }
            if (num > higher) {
                higher = num;
            }

            System.out.print(num + " | ");
            count++;
        } while (stop != -1);

        System.out.printf("\nNumbers generated: %d\nHighest: %d", count, higher);
    }
}
