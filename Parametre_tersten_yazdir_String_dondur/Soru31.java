package algoritma1;

/**
 *
 * Kendisine parametre olarak gelen stringi ters çevirip ana programa geri döndürüp 
 * ekrana yazan programı yazınız (burada geri dönüş değeri olarak string istenmiş void olarak değil)
 */
public class Soru31 {
    
    public static String terstenYaz(String s){
        String dondur="";
        for(int i=s.length()-1;i>=0;i--){
            dondur=dondur+s.charAt(i);
        }
        return dondur;
    }
    
    public static void main(String[] args) {
        
        System.out.println(terstenYaz("nasah"));
        /*
        String s="nasah";
        s=terstenYaz(s);
        System.out.println(s);
        */
    }
    
}
