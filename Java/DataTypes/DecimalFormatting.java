package Java.DataTypes;

import java.text.DecimalFormat;

public class DecimalFormatting {
    public static void main(String[] args){

        // TO FORMAT NUMBER TO DECIMAL PLACES

        DecimalFormat decimalFormat = new DecimalFormat();

        decimalFormat.applyPattern("##.##");
        System.out.println(decimalFormat.format(123123.213)); // 123123.21

        decimalFormat.applyPattern("##,###.##");
        System.out.println(decimalFormat.format(123123.213)); // 123,123.21

        decimalFormat.applyPattern("00.##");
        System.out.println(decimalFormat.format(2.323234)); // 02.32

        decimalFormat.applyPattern("00.00");
        System.out.println(decimalFormat.format(2.3)); // 02.30

        decimalFormat.applyPattern("#0.00");
        System.out.println(decimalFormat.format(2.3)); // 2.30

        decimalFormat.applyPattern("##.00");
        System.out.println(decimalFormat.format(0.3)); // .30

        decimalFormat.applyPattern("#0.00");
        System.out.println(decimalFormat.format(0.3)); // 0.30
    }
}
