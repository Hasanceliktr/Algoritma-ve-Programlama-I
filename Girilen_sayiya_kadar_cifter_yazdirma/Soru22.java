package algoritma1;

import java.util.Scanner;

/**
 *
 * 0'dan büyük tam sayıya kadar olan çift sayıları ekrana yazan java programı
 */
public class Soru22 {
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        int sayi;
        System.out.println("Sayıyı giriniz : ");
        sayi=k.nextInt();
        for(int i=0;i<=sayi;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }        
        
        
    }
    
}
