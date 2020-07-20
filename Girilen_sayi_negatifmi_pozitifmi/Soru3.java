
package algoritma1;

import java.util.Scanner;


public class Soru3 {
    
    /*
    Klavyeden girilen sayı pozitif mi negatif mi bulup ekrana yazan java programını yazınız.
    */
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        int sayi;
        sayi=k.nextInt();
        if(sayi<0){
            System.out.println("Sayı Negatiftir.");
        }
        else
            System.out.println("Sayı Pozitiftir.");
        
    }
}
