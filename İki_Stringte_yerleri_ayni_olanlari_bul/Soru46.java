package algoritma1;

/**
 *
 * Kendisine parametre olarak gelen iki string içinde yerleri aynı olmak şartıyla eşit 
 * olanları bulup geri döndüren metodu yazınız örnek:str1="Taner" "Tamer" Çıktı : aer
 */
public class Soru46 {
    
    public static String bul(String s1,String s2){
        String temp="";
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    temp=temp+s1.charAt(i);
                }
            }
        }
        return temp;
    }
    
    public static void main(String[] args) {
        String s1="Taner";
        String s2="tamer";
        System.out.println(bul(s1,s2));
    }
    
}
