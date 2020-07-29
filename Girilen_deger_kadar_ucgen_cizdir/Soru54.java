package algoritma1;

import java.util.Scanner;

/**
 *
 * Konsoldan kullanıcının girdiği integer değer kadar alt alta yıldız üçgen yapan java algoritma kodunu yazınız ?
 */
public class Soru54 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Kaç yıldız alt alta gelsin : ?");
        int sayac=k.nextInt();
        for(int i=0;i<=sayac;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
