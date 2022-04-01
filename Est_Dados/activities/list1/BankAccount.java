package list1;

public class BankAccount {
    public static void main (String[] args) {
        String status;
        int id = (int) Math.floor (Math.random() * 9999);
        double creditCard;
        
        System.out.println("Welcome to NuBonk!");

        System.out.printf("Account number : %d \n", id);
        if (id % 2 == 0) {
            System.out.println("VIP account detected");
            status = "VIP";
            creditCard = 5000.00;
        } else {
            status = "Default account";
            creditCard = 400.00;
        }

        System.out.printf("Your account info \nID: %d \nStatus: %s \nCredit Card limit: $%.2f", id, status, creditCard);



        

        
        
        
    }
}
