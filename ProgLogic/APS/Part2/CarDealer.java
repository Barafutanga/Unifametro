import java.util.Scanner;
    
public class CarDealer {    
    public static double salesProfit (int Sells, double carValue) {
        return Sells * carValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double carValue = Math.floor(Math.random()*999) * 100;
        double wage, commission = carValue * 5 / 100;
        int sells;
        

        System.out.print("Cars solds this month: ");
        sells = sc.nextInt();
        System.out.print("Digit your current sallary: ");
        wage = sc.nextDouble();
        System.out.printf("Car value: $%.2f", carValue);

        System.out.printf("\nCongratulations! Here's your payment this month: $%.2f", (wage + commission * sells));


        sc.close();
    }
}
