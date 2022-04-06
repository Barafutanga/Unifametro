package AP1.Recursivity;

public class Question3 {
    public static void main(String[] args) {
        int disks = 3;
        int moves = (int) Math.pow(2, disks) - 1;
        hanoi(disks, 'A', 'B', 'C');
        System.out.print("Min moves: " + moves);
    }
    
    private static void hanoi(int disks, char origin, char auxiliary, char destination) {
        if (disks > 0) {
            hanoi(disks-1, origin, auxiliary, destination);
            System.out.printf("%s -> %s\n", origin, destination);
            hanoi(disks-1, auxiliary, origin, destination);
        }
    }
}