package MathLogic;
import java.util.Scanner;

public class TintStore {

    //value of the purchase
    public static double checkout(double price, int size) {
        double value = price * size;
        return value; 
    }
    //max amount of area that can be covered with tint buyed
    public static double maxCover( double area, int quantity) {
        double value = area * quantity;
        return value;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, canArea, canPrice, paintArea = 0; 
        int canQuantity = 1;
        
        //first problem
        System.out.print
        ("\nWELCOME TO HYDROMAR'S TINT STORE!\nWHAT'S THE AREA SIZE TO BE PAINTED?\nFOR DECIMAL VALUES, USE ','\nm²= ");
        area = sc.nextDouble();
        
        canArea = 54; canPrice = 80;
        do {
            if (paintArea < area)
            canQuantity++; 
            paintArea = canArea * canQuantity;
        } while (paintArea < area);
        System.out.printf("\nPAINT CANS NEEDED: %d\nPRICE PER CAN: R$:%.2f\nTOTAL: R$:%.2f\nMAX AREA COVERED: %.2fm²", 
        canQuantity, canPrice, checkout(canPrice, canQuantity), maxCover(canArea, canQuantity));

        System.out.print("3.6L Mode  = 0\n18L Mode = 1\nInsert mode selected = ");
        System.out.print
        ("\nWELCOME TO HYDROMAR'S TINT STORE!\nWHAT'S THE AREA SIZE TO BE PAINTED?\nFOR DECIMAL VALUES, USE ','\nm²= ");
        area = sc.nextDouble();
        
        canArea = 108; canPrice = 80;
        do {
            if (paintArea < area)
            canQuantity++; 
            paintArea = canArea * canQuantity;
        } while (paintArea < area);
        System.out.printf("\n[18L ONLY]\nPAINT CANS NEEDED: %d\nPRICE PER CAN: R$:%.2f\nTOTAL: R$:%.2f\nMAX AREA COVERED: %.2fm²", 
        canQuantity, canPrice, checkout(canPrice, canQuantity), maxCover(canArea, canQuantity));
        
        canArea = 21.6; canPrice = 25;
        do {
            if (paintArea < area)
            canQuantity++; 
            paintArea = canArea * canQuantity;
        } while (paintArea < area);
        System.out.printf("\n[3.6L ONLY]\nPAINT CANS NEEDED: %d\nPRICE PER CAN: R$:%.2f\nTOTAL: R$:%.2f\nMAX AREA COVERED: %.2fm²", 
        canQuantity, canPrice, checkout(canPrice, canQuantity), maxCover(canArea, canQuantity));
        
        sc.close();
    }
}