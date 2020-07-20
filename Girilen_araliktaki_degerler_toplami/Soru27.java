package algoritma1;

/**
 * --Javada Metodlar--
 *  Sırasıyla 1'den 10 10'dan 20 ye 35'ten 45'e kadarki sayıların toplamını bulmak
 * 
 */
public class Soru27 {
    
    public static int toplam(int sayi1,int sayi2){
        int toplam=0;
        for(int i=sayi1;i<sayi2;i++){
            toplam+=i;
        }
        return toplam;
    }
    
    public static void main(String[] args) {
        
        System.out.println("1 - 10 aralığı toplamı :"+toplam(1,10));
        System.out.println("20 - 30 aralığı toplamı :"+toplam(20,30));
        System.out.println("35 - 45 aralığı toplamı :"+toplam(35,45));
        
        
    }
}
