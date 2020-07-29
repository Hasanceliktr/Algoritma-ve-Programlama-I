package algoritma1;

import java.util.Scanner;

/**
 * Konsoldan girilen sayıyı 1 e kadar yazdırıp,aynı satırda tekrardan verilen
 * sayıya kadar yazdıran ve alt alt 1’er azaltıp aynı işlemi üçgen gibi devam ettiren
 * java algoritma kodunu yazınız.
 */
public class Soru55 {
    public static void main(String[] args) {
         System.out.println("Sayı giriniz? ");
        Scanner k = new Scanner(System.in);
        int sira = k.nextInt();
 
        for (int i = sira; i>=1; i--)
        {
            for (int j=i; j>=1; j--)
            {
                System.out.print(j+" ");
            }
            for (int b=2; b<=i; b++)
            {
                System.out.print(b+" ");
            }
            System.out.println("");
        }
    }
    }

