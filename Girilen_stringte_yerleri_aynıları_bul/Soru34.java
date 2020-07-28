package algoritma1;

import java.util.Scanner;

/**
 *
 * Klavyeden girilen iki string içerisinde yerleri aynı olmak şartıyla 
 * ortak karakterleri bulup ekrana yazan programı yazınız Not: String eleman sayıları belli değildir.
 */
public class Soru34 {
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        System.out.println("İlk stringi giriniz.");
        String s1=k.nextLine();
        System.out.println("İkinci stringi giriniz.");
        String s2=k.nextLine();
        
        for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)==s2.charAt(i)){
                    System.out.println("Ortak karakter :"+s1.charAt(i));
                }
            
        }
        
        
    }
    
}
