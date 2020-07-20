package algoritma1;

import java.util.Scanner;

/**
 *
 * Klavyeden rasgele Stringler giriliyor bu stringler içinde quit yada Quit 
 * yazılmışsa programdan çıkılacaktır.Bu stringler içinde bilgisayar kelimesinin kaç defa geçtiğini bulan
 * programı yazınız.
 */
public class Soru12 {
    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayac=0;
        String s;
        while(true){
            s=k.nextLine();
            if("quit".equals(s)||"QUİT".equals(s)) break;
            if("bilgisayar".equals(s)) sayac++;
        }
        System.out.println("Sayaç : "+sayac);
    }
}
