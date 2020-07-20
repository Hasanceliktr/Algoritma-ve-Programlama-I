package algoritma1;

import java.util.Scanner;

/*
  Klavyeden girilen stringler üzerinde aşşağıdaki işlem yapılacaktır.Girilen
  stringin ilk harfi q yada Q ise programdan çıkılacaktır. Bu stringler içinde uzunluğu karakter sayısı
  3 olanları ekrana yazan program yazınız
 */
public class Soru9 {
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        String s;
        while(true){
            s=k.next();
            if(s.charAt(0)=='q'||s.charAt(0)=='Q'){
                break;
            }
            else if(s.length()==3){
                System.out.println(s);
        }
        }
        
        
    }
    
}
