package list2;
import java.util.Scanner;

public class Potencia {
    //recursividade
    public static int pot(int base, int exp) {
        if (exp == 0)
            return 1;
        else
            return base * pot(base, exp - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("SELECIONE O MÉTODO QUE DESEJA TRABALHAR\n0- RECURSIVO\n1- NÃO RECURSIVO\nDIGITE: ");
        int method = sc.nextInt();

        //método recursivo
        if (method == 0) {
            System.out.print("DIGITE O NÚMERO A SER CALCULADO (BASE & EXPOENTE)\n");
            System.out.print("BASE: ");
            int b = sc.nextInt();
            System.out.print("EXPOENTE: ");
            int e = sc.nextInt();
        System.out.println("PRODUTO: " + pot(b, e));
        }
        
        //método não recursivo
        if (method == 1) {
            System.out.print("BASE: ");
            int b = sc.nextInt(); 
            System.out.print("EXPOENTE: ");
            int e = sc.nextInt();
            int prod = (int) Math.pow(b, e);

            System.out.print("PRODUTO: " + prod);
        }
        sc.close();
    }
}
