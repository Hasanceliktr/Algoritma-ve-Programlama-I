package algoritma1;

/**
 *
 * Kendisine parametre olarak gelen 2 boyutlu string dizisi içerisindeki karakter
 * sayısı 4 olanları geri döndüren metod
 */
public class Soru48 {
    public static int bul(String s[][]){
        int sayac=0;
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length;j++){
                if(s[i][j].length()==4){
                    sayac++;
                }
            }
        }
        return sayac;
    }
    public static void main(String[] args) {
        String isimler[][]={{"anne","bajba"},{"abcd","efgh"}};
        System.out.println(bul(isimler));
    }
    
}
