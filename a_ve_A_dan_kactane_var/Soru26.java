package algoritma1;

import java.util.Scanner;

/**
 * Klavyeden girilen stringte kaçtane küçük a ve büyük A karakteri vardır
 * 
 */
public class Soru26 {
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        String s;
        s=k.nextLine();
        int sayac=0;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='A'){
                sayac++;
            }
        }
        System.out.println("Klavyeden girilen Stringteki a ve A sayısı : "+sayac);
                
        
    }
    
}
