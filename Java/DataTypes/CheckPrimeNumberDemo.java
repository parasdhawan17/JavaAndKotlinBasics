package Java.DataTypes;

import java.math.BigInteger;

public class CheckPrimeNumberDemo {
    public static void main(String[] args){
        System.out.println(checkPrimeWithBigInteger(13));
        System.out.println(checkPrimeWithloop(13));
        System.out.println(checkPrimeWithSqart(13));
    }

    // Simple Big Integer method
    public static boolean checkPrimeWithBigInteger(int a){
        BigInteger bigInteger = BigInteger.valueOf(a);
        return bigInteger.isProbablePrime(1);
    }

    // Basic loop method
    // Complexity O(n)
    public static boolean checkPrimeWithloop(int a){

        if(a<=1) return false;

        for(int i =2;i<a;i++){
            if(a%i == 0) return false;
        }
        return true;
    }

    // Squareroot method
    public static  boolean checkPrimeWithSqart(int a){
        if(a<2) return false;
        else if(a==2) return true;
        else if (a%2==0) return false;

        int sqart  =(int) Math.sqrt(a);
        for(int i=3;i<=sqart;i+=2){
            if(a%i==0) return false;
        }
        return true;
    }
}
