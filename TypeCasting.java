import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.out.println(num);


        // Type Casting
        int num =(int)(67.56f);
        System.out.println(num);

        // automaitic rype promotion in expression
        int a =257;
        byte b =(byte)(a); // 257 modulo 256 = 1
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e= 100;
        int s = (c  * d) / e;
        System.out.println(s);

        int number = 'A';
        System.out.println(number);

        byte y = 42;
        char z ='a';
        short l = 1024;
        int i = 50000;
        float f = 5.67f;
        double t = 0.1234;
        double result =  (f * y)+ (i / z) - (t * l);
        // float + int - double = double
        System.out.println( (f * y) + " " + (i / z) + " " + - (t * l));
        System.out.println(result);
    }
}
