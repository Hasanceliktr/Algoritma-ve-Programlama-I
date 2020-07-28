package algoritma1;

/**
 *
 * Kendisine parametre olarak gelen taban ve üs değerlerine göre hesaplama yazan kodu yazınız.
 */
public class Soru39 {
    public static void hesapla(int taban,int us){
        int sonuc=1;
        for(int i=1;i<=us;i++){
        sonuc=sonuc*taban;
            
        }
        System.out.println("Sonuc : "+sonuc);
    }
    public static void main(String[] args) {
        hesapla(5,2);
                
    }
    
}
