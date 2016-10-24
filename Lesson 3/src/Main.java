import java.math.BigDecimal;

/**
 * Created by vig on 10/7/16.
 */
public class Main {

    //public/protected/[default]/private
    //modificator type name [= value];
//    public String name;
    public static void main(String[] args) {
        /*String name = "Basya";
        int name2 = 50
        // type name [= value];

        Car car = new Car();
        car.marka = "Volvo";
        System.out.println(car.marka);*/
        Car volvo = new Car();
        byte b = 3;
        short s = 6;
        int i = 8;
        long l = 9;

        float f;
        double d;

        b= (byte) s; //операция приведения типа если значение к чему приводят меньше (усечение)
        s = b // работает без указания типа в скобках,автоматическое приведение к старшему типу (расширение)
        // s = (short) (b * 3); принудительное усечение до short
        f = i;
        i = f; //флоат в инт не преобразуется
        d = l;
        l = d;//дабл в лонг не преобразуется

        char c = 45;
        char cl = 'a'; // LITERAL (конкретное значение)
//        System.out.println(9.0/5); правильное деление для получения дробного числа
//        System.out.println(i/(double)s); //правильное деление для получения дробного числа при делении переменных
        System.out.printf("%1$f", i/(double)s); //форматированный вывод данных
        System.out.printf(9%5); //получение остатка от деления 4.8000000001
        //Гарантировать точность вычисления с помощью BigDecimal (вместо double) или BigInteger (вместо int)
        BigDecimal b1 = new BigDecimal(9.8);
        BigDecimal b2 = new BigDecimal(5.8);
        b1.divide(b2, 3);
        System.out.println(b1.divide(b2, 3).doubleValue());
        int i = 5;
        Integer il = 10; //new Integer(10); - АВТОУПАКОВКА
        i = il; //il.intValue();
        //i = Integer.parseInt("2gdfg5"); бросает ошибку
        i = Integer.valueOf("12", 6); //=8, 6 - система исчисления
        System.out.println(i);
    }
}
