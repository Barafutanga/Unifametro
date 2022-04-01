package list2;
import java.util.Scanner;

//recursividade
public class Fibonacci {
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);    
        }
    }
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        System.out.print("ESCOLHA O MÉTODO A SE TRABALHAR\n0- MÉTODO RECURSIVO\n1- MÉTODO NÃO RECURSIVO\nDIGITE: ");
        int method = sc.nextInt();

        //método recursivo
        if (method == 0) {
            System.out.print("DIGITE O TAMANHO DA SEQUÊNCIA\nTAMANHO: ");
            int x = sc.nextInt();
            
            System.out.print(fibo(x));
            System.out.println();
            
            sc.close();
        }
        
        //método não recursivo
        int n1 = 0, n2 = 1, fib;
        System.out.print("DIGITE O TAMANHO DA SEQUÊNCIA: ");
        int size = sc.nextInt();
        
        for (int i = 0; i <= size; i++) {
            fib = n1 + n2;
            n1 = n2;
            n2= fib;
            System.out.println(fib);
            
        }
    }
}

