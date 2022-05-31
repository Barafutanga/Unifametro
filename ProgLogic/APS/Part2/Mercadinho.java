import java.util.Scanner;
public class Mercadinho {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean purchaseMode = false;
        int selection, quantity, carQuantity = 0;
        double price, total = 0;
        double[] shopCart = new double[14];
        int[] itensCart = new int[14];
        int i = 0;
        
        
        System.out.println("WELCOME TO JUCA'S STORE! FEEL FREE TO EXPLORE OUR PRODUTCS!");
        
        do {
            if (purchaseMode == true) {
                System.out.println("PURCHASE MODE (due to covid pandemic, max 14 itens per people)");
            }
            System.out.print("0- BANANA\n1- INSTANT NOODLES\n2- PEANUT BUTTER\n3- TOGGLE PURCHASE MODE\n4- CHECKOUT\nSELECTED: ");
            selection = sc.nextInt();
            
            switch (selection) {
                
                case 0: //BANANA
                System.out.println("---\nIt's yellow\n$0.47 x1");
                if (purchaseMode == true && i <= 14)  {
                    System.out.print("QUANTITY: ");
                    quantity = sc.nextInt();
                    price = 0.47;
                    shopCart[i] = price * quantity;
                    itensCart[i] = quantity;
                    i++;
                } else if (i > 14) {
                    System.out.println("MAX ITENS REACHED!");
                }
                break;
                
                case 1: //INSTANT NOODLES
                System.out.println("---\nPacked cancer. Works better with soda!\n$1.05 x1");
                if (purchaseMode == true && i <= 14) {
                    System.out.print("QUANTITY: ");
                    quantity = sc.nextInt();
                    price = 1.05;
                    shopCart[i] = price * quantity;
                    itensCart[i] = quantity;
                    i++;
                } else if (i > 14) {
                    System.out.println("MAX ITENS REACHED!");
                }
                break;
                
                case 2: //PEANUT BUTTER
                System.out.println("---\nUsed by mans as food, shampoo, motor oil, toothpaste, etc.\n$2.20 x1");
                if (purchaseMode == true && i <= 14) {
                    System.out.print("QUANTITY: ");
                    quantity = sc.nextInt();
                    price = 2.20;
                    shopCart[i] = price * quantity;
                    itensCart[i] = quantity;
                    i++;
                } else if (i > 14) {
                    System.out.println("MAX ITENS REACHED!");
                }
                break;
                
                case 3: //PURCHASE TOGGLE
                purchaseMode = !purchaseMode;
                break;
            }   
        } while (selection >= 0 && selection <= 3);
        
        for (int r = 0; r < shopCart.length; r++) {
            total += shopCart[r];
            carQuantity += itensCart[r];
        }

        if (carQuantity <= 5) {
            total = total - (total * 2 /100);
        } else if (carQuantity > 5 && carQuantity <= 10) {
            total = total - (total * 3 /100);
        } else if (carQuantity > 10) {
            total = total - (total * 5 /100);
        }

        System.out.printf("$%.2f",total);
        
        sc.close();
    }
}