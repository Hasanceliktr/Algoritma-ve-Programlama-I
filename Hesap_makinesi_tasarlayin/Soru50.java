package algoritma1;

import java.util.Scanner;

/**
 *
 * Java ile hesap makinesi tasarlayın..
 */
public class Soru50 {
    public static void main(String[] args) {
        
        int sayi1,sayi2,islemler;
        Scanner k = new Scanner(System.in);
        System.out.println("***************");
        System.out.println("1 - Toplama");
        System.out.println("2 - Cikarma");
        System.out.println("3 - Carpma");
        System.out.println("4 - Bolme");
        System.out.println("***************");
        System.out.println("İlk sayıyı giriniz.");
        sayi1=k.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        sayi2=k.nextInt();
        System.out.println("Bir işlem seçiniz : ");
        islemler=k.nextInt();
        switch(islemler){
            case 1:
                System.out.println("Toplama işleminin sonucu : "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma işleminin sonucu : "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpma işleminin sonucu : "+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("Bolme işleminin sonucu : "+(sayi1/sayi2));
                break;
            
    }
        
    }
    
}
