package AP1.LinkedList.Question4;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Question4 {
    public static void main(String[] args) {
        int select, selectPlate ;
        Scanner sc = new Scanner(System.in);
        List<String> brand = new ArrayList<String>();
        List<String> model = new ArrayList<String>();
        List<String> owner = new ArrayList<String>();
        List<Integer> licensePlate = new ArrayList<Integer>();
        List<Integer> assemblyYear = new ArrayList<Integer>();
        List<Integer> passengerCapacity = new ArrayList<Integer>();
        
        System.out.print("Welcome to LaRusso Auto Group: We kick the competition!\nPlease, select one option above:\n" +
        "0 - Add Car\n1 - Remove Car\n2 - Search Car\n3 - Show Inventory\n4 - off\nInput: ");
        
        do {
            select = sc.nextInt();
            if (select == 0) { //add car
                brand.add("Nissan");
                model.add("GTR - Egoist");
                owner.add("Eu");
                licensePlate.add((int) Math.floor(Math.random() * 99999));
                assemblyYear.add(2014);
                passengerCapacity.add(5);
            } else if (select == 1) { //remove car
                System.out.print("Insert License Plate: ");
                selectPlate = sc.nextInt();
                int i = 0;
                while (selectPlate == licensePlate.get(i)) {
                    i++;
                    if (selectPlate == licensePlate.get(i)) {
                        brand.remove(i);
                        model.remove(i);
                        owner.remove(i);
                        licensePlate.remove(i);
                        assemblyYear.remove(i);
                        passengerCapacity.remove(i);
                        break; 
                    }     
                }
            } else if (select == 2) { //search car
                System.out.print("Insert License Plate: ");
                selectPlate = sc.nextInt();
                int i = 0;
                while (selectPlate != licensePlate.get(i)) {
                    i++;
                    if (selectPlate == licensePlate.get(i)) {
                        System.out.println("Brand: " + brand.get(i));
                        System.out.println("Model: " + model.get(i));
                        System.out.println("Owner: " + owner.get(i));
                        System.out.println("License Plate: " + licensePlate.get(i));
                        System.out.println("Year: " + assemblyYear.get(i));
                        System.out.println("Passenger Capacity: " + passengerCapacity.get(i));
                    }
                }
            } else if (select == 3) { //Show inventory
                for (int i = 0; i < licensePlate.get(i); i++) {
                    System.out.printf("[CAR #%d]\n", i+1);
                    System.out.println("Brand: " + brand.get(i));
                    System.out.println("Model: " + model.get(i));
                    System.out.println("Owner: " + owner.get(i));
                    System.out.println("License Plate: " + licensePlate.get(i));
                    System.out.println("Year: " + assemblyYear.get(i));
                    System.out.println("Passenger Capacity: " + passengerCapacity.get(i));
                }
            } else {
                System.out.println("Power off");
                break;
            }
            System.out.print("Next Step: ");
        } while (select >= 0 || select < 4);
        sc.close(); 
    }
}