package algoritma1;

/**
 *
 * 0 ile 1000 arasında random bir sayı oluşturarak bu sayının rakamları toplamını veren java algoritma kodunu yazınız ?
 */
public class Soru53 {
    public static void main(String[] args) {
        int randomSayi = (int)(Math.random()*(1000)); //0 ile 1000 arasında sayı
        System.out.println("Random Sayı " + randomSayi); //üretilen sayıyı konsola bastırdık
 
        int birler = randomSayi %10; //10 a bölümünden kalan 0 birler basamağı bulundu
 
        randomSayi = randomSayi /10; // sayı 10 a bölündü 
        int onlar = randomSayi %10;   //ona bölünmüş halinden kalan değer onlar basamağı
        
        int yuzler = randomSayi /10;  //tekrar ona bölündü ve yüzler basamağı bulundu
 
        System.out.println("Toplamları ="+(birler+onlar+yuzler));
    }
}
