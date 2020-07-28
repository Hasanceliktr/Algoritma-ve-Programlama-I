package algoritma1;

import java.util.Scanner;

/**
 * Klavyeden girilen bir tamsayının sonunda kaçtane sıfır olduğunu bulan java 
 * programı yazınız. Örneğin 1050 Sayısı girildiğinde 1 tane sıfır var yazmalıdır
 * 
 */
public class Soru36 {
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        int sayac=0;
        System.out.println("Lütfen bir sayı giriniz");
        String sayi=k.nextLine();
        for(int i=sayi.length()-1;i>=0;i--){
            if(sayi.charAt(i)=='0'){
                sayac++;
            }else{
                break;
            }
        }
        System.out.println("Sayının sonunda : "+sayac+": tane var 0 vardır "); 
        
        
        
    }
    
}
