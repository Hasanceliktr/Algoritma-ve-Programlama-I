
package algoritma1;

import java.util.Scanner;


public class Soru2 {
    
    /*
    Klavyeden girilen 2 tam sayının toplamını farkını çarpımını bölümünü ve kalanını hesaplayan
    java programını yazınız.
    */
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayi1,sayi2,topla,carp,cikar,kalan;
        double bol;
        sayi1=k.nextInt();
        sayi2=k.nextInt();
        topla=sayi1+sayi2;
        cikar=sayi1-sayi2;
        carp=sayi1*sayi2;
        kalan=sayi1%sayi2;
        bol=sayi1/sayi2;
        System.out.println("Toplam : "+topla+" "+"Çarpım : "+" "+carp+" "+"Çıkarma : "+" "+cikar+" "+"Kalan : "+kalan+" "+"Bölüm : "+bol);
        
        
    }
}
