public class AgeGrowth {
    public static void main(String[] args) {
        double chico = 1.5, juca = 1.1;
        int ages = 0;

        do {
            chico += 0.2;
            juca += 0.3;
            ages++;    
        } while (chico > juca);

        System.out.println("Years needed: " + ages);
    }
}
