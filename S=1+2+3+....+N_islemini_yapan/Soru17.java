package algoritma1;

import java.util.Scanner;

/**
 *
 * S=1+2+3+....+N toplamını hesaplayan bir program hazırlayınız N>=1 olmalı ve
 * kullanıcı tarafından girilmeli.
 */
public class Soru17 {
    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayi,i=0;
        int toplam = 0;
        System.out.println("Sayı giriniz.");
        sayi=k.nextInt();
        while(i<=sayi){
            toplam=toplam+i;
        i++;       
        }
        System.out.println("Girilen sayıların toplamı: "+toplam); 
    }
    
}
