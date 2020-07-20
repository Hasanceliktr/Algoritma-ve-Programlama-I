package algoritma1;

import java.util.Scanner;

/**
 *
 * While döngüsü kullanılarak ortalama sıcaklık listesinin okunması
 */
public class Soru16 {
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        int kacGun=0,toplam=0;
        double ortalama,derece;
        System.out.println("Gün ortalama sıcaklığını giriniz : ");
        derece=k.nextDouble();
        while(derece!=-1){
            kacGun++;
            toplam+=derece;
            System.out.println("Gün ortalama sıcaklığını giriniz");
            derece=k.nextInt();
            if(kacGun!=0){
                ortalama=(double)toplam/kacGun;
                System.out.println(""+ortalama);
            }else{
                System.out.println("Gecersiz gün sayısı");
            }
        }
        
        
    }
    
}
