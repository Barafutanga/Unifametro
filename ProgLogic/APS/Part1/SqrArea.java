 import java.util.Scanner;

public class SqrArea {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("WELCOME TO SQUARE AREA! PLEASE, INSERT EDGE's VALUE\nMeters: ");
        int Edge = sc.nextInt();
        int Area = Edge * Edge;
        
        System.out.println("AREA * 2: " + (Area * 2) + "m");
        
     
        sc.close();
    }
    
}
