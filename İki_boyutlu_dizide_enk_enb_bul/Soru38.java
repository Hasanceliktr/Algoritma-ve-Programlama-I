package algoritma1;

/**
 *
 * Parametre olarak gelen iki boyutlu dizide enk ve enb değerlerini bulup geri dönderen metod 
 */
public class Soru38 {

    public static int[] bul(int x[][]){
        int enb=x[0][0],enk=x[0][0];
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(enb<x[i][j]){
                    enb=x[i][j];
                    if(enk>x[i][j]){
                        enk=x[i][j];
                    }
                }
            }
        }
        int a[]={enb,enk};
        return a;
    }
    
    public static void main(String[] args) {
       
        int a[][]={{4,8,5},{8,9,1}};
        int b[]=new int[2];
        b=bul(a);
        System.out.println(b[0]+" "+b[1]);
    }
    
}
