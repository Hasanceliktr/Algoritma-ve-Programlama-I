package algoritma1;

import java.util.Scanner;

/**
 *
 * Kullanıcıya yılın hangi ayı olduğunu belirten rakamı girince ay değerini yazdıran kodu yazınız
 */
public class Soru43 {
    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String aylar[]={"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
        int girilenAy;
        System.out.println("Bir tam sayı giriniz. ( 1 - 12 )");
        girilenAy=k.nextInt();
        if(girilenAy>0&&girilenAy<12){
        System.out.println("Girdiğiniz sayının ay olarak karşılığı: "+aylar[girilenAy-1]);
        }
        
    }
    
}
