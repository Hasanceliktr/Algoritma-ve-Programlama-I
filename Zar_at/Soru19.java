package algoritma1;

import java.util.Scanner;

/**
 *
 * Rastgele zar atan program örneğini yapınız.
 */
public class Soru19 {
    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayi,kackere,zar;
        System.out.println("Kaç kere zar atıyoruz ?");
        kackere=k.nextInt();
        for(int i=0;i<kackere;i++){
            zar=(int)(Math.random()*6+1);
            System.out.println("Zar : "+zar);
        }
        
    }
    
}
