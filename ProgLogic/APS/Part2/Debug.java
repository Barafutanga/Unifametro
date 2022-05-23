import java.util.Scanner;
public class Debug {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int v1;
        String v2;

        //OCT > DEC
        System.out.print("INSERT VALUE TO CONVERT\nVALUE: ");
            v2 = Integer.toString(sc.nextInt());
            v1 = Integer.parseInt(v2, 8);
            System.out.printf("ORIGINAL: %s | x10: %d", v2, v1);

        //DEC > OCT
        System.out.print("INSERT VALUE TO CONVERT\nVALUE: ");
            v1 = sc.nextInt();
            v2 = Integer.toOctalString(v1);
            System.out.printf("ORIGINAL: %d | x10: %s", v1, v2);
        sc.close();
    }
}