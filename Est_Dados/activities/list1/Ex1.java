package list1;

import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int monthN;
        
        do {
            System.out.print("Month number: ");
            monthN = sc.nextInt();
            if (monthN >= 1 && monthN <= 12) {
                System.out.println(month [monthN - 1]);
            }
            else if (monthN != 1)
            System.out.println("Invalid number"); 
        }
        while (monthN != 0);
            System.out.println("Ending program");
        
        sc.close();
    }
}