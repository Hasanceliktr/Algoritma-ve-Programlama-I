package algoritma1;

import java.util.Scanner;

/*
  Klavyedden girilen sayıya kadar olan tam sayıları sıfırdan başlamak şartıyla
  ekrana yazan, toplayan, ortalamasını bulan
 */
public class Soru7 {
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        int sayi;
        double ortalama;
        int i =0;
        int toplam=0;
        sayi=k.nextInt();
        while(i<=sayi){
            System.out.println(i);
            toplam=toplam+i;
            i++;
        }
        System.out.println("Toplamları : "+toplam);
        ortalama=toplam/sayi;
        System.out.println("Ortalama : "+ortalama);
        
        
        
        
        
    }
}
