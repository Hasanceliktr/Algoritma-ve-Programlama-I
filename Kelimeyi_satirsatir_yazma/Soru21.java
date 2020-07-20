package algoritma1;

/**
 *
 * Klavyeden girilecek herhangi bir kelimeyi aşağıdaki
 * gibi ekrana yazdıran bir programı yazın.
 * B Bi Bilg Bilg Bilgi
 */
public class Soru21 {
    
    public static void main(String[] args) {
        
        String s = "Bilgi";
        for(int i=0;i<s.length();i++){
            System.out.println(" ");
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
        }
        
    }
    
}
