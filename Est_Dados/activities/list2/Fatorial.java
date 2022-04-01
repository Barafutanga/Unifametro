package list2;
import java.util.Scanner;

public class Fatorial {
     //recursividade
     public static int fato(int f) {
        if (f == 0 || f == 1) {
            return f;
        }
        return f *= fato((f - 1));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("SELECIONE O MÉTODO QUE SE DESEJA TRABALHAR\n0- RECURSIVO\n1- NÃO RECURSIVO\nDIGITE: ");
        int method = sc.nextInt();
        
        //método recursivo
        if (method == 0) {
            System.out.print("DIGITE O NÚMERO A SER FATORADO: ");
            int x = sc.nextInt();
            System.out.print(fato(x));
        } 
        
        else {
            //método não recursivo
            System.out.print("DIGITE O NÚMERO A SER FATORADO: ");
            int nfat = sc.nextInt();
            int size = 1;
            
            for (int i = nfat; i > 1; i--) {
                size *= i;
                System.out.println(size);
            }
        }  
        sc.close();
    }
}