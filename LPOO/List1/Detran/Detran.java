package Detran;

public class Detran {
    public long cpf;
    public short licenseId;
    public String licenseType;
    public byte licensePoints;
    public boolean licenseStatus;
    public byte day, month, year;
    public int expedDay = (day * 60) * month * year;
    public int expireDay = (day* 60) * month * year;

    public void infraction(){
        licensePoints ++;
    }

    public void resetPoints(){
        byte factor = (byte) Math.floor(Math.random() * 99);
        if (factor % 4 == 0 ) {
            licensePoints = 0;
        }
    }

    public void checkStatus(){
        if (licensePoints <= 20) {
            licenseStatus = true;
        } else {
            licenseStatus = false;
        }
    }

    public void createLicense(){
        cpf = (long) Math.floor(Math.random() * 999999999);
        licenseId = (short) Math.floor(Math.random() * 9999);
        licensePoints = 0;
        
    }
}