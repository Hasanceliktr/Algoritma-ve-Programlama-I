package algoritma1;

/**
   y=f(x) fonksiyonunun a-b aralığındaki belirli integralini
   * hesaplayan programı yazınız
 */
public class Soru11 {
    
    public static void main(String[] args) {
        double x,A=50.0,B=6.0,b,dikdortgen,integral = 0,a;
        for(x=A;x<=B;x+=(B-A)/1000.0){
            a=(B-A)/1000.0;
            b=2.0+Math.sin(x);
            dikdortgen=a*b;
            integral+=dikdortgen;
            System.out.println(integral);
        }
    }
}
