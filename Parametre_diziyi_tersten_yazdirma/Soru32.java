package algoritma1;

/**
 *
 * Kendisine parametre olarak gelen 5 elemanlı diziyi tersten ekrana yazan
 * metodu ve ana programı yazınız.
 */
public class Soru32 {
    
    public static void terstenYaz(int[]dizi){
        for(int i=dizi.length-1;i>=0;i--){
            System.out.println(dizi[i]);
        }
    }
    
    public static void main(String[] args) {
        int[]dizi={1,2,3,4,5};
        terstenYaz(dizi);
    }
    
}
