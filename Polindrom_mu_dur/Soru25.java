package algoritma1;

import java.util.Scanner;

/**
 *
 * @Klavyeden girilen sayı polindrommudur ?
 */
public class Soru25 {
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        String s;
        System.out.println("String bir ifade giriniz.");
        s=k.nextLine();
        int bas=0;
        int son=s.length()-1;
        boolean polindrom=true;
        while(bas<son){
            if(s.charAt(bas)!=s.charAt(son)){
                polindrom=false;
                break; 
            }
            bas++;
            son--;
        }
        if(polindrom==true){
            System.out.println("Polindromdur.");
        }else{
            System.out.println("Polindrom Değildir.");
        }
        
        
    }
    
}
