package algoritma1;

import java.util.Scanner;

/*  
    Klavyeden girilen sayılar üzerinde aşağıdaki işlemler uygulanacaktır.
    Girilen sayı -999 ise program sonlandırılacaktır.
girilen sayıları ekrana yazan toplamınıda ekrana yazan programı yazınız.
 */
public class Soru8 {
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        int toplam=0;
        int sayi;
        for(;;){
        sayi=k.nextInt();
        if(sayi==-999){
            System.out.println(sayi);
            break;
        }
        else{
        toplam=toplam+sayi;
            System.out.println("Toplam: "+toplam);
            
        }
        }
    }
    
}
