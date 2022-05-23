import java.util.Arrays;
public class AgeMix {
    public static int Mix1 (int man, int fem) {
        return man + fem;
    }
    public static int Mix2 (int man, int fem) {
        return man * fem;
    }
    public static void main(String[] args) {
        int[] mAge = new int[2];
        int[] fAge = new int[2];
        
        for (int i = 0 ; i <mAge.length; i++) {
            do {
                mAge[i] = (int) Math.floor(Math.random() * 79) + 18;
                fAge[i] = (int) Math.floor(Math.random() * 79) + 18;
                i++;
                if (i > 1) {
                    break;
                }
            } while (mAge[i] < 18 && fAge[i] < 18);
        } 
        
        Arrays.sort(fAge);
        Arrays.sort(mAge);

        System.out.printf("Mans age: %d and %d\n", mAge[0], mAge[1]);
        System.out.printf("Ladys age: %d and %d\n", fAge[0], fAge[1]);
        
        System.out.println("Old man + Young lady >> " + Mix1(mAge[1], fAge[0]));
        System.out.println("Yond man * Old lady >> " + Mix2(mAge[0], fAge[1]));
    } 
}