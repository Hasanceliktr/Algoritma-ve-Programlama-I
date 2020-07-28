package algoritma1;

import java.util.Scanner;

/**
 *
 * Kullanıcıdan alınan 5 sayıyı diziye atan son aldığı sayıyıda ekrana bastıran java
 * programını yazınız
 */
public class Soru42 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int dizi[]=new int[5];
        int sayi = 0;
        for(int i=0;i<5;i++){
            System.out.println(i+".Sayıyı giriniz.");
            sayi=k.nextInt();
            dizi[i]=sayi;
            
        }
        for(int j=0;j<dizi.length-1;j++){
            System.out.println("İndis değeri : "+j+" İçerik : "+dizi[j]);
        }
        System.out.println("Son alınan değer : "+sayi);
        
    }
}
