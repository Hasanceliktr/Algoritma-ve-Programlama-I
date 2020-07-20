package algoritma1;

import java.util.Scanner;

/*
  Klavyeden girilen stringler içinde son karakteri z olanları ekrana yazdıran programı yazınız
  toplam 10 tane string girilecektir.
 */
public class Soru10 {
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        String s;
        int i=0;
        while(i<10){
            s=k.next();
            i++;
            if(s.charAt(s.length()-1)=='z'){
                System.out.println(s);
                
            }
        }
    }
    
}
