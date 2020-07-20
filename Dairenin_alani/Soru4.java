
package algoritma1;

import java.util.Scanner;


public class Soru4 {
    /*
    Klavyeden girilen sayıyı dairenin yarıçapı kabul edip dairenin alanını hesaplayan java programını yazınız.
    */
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        int yariCap;
        double alan;
        double pi=3.14;
        yariCap=k.nextInt();
        alan=pi*(yariCap*yariCap);
        System.out.println("Alan : "+alan);
        
        
    }
}
