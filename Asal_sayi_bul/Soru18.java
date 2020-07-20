package algoritma1;

import java.util.Scanner;

/**
 *
 * Girilen sayının asal olup olmadığını bulan program
 */
public class Soru18 {
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        int sayi,bolen=2,sayac=0;
        System.out.println("Bir sayı giriniz");
        sayi=k.nextInt();
        for(int i=1;i<=sayi;i++){
            if(sayi%i==0) sayac++;
            }
            if(sayac==2){
                System.out.println("Asal");
            }else{
                System.out.println("Asal Değil");
            }
            
        
        
    }
}
