package Detran;
public class MainDetran {
    public static void main(String[] args){
        Detran dt = new Detran();
        dt.createLicense("A");
        dt.infraction((byte) 21);

        dt.checkStatus();
        System.out.println(dt);
        System.out.println(dt.checkStatus());
    }
}