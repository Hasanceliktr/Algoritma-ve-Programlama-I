package algoritma1;

import java.util.Scanner;

/**
 *
 * Ortalamaların girilmesini isteyen bu program öğrencilerin aldığı nota göre sınıfı
 * geçtiklerine kaldıklarına veya şeref listesine girdiklerine karar veriyor.
 */
public class Soru14 {
    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double ortalama;
        System.out.println("Ortalamanızı giriniz : ");
        ortalama=k.nextDouble();
        if(ortalama>4.0) System.out.println("Hatalı Ortalama");
        if(ortalama<=2.0) System.out.println("Sınıfta Kaldınız");
        if(ortalama>2.0&&ortalama<3.0) System.out.println("Sınıfı Geçtiniz");
        if(ortalama>=3.0&&ortalama<=4.0) System.out.println("Sınıfı Geçtiniz ve Şeref Listesine Alındınız.");
    }
    
}
