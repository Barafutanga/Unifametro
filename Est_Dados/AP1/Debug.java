package AP1;

public class Debug {
    static int maxr (int v[], int n)
        { 
           if (n == 1) return v[0];
           else {
              int x;
              x = maxr(v, n-1);
              if (x > v[n-1]) return x;
              else return v[n-1]; 
           }
        }
    public static void main (String[] args) {
        int size = 5;
        int[] vect = new int[4];
        maxr(vect, size);
        
    }
}
