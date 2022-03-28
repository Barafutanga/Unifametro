package APS.MathLogic;
import java.util.Scanner;



public class SimpleCalcs {

    public static int ItemA(int a, int b) {
        int result = (a * 2) * (b / 2);
        return result;
    }
    public static int ItemB(int a, double b) {
        double result = (a * 3) + b;
        return (int) result;
    }
    public static int ItemC(int a) {
        double result = Math.pow(a, 3); 
        return (int) result;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int int1, int2;
        double double1;
        
        System.out.println("HEY, CAN YOU GIVE SOME VALUES FOR THESE VARIABLES?");
        
        System.out.print("int1: ");
        int1 = sc.nextInt();
        System.out.print("int2: ");
        int2 = sc.nextInt();
        System.out.print("double1: ");
        double1 = sc.nextDouble();
    
        System.out.printf("(2 * %d) * (1/2 * %d) = ", int1, int2);
        System.out.println(ItemA(int1, int2));

        System.out.printf("(3 * %d) + %.2f = ", int1, double1);
        System.out.println(ItemB(int1, double1));

        System.out.printf("%.2f³ = ", double1);
        System.out.println(ItemC((int) double1));
        
        sc.close();
    }
}
