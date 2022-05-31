import java.util.Scanner;
public class NumPrint {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int num, pos = 0;
        int[] pt = new int[100];
        
        do {
            num = sc.nextInt();
            
            if (num >= 100 && num <= 200) {
                pt[pos] = num;
                pos++;
            }
        } while (num != 0);
        
        System.out.print("Number filtered: ");
        for (int i = 0; i < pt.length; i++) {
            if (pt[i] != 0) {
                System.out.print(pt[i] + " | ");
            }
        }   
        sc.close();
    }
}
