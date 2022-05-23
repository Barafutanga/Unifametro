 /* 

public class EmployeeStats {
    private String name;
    private short id;
    private double sallary;
    
    public EmployeeStats() {
    }
    
    public EmployeeStats(String name, short id, double sallary) {
        this.name = name;
        this.id = id;
        this.sallary = sallary;
    }

    public String getName(String name) {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public short getId() {
        return id;
    }
    public void setId(short id) {
        this.id = id;
    }
    
    public double getSallary() {
        return sallary;
    }
    public void setSallary(double sallary) {
        this.sallary = sallary;
    }
    public void increaseSallary(double percentage) {
        sallary += sallary * percentage / 100;
    }

    public String toString() {
        return id 
        + ", " 
        + name 
        + ", " 
        + String.format("%.2f", sallary);
    }
}*/