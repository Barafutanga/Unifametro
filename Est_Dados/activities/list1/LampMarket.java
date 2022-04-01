package list1;
import java.util.Locale;
import java.util.Scanner;

public class LampMarket {
    public static void main (String[] args) {
        //Character adjustment
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //lamp models & price per unit
        String[] model = {"Shitabra", "Philto", "RamOS", "Sany"};
        Double[] price = {10.7, 9.45, 7.79, 14.9}; 
        int code, size;
        
        //terminal lamps output
        for (int i = 0; i < model.length; i++) {
            System.out.printf("CODE: " + i + " Brand: " + model[i] + ", ");
            System.out.printf("$" + price[i], "\n");
            System.out.println();
        }
        System.out.println();
        
        System.out.print("Select one to buy (code): ");
            code = sc.nextInt();
        System.out.print("Select the quantity to buy: ");
            size = sc.nextInt();
        double total = size * price[code];
        System.out.printf("\n[CASHIER] \nBrand: %s\nPrice: $%.2f\nQuantitiy: %d\nTotal: $%.2f", model[code], price[code], size, total);
        
        
        System.out.println(); //Gambiarra pra ajustar a estrutura do terminal, a IDE apresenta problemas
        sc.close();
    }
    
}
