package algoritma1;

import java.util.Scanner;

/**
 *
 * Switch kullanarak çarpma bölme toplama ve çıkarma yapan program
 */
public class Soru15 {
    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int secim;
        double x,y,toplam,fark,carpim,bolum;
        secim=k.nextInt();
        switch(secim){
            case 1:
                System.out.println("Toplama işlemi : ");
                x=k.nextInt();
                y=k.nextInt();
                toplam=x+y;
                System.out.println("Toplam : "+toplam);
            case 2:
                System.out.println("Çıkarma işlemi için : ");
                x=k.nextInt();
                y=k.nextInt();
                fark=x-y;
                System.out.println("Fark : "+fark);
            case 3:
                System.out.println("Çarpma işlemi için");
                x=k.nextInt();
                y=k.nextInt();
                carpim=x*y;
                System.out.println("Çarpım : "+carpim);
            case 4:
                System.out.println("Bölme işlemi için");
                x=k.nextInt();
                y=k.nextInt();
                bolum=x/y;
                System.out.println("Bölüm : "+bolum);
                break;
                default:
                    System.out.println("Çıkış ... ");
                    break;
        }        
        
        
    }
}
