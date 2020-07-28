package algoritma1;

/**
 * 20 Elemanlı bir dizi oluşturulacaktır . Bu dizideki en büyük ve en küçük
 * elemanları bulan java programını yazınız.
 * 
 */
public class Soru35 {
    
    public static void main(String[] args) {
        
        int [] dizi ={4,2,7,9,8,5,74,10,45,21,36,85,63,45,19,98,17,18,68,29};
        int enk=dizi[0];
        int enb=dizi[0];
        for(int i=0;i<dizi.length-1;i++){
            if(dizi[i]>enb){
                enb=dizi[i];
            }
            if(dizi[i]<enk){
                enk=dizi[i];
            }
        }
        System.out.println("Enb : "+enb+" "+"Enk : "+enk);
        
    }
    
}
