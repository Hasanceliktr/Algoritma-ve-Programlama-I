package algoritma1;

/**
 *
 * Bir dizi içerisindeki en büyük 2. sayıyı bulan java kodunu yazınız
 */
public class Soru52 {
    public static void main(String[] args) {
        int dizi[]={4,7,9,5,6,8,10};
        int enb=dizi[0];
        int ikinciEnb=dizi[0];
        for(int i=0;i<dizi.length;i++){
            if(dizi[i]>enb){
                ikinciEnb=enb;
                enb=dizi[i];
            }
            else if(dizi[i]>ikinciEnb){
                ikinciEnb = dizi[i];
            }
        }
        System.out.println("En büyük ikinci sayı : "+ikinciEnb);
    }
    
}
