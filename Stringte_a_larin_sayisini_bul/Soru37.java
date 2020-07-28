package algoritma1;

import java.util.Scanner;

/**
 * Parametre olarak gelen string içinde 'a'ların sayısını ekrana yazan metodu oluşturunuz.
 * 
 */
public class Soru37 {
    
    public static void bul(String s){
        int sayac=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='a'){
                sayac++;
            }
        }
        System.out.println("Girilen Stringteki a sayısı : "+sayac);
    }
    
    public static void main(String[] args) {
        bul("Hasan");
        
        
        
        
    }
    
}
