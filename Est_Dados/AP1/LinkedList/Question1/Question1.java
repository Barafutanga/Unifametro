package AP1.LinkedList.Question1;
import java.util.Scanner;


public class Question1 {
    public static void main(String[] args) {
        LinkedList<Integer> prodquantity = new LinkedList<Integer>(); 
        LinkedList<Integer> prodbatch = new LinkedList<Integer>();
        LinkedList<Double> prodprice = new LinkedList<Double>();
        Scanner sc = new Scanner(System.in);
        double price, discount;
        int mfbatch, quantity;
        
        System.out.println("How many products will be added?");
        int products = sc.nextInt();
        
        for (int i = 0; i < products; i++) {
            System.out.printf("Product manufacturer code #%d: ", i+1);
            mfbatch = (int) Math.floor(Math.random() * 9999);
            prodbatch.add(mfbatch);
            System.out.println(mfbatch);
            
            System.out.printf("Product price per unit #%d $", i+1);
            do {
                price = Math.floor(Math.random() * 99);
            } while (price < 0);
            prodprice.add(price);
            System.out.println(price);
            
            System.out.printf("Product stock size #%d: ", i+1);
            do {
                quantity = (int) Math.floor(Math.random() * 9999);
            } while (quantity < 500);
            prodquantity.add(quantity);
            System.out.println(quantity);
            System.out.println("---");
        }
        
        System.out.print("Discount tax: ");
        discount = sc.nextDouble();
        System.out.println("[UPDATED DATA]");
        for (int i = 0; i < products; i++) {
            double x = prodprice.get(i).getValue();
            prodprice.remove(i+1);
            prodprice.add((x - x * discount) / 100);
            System.out.printf("Product %d: $%.2f\n", prodbatch.get(i).getValue(), prodprice.get(i).getValue());
        }
        sc.close();
    }
}