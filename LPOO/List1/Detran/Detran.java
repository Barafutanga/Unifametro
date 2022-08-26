package Detran;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Detran {
    public long cpf;
    public short licenseId;
    public String licenseType;
    public byte licensePoints;
    public boolean licenseStatus;
    public Date releasedate, expiredate;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
    
    
    public void infraction(byte points){
        licensePoints += points;
    }
    
    public void resetPoints(){
        licensePoints = 0;
    }
    
    public void seizeLicense(){
        licenseStatus = false;
    }

    public String checkStatus(){
        if (licensePoints <= 20) {
            licenseStatus = true;
            return("Valid license"); 
        } else {
            licenseStatus = false;
            return("Invalid license"); 
        }
    }
    
    public void createLicense(String lType){
        releasedate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(releasedate);
        cal.add(Calendar.YEAR, 10);
        expiredate = cal.getTime();
        cpf = (long) Math.floor(Math.random() * 999999999);
        licenseId = (short) Math.floor(Math.random() * 9999);
        licensePoints = 0;
        licenseType = lType;
        licenseStatus = true;
    }

    @Override
    public String toString() {
        return "DRIVER LICENSE" 
        + "\ncpf= " 
        + cpf 
        + "\nLicense Id= " 
        + licenseId 
        + "\nLicense Points= "
        + licensePoints 
        + "\nLicense Type= " 
        + licenseType
        + "\nRelease Date= "
        + sdf.format(releasedate)
        + "\nExpire Date= " 
        + sdf.format(expiredate);
    }
}