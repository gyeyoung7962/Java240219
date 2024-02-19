package c02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {

        int x= 3;
        int y= 5;
        System.out.println("x = "+x + " y = "+ y);

        int temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x = "+x + " y = "+ y);

        int a = 100;
        int b = 200;

        int temp1;

        temp1 = a;
        a = b;
        b = temp1;

        System.out.println("a = "+ a + " b = "+ b);



    }
}
