package Java.Strings;

import java.util.StringJoiner;

public class StringConcatDemo {
    public static void main(String[] args){
        StringJoiner joiner = new StringJoiner("+");
        joiner.add("123").add("123").add("123");  // 123+123+123

        System.out.println(joiner.toString());

        String a = String.join("+","123","123","123"); // 123+123+123
        System.out.println(a);
    }
}
