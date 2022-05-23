 import java.util.Scanner;

public class EmployeeSalary {

    public static double increaseSallary(double percentage, double sallary) {
        return sallary += sallary * percentage / 100;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double sallary;
        
        System.out.print("INSERT YOUR NAME AND SALLARY ABOVE: \nNAME: ");
        name = sc.nextLine();
        System.out.print("SALLARY: ");
        sallary = sc.nextDouble();

        System.out.print("INCREASE SALLARY PERCENT BY: ");
        double percentage = sc.nextDouble();
        sallary = increaseSallary(percentage, sallary);

        System.out.printf("UPDATED DATA\nNAME: %s\nSALLARY: $%.2f\n", name, sallary);    
        sc.close();
    }
}