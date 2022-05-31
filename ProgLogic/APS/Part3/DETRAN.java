import java.util.Arrays;
public class DETRAN {
    public static void main(String[]args) {
        double[][] bills = new double[20][5];
        double[] totalbyID = new double[20];
        double[] aux = new double[20];
        int[] cID = new int[20];
        double total = 0;
        
        //ID & Bills Generator
        for (int i = 0; i < cID.length; i++) {
            cID[i] = (int) Math.floor(Math.random() * 3427);
            for (int j = 0; j < 5; j++) {
                bills[i][j] = Math.floor(Math.random() * 99) * 10;
                totalbyID[i] += bills[i][j];
                aux[i] = totalbyID[i];
            }    
        }
        
        Arrays.sort(aux);
        
        //Print block above
        for (int i = 0; i < cID.length; i++) {
            System.out.printf("\n[ID %d] ", cID[i]);
            for (int j = 0; j < 5; j++) {
                System.out.print(bills[i][j] + " | ");
            }
        }

        for (int i = 0; i < totalbyID.length; i++) {
            total += totalbyID[i];
            if (i == 19) {
                System.out.printf("\nTotal earnings: $ %.2f", total);
            }
        }
        
        for (int i = 0; i < cID.length; i++) {
            if (totalbyID[i] == aux[19]) {
                System.out.println("\nMost expensive account: " + cID[i]);
            }
        }

    }
}