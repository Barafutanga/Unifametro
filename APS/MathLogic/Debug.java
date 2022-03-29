package MathLogic;
import java.util.Scanner;

public class Debug {
    
    public static double payValue(double lPrice, double lTank) {
        double payValue = lPrice * lTank;
        return payValue;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("WELCOME TO POSTO IPIRANGA, SELECT ONE FUEL AND AMOUNT TO FILL\n$7.56 GAS - 0\n$6.45 DIESEL - 1\n$7.04 ANG - 2\nFUEL SELECTED: ");
        double gas = 7.56, diesel = 6.45, ang = 7.04;
        byte fType = sc.nextByte();
        
        do {
            if (fType == 0) {
                System.out.print("GASOLINE SELECTED, HOW MANY LITTERS YOU WISH?\n");
                double litters = sc.nextDouble();
                System.out.printf("TOTAL: $%.2f\n", payValue(gas, litters));
            } else if (fType == 1) {
                System.out.print("DIESEL SELECTED, HOW MANY LITTERS YOU WISH?\n");
                double litters = sc.nextDouble();
                System.out.printf("TOTAL: $%.2f\n", payValue(diesel, litters));
            } else if (fType == 2) {
                System.out.print("AUTOMOTIVE NATURAL GAS SELECTED, HOW MANY LITTERS YOU WISH?\n");
                double litters = sc.nextDouble();
                System.out.printf("TOTAL: $%.2f\n", payValue(ang, litters));
            }
        } while (fType >= 0 && fType <= 2);

        System.out.println("bye!");       
        sc.close();
    }
}