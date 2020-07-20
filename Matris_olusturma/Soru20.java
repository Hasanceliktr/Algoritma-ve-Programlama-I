package algoritma1;

/**
 *  5*5 boyutunda bir matris tanımlayıp ana köşegen üstündeki elemanlara
 *  2 köşegen altındaki elemanlara 0 değerini yazınız.
 *  
 * 
 */
public class Soru20 {
    
    public static void main(String[] args) {
        
        int [][] matris=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==j){
                    matris[i][j]=1;
                }
                if(i>j){
                    matris[i][j]=2;
                    System.out.println(matris[i][j]+" ");        
                }
            }
        }
        
    }
    
}
