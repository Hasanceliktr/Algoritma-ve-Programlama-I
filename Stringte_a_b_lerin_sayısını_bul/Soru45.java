package algoritma1;

/**
 *
 * Kendisine parametre olarak gelen string içinde küçük a'ların ve b lerin 
 * sayısını geri döndüren metodu yazınız.
 */
public class Soru45 {
    public static int[] bul(String s){
        int sayaca=0;
        int sayacb=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                sayaca++;
            }
            else if(s.charAt(i)=='b'){
                sayacb++;
            }
        }
        int dizi[]={sayaca,sayacb};
        return dizi;
    }
    public static void main(String[] args) {
        int dizi[]=bul("aaaabbbbbbabbbbb");
        for(int i=0;i<dizi.length;i++){
            System.out.println(dizi[i]);
        }
    }
    
}
