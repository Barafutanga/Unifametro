package APS;
import java.util.Scanner;

public class DownloadLib {
    public static double download(int file, int speed) {
        double time = file / (speed / 8);
        return time;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("INSERT FILE SIZE\n(MB): ");
        int fileSize = sc.nextInt();
        System.out.print("INSERT INTERNET SPEED\n(Mbps): ");
        int netSpd = sc.nextInt();
        String time = String.format("%.2f", download(fileSize, netSpd) / 60);
        
        System.out.print("TIME ESTIMATED: " + time.replace(",", ":") + "min");
        
        sc.close();
    }
}
