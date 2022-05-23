public class Rchlo {
    public static void main(String[] args) {
        int client = (int) Math.floor(Math.random() * 3);
        double price = Math.floor(Math.random() * 99) * 10;
        double discount;
        
        System.out.printf("[CHECK-IN CASHIER]\nProduct current price: %.2f\n", price);

        switch (client) {
            case 0:
            discount = 0.0;    
            price -= (price * discount) / 100;
            System.out.printf("%d - Default Client\nDiscount: %.2f\n", client, discount);
            System.out.printf("Amount to pay: %.2f", price);    
            break;

            case 1:
            discount = 5.0;    
            price -= (price * discount) / 100;
            System.out.printf("%d - VIP Client\nDiscount: %.2f\n", client, discount);
            System.out.printf("Amount to pay: %.2f", price);    
            break;

            case 2:
            discount = 10.0;    
            price -= (price * discount) / 100;
            System.out.printf("%d - Employee\nDiscount: %.2f\n", client, discount);
            System.out.printf("Amount to pay: %.2f", price);  
        }
    }
}