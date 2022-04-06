package AP1.LinkedList.Question2;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int select, selectPlate ;
        Scanner sc = new Scanner(System.in);
        LinkedList<String> brand = new LinkedList<String>();
        LinkedList<String> model = new LinkedList<String>();
        LinkedList<String> owner = new LinkedList<String>();
        LinkedList<Integer> licensePlate = new LinkedList<Integer>();
        LinkedList<Integer> assemblyYear = new LinkedList<Integer>();
        LinkedList<Integer> passengerCapacity = new LinkedList<Integer>();
        
        System.out.println("Welcome to LaRusso Auto Group: We kick the competition!\nPlease, select one option above:\n" +
        "0 - Add Car\n1 - Remove Car\n2 - Search Car\n3 - Show Inventory");
        select = sc.nextInt();
        
        //add car
        if (select == 0) {
            brand.add("Nissan");
            model.add("GTR - Egoist");
            owner.add("Eu");
            licensePlate.add((int) Math.floor(Math.random() * 99999));
            assemblyYear.add(2014);
            passengerCapacity.add(5);
        } else if (select == 1) {
            System.out.print("Insert License Plate: ");
            selectPlate = sc.nextInt();
            int i = 0;
            while (selectPlate != licensePlate.get(i).getValue()) {
                i++;
                if (selectPlate == licensePlate.get(i).getValue()) {
                    brand.remove(i);
                    model.remove(i);
                    owner.remove(i);
                    licensePlate.remove(i);
                    assemblyYear.remove(i);
                    passengerCapacity.remove(i);
                    break; 
                }     
            }
        }
        sc.close(); 
    }
}