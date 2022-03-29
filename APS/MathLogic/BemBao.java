package MathLogic;
import java.util.Scanner;

public class BemBao {
    public static double lunchPrice(double weight, double vGram) {
        double lunchPrice = vGram * (weight * 1000);
        return lunchPrice;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double vGram = 0.012;

        System.out.print("WELCOME TO BEM-BÃO's RESTAURANT! PLEASE, INFORM YOUR LUNCH WEIGHT (use comma ','):\n(Kg): ");
        double lunchWeight = sc.nextDouble();

        System.out.printf("R$:%.2f", lunchPrice(lunchWeight, vGram));
        
        sc.close();
    }   
}