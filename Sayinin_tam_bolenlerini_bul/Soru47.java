package algoritma1;

/**
 *
 * Kendisine parametre olarak gelen pozitif tam sayının tam bölenlerinin tamamını bulup geri
 * döndüren metodu yazınız.
 */
public class Soru47 {
    public static int bolenBul(int sayi){
        int sayac=0;
        for(int i=1;i<=sayi;i++){
            if(sayi%i==0){
                System.out.println(i+" ");
                sayac+=1;
            }
        }
        System.out.println("Toplam bölen sayısı ");
        return sayac;
    }
    public static void main(String[] args) {
        int sayi=15;
        System.out.println(bolenBul(sayi));
    }
    
}
