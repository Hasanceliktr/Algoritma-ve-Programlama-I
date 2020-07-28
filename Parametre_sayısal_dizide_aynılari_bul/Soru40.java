package algoritma1;

/**
 *
 * Kendisine parametre olarak gelen 1 boyutlu 2 sayısal dizi içindeki yerleri aynı olmak şartıyla eşit olan elemanları
 * üzerinde aşağıdaki işlemler yapılacak
 * a) bu elemanların kaç adet olduğunu bulup geri döndüren
 * b) eşit olan elemanların kendilerini geri döndüren
 * Not: her iki sayısal dizide 20 elemanlıdır
 */
public class Soru40 {
    public static int[] yerBul(int a[],int b[]){
        int k=0;
        int c[]= new int[5];
        for(int i=0;i<5;i++){
            if(a[i]==b[i]){
                c[k]=a[i];
                k++;
                
            }
        }
        return c;
    }
    
    public static int bul(int a[],int b[]){
        int sayac=0;
        for(int i=0;i<5;i++){
            if(a[i]==b[i]){
                sayac++;
            }
        }
        return sayac;
    }
    public static void main(String[] args) {
        int a[]={1,5,7,8,7};
        int b[]={2,5,9,6,7};
        int sonuc=bul(a,b);
        int[] sonuc2=yerBul(a,b);
        System.out.println("aynı olanın kendisi : "+sonuc2[1]);
        System.out.println(sonuc);
    }
}
