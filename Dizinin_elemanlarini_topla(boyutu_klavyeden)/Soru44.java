package algoritma1;

import java.util.Scanner;

/**
 *
 * Boyutu dışarıdan girilen bir dizinin elemanlarının değerlerini toplayan kodu yazınız
 */
public class Soru44 {
    public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    int toplam=0;
    int ekle;
    System.out.println("Dizinin boyutunu giriniz.");
        int boyut=k.nextInt();
    int dizi[]=new int[boyut];
        for(int i=0;i<boyut;i++){
            System.out.println(i+".İndisine yerleştirilecek değeri giriniz.");
            dizi[i]=ekle=k.nextInt();
            toplam=toplam+dizi[i];
        }
        System.out.println("Dizinin toplamı : "+toplam);
    
    
    }
    
    
    
    
}
