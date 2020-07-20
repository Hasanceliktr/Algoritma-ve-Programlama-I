package algoritma1;

import java.util.Scanner;

/*
  0'dan başlayarak klavyeden girilen sayıya kadar ekrana yazan programı yazınız.
 */
public class Soru6 {
    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayi;
        int i=0;
        sayi=k.nextInt();
        while(i<=sayi){
            System.out.println(i);
            i++;
        }
        
    }
    
}
