package Java.DataTypes;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double a=0.03;
        double b=0.04;
        double c=b-a;
        // Float will give un precise results
        // 0.010000000000000002
        System.out.println(c);

        BigDecimal A = BigDecimal.valueOf(0.03);
        BigDecimal B = BigDecimal.valueOf(0.04);
        BigDecimal C = B.subtract(A);
        // Precise results - 0.01
        System.out.println(C);

        float f = 0.1f;
        float sum;
        sum = 0;

        for (int i = 0; i < 10; ++i)
            sum += f;
        // 1.0000001
        System.out.println(sum);

        float f1 = 2.15f;
        float f2 =1.11f;
        // actual f1-f2 1.0400001
        // expected f1-f2 : 1.04
        System.out.println(1.04==(f1-f2)); // false

        // actual 2.7755575615628914E-17
        // expected 0
        System.out.println(0.1 + 0.1 + 0.1 - 0.1 - 0.1 - 0.1);


        // Float - 32 bits - Single Precision
        // Double - 64 bits - Double Precision
        // +-M*B power(e)
        // Mantissa Base Exponent
        // Single Precision Format Sign-1bit Exponent-8bit Mantis-23bits
        // Double Precision Format Sign-1bit Exponent-11bit Mantis-52bits

        // Number: 9 * 10 p(8)     M-9 B-10 E-8
        // Number: 4343.434        M-4343.434 B-10 E-(-3)
    }

}



