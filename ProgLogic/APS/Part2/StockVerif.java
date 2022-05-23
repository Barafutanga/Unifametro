import java.util.Scanner;
public class StockVerif {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in); 
        int max = 200;
        int min = 30;
        int ctStock;
        double med = (max + min) / 2;

        System.out.println("Insert current stock size: ");
        ctStock = sc.nextInt();

        if (ctStock > med) {
            System.out.println("You shall not buy this one");
        } else {
            System.out.println("Buy this one");
        }
        sc.close();
    }
}
