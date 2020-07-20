
package algoritma1;

import java.util.Scanner;


public class Soru1 {
    //Soru 1 = Klavyeden girilen iki tam sayıyı ve 1 double sayının ortalamasını hesaplayan java programını yazınız.
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int ilkSayi,ikinciSayi;
        double ucuncuSayi,ortalama;
        ilkSayi=k.nextInt();
        ikinciSayi=k.nextInt();
        ucuncuSayi=k.nextDouble();
        ortalama = (ilkSayi+ikinciSayi+ucuncuSayi)/3;
        System.out.println("Ortalama : "+ortalama);
        
    }
}
