package algoritma1;

/**
 *
 * Kendisine parametre olarak gelen 3 tam sayının ortalamasını yazdıran java
 * kodu
 */
public class Soru29 {

    public static double ortalamaBul(int sayi1, int sayi2, int sayi3) {
        double ortalama = 0;
        ortalama = (sayi1 + sayi2 + sayi3) / 3;
        return ortalama;
    }

    public static void main(String[] args) {
        System.out.println("Ortalama : " + ortalamaBul(3, 5, 9));

    }
}
