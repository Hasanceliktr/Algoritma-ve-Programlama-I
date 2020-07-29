package algoritma1;

/**
 *
 * Verilen dizideki eksik elemanı bulduran kodu yazınız. örnek[]={7,5,6,1,4,2}; eksik eleman 3 olduğunu bulun
 */
public class Soru51 {
    
    public static int eksikSayiBul(int[] dizi){
        int n=dizi.length+1; // dizi indeksi 0 dan başladığı için tam boyut için +1
        int toplam = n*(n+1)/2; //ardışık sayıların toplam formülü
        int sayiToplami=0;
        for(int i=0;i<dizi.length;i++){
            sayiToplami+=dizi[i];
        }
        int eksikSayi=toplam-sayiToplami;
        return eksikSayi;
    }
    
    public static void main(String[] args) {
        int [] dizi ={7,5,6,1,4,2};
        System.out.println("Kayıp olan sayı : "+eksikSayiBul(dizi));
    }
    
}
