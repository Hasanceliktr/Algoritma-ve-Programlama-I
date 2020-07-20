package algoritma1;

/**
 *
 * Kendisine parametre olarak gelen stringi tersten ekrana yazan
 * metodu ve ana programı yazınız.
 */
public class Soru30 {
    
    public static void terstenYaz(String s){
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
    
    public static void main(String[] args) {
        
        terstenYaz("nasah");
        
        
    }
    
}
