package algoritma1;

import java.util.Scanner;

/**
 *
 * 1 22 333 4444 5555 klavyeden girilen sayıya kadar bu formatta yazdıran programı yazınız
 */
public class Soru24 {
    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayi;
        System.out.println("Sayıyı giriniz :");
        sayi=k.nextInt();
        for(int i=1;i<=sayi;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print(" ");
            }
        }
        
                
        
        
    }
}
