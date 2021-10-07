package Java.DataTypes;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args){
        BigInteger bigInteger = new BigInteger("123");
        BigInteger bigInteger1 = BigInteger.ONE;
        BigInteger bigInteger2 = BigInteger.valueOf(123);
        Boolean isPrime = bigInteger.isProbablePrime(1);
    }
}
