import java.util.Scanner;
public class TriNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 1;
        
        for (i = 1; i * (i + 1) * (i + 2) <= x; i++) {
            if (i * (i + 1) * (i + 2) == x) {
                System.out.printf("%d Is a triangular number!", x);
            }
            
            sc.close();
        }
    }
}
