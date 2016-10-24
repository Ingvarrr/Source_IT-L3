/**
 * Created by vig on 10/23/16.
 */
public class Numb{
    private double n;
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;
    public void Sum() {
        double numb = n * 100;
        numb = Math.round(numb); // даже и не спрашивайте.... один из результатов был неверен и я таким образом его задебажил
        n1 = (int) numb % 10;
        numb = (int) numb / 10;
        n2 = (int) numb % 10;
        numb = (int) numb / 10;
        n3 = (int) numb % 10;
        numb = (int) numb / 10;
        n4 = (int) numb % 10;
        numb = (int) numb / 10;
        n5 = (int) numb % 10;
        int sum = n1 + n2 + n3 + n4 + n5;
        System.out.println("Сумма всех чисел: " + sum);
    }

    public void Max(){
        if (n1>n2){
            if (n1>n3){
                if (n1>n4){
                    if (n1>n5){
                        System.out.println("Наибольшая цифра в вашем числе: " + n1);
                    }
                }
            }

        }if (n2>n3){
                if (n2>n4){
                    if (n2>n5){
                        System.out.println("Наибольшая цифра в вашем числе: " + n2);
                    }
                }

        }if (n3>n4){
            if (n3>n5){
                System.out.println("Наибольшая цифра в вашем числе: " + n3);
            }
        }if (n4>n5){
            System.out.println("Наибольшая цифра в вашем числе: " + n4);
        }else{
            System.out.println("Наибольшая цифра в вашем числе: " + n5);
        }
    }

    public void Min() {
        if (n5 < n4 && n5 < n3 && n5 < n2 && n5 < n1){
            System.out.println("Наименьшая цифра в вашем числе: " + n5);
        if (n4 < n3 && n4 < n2 && n4 < n1 && n4 < n5)
            System.out.println("Наименьшая цифра в вашем числе: " + n4);
        if (n3 < n2 && n3 < n1 && n3 < n4 && n3 < n5)
            System.out.println("Наименьшая цифра в вашем числе: " + n3);
        if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5)
            System.out.println("Наименьшая цифра в вашем числе: " + n2);
        }else{
            System.out.println("Наименьшая цифра в вашем числе: " + n1);
        }
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }
}

