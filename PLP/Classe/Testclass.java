public class Testclass{
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int mult = x * y++;
        y = 4;
        int mult2 = x * ++y;

        System.out.println(mult);
        System.out.println((mult2));
    }
}