import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Converter {
    public static void main (String[] args ) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int operation;
        
        System.out.println("WELCOME TO CONVERTRON-3000! WHAT CONVERSION YOU'RE LOOKING FOR?");
        do {
            TimeUnit.SECONDS.sleep(2);
            System.out.print("0- DECIMAL > HEXADECIMAL\n1- HEXADECIMAL > DECIMAL\n2- DECIMAL > OCTAL\n3- OCTAL > DECIMAL\n4- SHUTDOWN\nOperation: ");
            operation = sc.nextInt();
            int v1;
            String v2;
            
            switch (operation) {
                case 0: //DEC > HEX
                System.out.print("INSERT VALUE TO CONVERT\nVALUE: ");
                v1 = sc.nextInt();
                v2 = Integer.toHexString(v1);
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("ORIGINAL: %d\nx16: %s\n", v1, v2);
                break;
                
                case 1: //HEX > DEC
                System.out.print("INSERT VALUE TO CONVERT\nVALUE: ");
                v2 = sc.nextLine();
                v2 = sc.nextLine();
                v1 = Integer.parseInt(v2, 16);
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("ORIGINAL: %s | x10: %d\n", v2, v1);
                break;
                
                case 2: //DEC > OCT
                System.out.print("INSERT VALUE TO CONVERT\nVALUE: ");
                v2 = Integer.toString(sc.nextInt());
                v1 = Integer.parseInt(v2, 8);
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("ORIGINAL: %s | x10: %d\n", v2, v1);
                break;
                
                case 3: //OCT > DEC
                System.out.print("INSERT VALUE TO CONVERT\nVALUE: ");
                v1 = sc.nextInt();
                v2 = Integer.toOctalString(v1);
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("ORIGINAL: %d | x10: %s\n", v1, v2);

                default: 
                System.out.println("INVALID OPERATION");
                break;
            }
        } while (operation >= 0 && operation <= 3);
        System.out.println("BYE! :)");
        sc.close();
    }
}