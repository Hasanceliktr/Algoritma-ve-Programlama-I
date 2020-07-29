package algoritma1;

import java.util.Scanner;

/**
 *
 * Oluşturulan şifre Stringi ile kullanıcıdan alınan şifre değeri birbirine eşitse şifre doğru
 * eğer yanlış değer girerse şifre yanlış yazdıran programı yazınız.
 */
public class Soru49 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String sifre="12345";
        System.out.println("Bir şifre giriniz:");
        String girilenSifre=k.nextLine();
        if(girilenSifre.equals(sifre)){
            System.out.println("Girilen şifre doğrudur.");
        }
        else{
            System.out.println("Şifre yanlış Tekrar Deneyin.");
        }
    }
}
