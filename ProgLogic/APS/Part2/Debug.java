public class Debug {
    
    private int num1;
    
    public int getNum1() {
        return num1;
    }
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public String verificaTriangular() {
        int i = 1;
        for (i = 1; i * (i + 1) * (i + 2) < num1; i++) {
            if (i * (i + 1) * (i + 2) == num1) {
                return "É triangular";
            }
            
        }
        return "Não é triangular";
        
    }
}    