package MathLogic;
import java.util.Scanner;

public class UnitConverter {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Meters, Centimeters;
        
        System.out.print("WELCOME TO METER-CENTIMETER, PLEASE, INSERT A VALUE\n(Meters): ");
        Meters = sc.nextInt();
        Centimeters = Meters * 100; 

        System.out.println(Centimeters + "cm");

        sc.close();
    }
}

