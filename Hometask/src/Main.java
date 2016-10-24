/**
 * Created by vig on 10/10/16.
 */

public class Main {
    public static void main(String[] args) {
        Numb number1 = new Numb();
        number1.setN(196.45);
        System.out.println("Введенное вами число: " + number1.getN());
        number1.Sum();
        number1.Max();
        number1.Min();


        /*int n = 456;
        int i1 = n / 100;
        n -= i1 * 100;  //n = n - i1 * 100
        int i2 = n / 10;
        int i3 = n % 10;

        // -= += *= /=

        System.out.println(i1+i2+i3);*/
    }
}
