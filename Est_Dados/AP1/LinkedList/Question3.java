package AP1.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Integer> cpf = new ArrayList<>();
        List<Double> sallary = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int repeat = 5;
        
        for (int i = 0; i < repeat; i++) {
            System.out.printf("[EXPLOYEE #%d DATA]\n", i+1);
            
            System.out.print("Name: ");
            name.add(sc.nextLine());
            
            System.out.print("Cpf: ");
            cpf.add((int) Math.floor(Math.random() * 999999999));
            System.out.println(cpf.get(i));
            
            System.out.print("Sallary: ");
            sallary.add(Math.floor(Math.random() * 9999));
            System.out.println((sallary.get(i)));
        }
        
        System.out.print("[FIRE EMPLOYEE]\ncpf: ");
        int localcpf = sc.nextInt();
        int i = 1;
        
        while (localcpf != cpf.get(i)) {
            i++;
            if (localcpf == cpf.get(i)) {
                cpf.remove(i);
                name.remove(i);
                sallary.remove(i);
                break; 
            }     
        }

        System.out.println("[UPDATED DATA]\n");
        for (int j = 0; j < 4; j++) {
            System.out.printf("[EMPLOYEE #%d]\n", j+1);
            System.out.printf("Name: %s\n", name.get(j));
            System.out.printf("cpf: %d\n", cpf.get(j));
            System.out.printf("Sallary: %.2f\n", sallary.get(j));
        }
        sc.close();
    }
}