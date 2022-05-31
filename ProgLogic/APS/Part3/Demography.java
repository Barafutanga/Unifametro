public class Demography {
    public static void main(String[] args) {
        double[][] human = new double[2][50];
        double height, htman = 0, htfem = 0, avgman = 0, avgfem = 0;
        int genre, man = 0, female = 0;
        
        for (int i = 0; i < 50; i++) {
            genre = (int) Math.floor(Math.random() * 2);
            do {
            height = Math.floor(Math.random() * 230) / 100;
            } while (height < 1.0);
            if (genre == 0) { //man
                human[genre][i] = height;
                avgman += height; //calculating total in height
                man++;
                if (height > htman) {
                    htman = height;
                } 
            }   
            else if (genre == 1) { //female
                human[genre][i] = height;
                avgfem += height; //calculating total in height
                female++;
                if (height > htfem) {
                    htfem = height;
                }
            }
        }

        avgman = avgman / man; //calculate the average height
        avgfem = avgfem / female; //calculate the average height

        System.out.printf("Hightest man: %.2fm | Hightest female: %.2fm\n", htman, htfem);            
        System.out.printf("Female average height: %.2fm | Male average height: %.2fm\n", avgfem, avgman);
    }
}