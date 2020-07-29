package algoritma1;

/**
 * 2 boyutlu diziyi tek boyutlu diziye dönüştürme
 * 
 */
public class Soru56 {
       public static void main(String[] args) {
        int[][] matrix = {{1,5,6,5},{8,7,9,3}};

        

        int newArray[] = new int[matrix.length*matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for(int j = 0; j < row.length; j++) {
                int number = matrix[i][j];
                newArray[i*row.length+j] = number;
            }
        }
        for(int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

}