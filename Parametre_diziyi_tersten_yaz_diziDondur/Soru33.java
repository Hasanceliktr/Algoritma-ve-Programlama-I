package algoritma1;

/**
 *
 * Kendisine parametre olarak gelen diziyi ters çevirip return eden programı yazınız
 */
public class Soru33 {
    
    public static int[] terstenYaz(int[]dizi){
        int i,j;
        int[] dizi2 =new int[dizi.length];
        for(i=dizi.length-1;i>=0;i--){
            for(j=0;j>dizi2.length;j++){
               dizi2[j]=dizi[i]; 
            }
            
        }
        return dizi2;
    }
    
    public static void main(String[] args) {
        
        int [] dizi ={1,2,3,4,5,6};
        int [] dizi2=new int[5];
        dizi2=terstenYaz(dizi);
        for(int i=0;i<dizi.length-1;i++){
            System.out.println(dizi[i]);
        }
    }
    
}
