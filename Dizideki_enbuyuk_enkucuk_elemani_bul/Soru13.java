
package algoritma1;

import java.util.Scanner;

/**
 *
 * Klavyeden 50 adet tam sayı okuyup bunlarıbir diziye atan daha sonra
 * bu dizinin en küçük en büyük elemanlarını ve tüm elemanlarının ortalamasını
 * bulan ve ekrana yazdıran bir program yazınız.
 */
public class Soru13 {
    
    public static void main(String[] args) {
       Scanner k = new Scanner(System.in);
       int dizi[]=new int[5];
       int enb=dizi[0];
       int enk=Integer.MAX_VALUE;
       double ortalama=0;
       int toplam=0;
       int sayac=0;
       while(sayac<dizi.length){
           dizi[sayac]=k.nextInt();
           toplam=toplam+dizi[sayac];
           if(enk>=dizi[sayac]){
               enk=dizi[sayac];     
           }
           if(enb<=dizi[sayac]){
               enb=dizi[sayac];    
           }
           
           sayac++;
           
       }
       ortalama=toplam/dizi.length;
        System.out.println("Toplam : "+toplam);
        System.out.println("Ortalama : "+ortalama);
        System.out.println("En Büyük Eleman : "+enb);
        System.out.println("En Küçük Eleman : "+enk);
       
    }
    
}
