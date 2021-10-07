package Java.DataTypes;

import java.text.NumberFormat;
import java.util.*;


class NumberFormatting{

    public static void main(String []argh)
    {

        double input = 12321.12312;

        // CURRENT LOCALE
        NumberFormat numberFormat1 = NumberFormat.getNumberInstance(); // With out currency symbol
        System.out.println(numberFormat1.getCurrency()); // INR
        System.out.println(numberFormat1.format(input)); // 12,321.123

        // CURRENT LOCALE
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance();
        System.out.println(numberFormat2.getCurrency()); // INR
        System.out.println(numberFormat2.format(input)); // ₹12,321.12

        // DEFINED LOCALE
        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(numberFormat3.getCurrency()); // USD
        System.out.println(numberFormat3.format(input)); // $12,321.12

        // CUSTOM LOCALE
        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(new Locale("en","IN")); // ₹12,321.12
        System.out.println(numberFormat4.getCurrency()); // INR
        System.out.println(numberFormat4.format(input)); // ₹12,321.12

    }
}