package Animals;
import java.util.Scanner;
public class MainAnimal {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Animals anm = new Animals();
        System.out.print("Name: ");
        anm.setName(sc.nextLine());
        System.out.print("Specie: ");
        anm.setSpecie(sc.nextLine());
        System.out.print("Class: ");
        anm.setAnimalclass(sc.nextLine());
        System.out.print("Weight: ");
        anm.setWeight(sc.nextShort());
        System.out.print("Age: ");
        anm.setAge(sc.nextByte());
        
        sc.close();
    }
}
