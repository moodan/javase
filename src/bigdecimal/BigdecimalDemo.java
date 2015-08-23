package bigdecimal;

import java.math.BigDecimal;

/**
 * Created by liuchuan on 2015/8/16.
 */
public class BigdecimalDemo {

    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("1.1");
        BigDecimal bigDecimal = BigDecimal.valueOf(1.2);
        System.out.println(bigDecimal);
        System.out.println(bigDecimal1);
        bigDecimal = bigDecimal.add(bigDecimal1);
        System.out.println(bigDecimal);
        System.out.println(new Test().i);
        String hello = new String("hello");
        String hello1 = "hello";
        System.out.println(hello == hello1);
        System.out.println(hello.equals(hello1));
        System.out.println(hello.equals("hello"));
        System.out.println(hello1.equals("hello"));
        System.out.println(hello == "hello");
        System.out.println(hello1 == "hello");
        double d = -3334.333333;
        System.out.printf("%,(.4f\n", d);
        String s = "a";
        Count count = Count.ONE;
        switch (count) {
            case ONE:
                System.out.println("aa");
                break;
            case TWO:
                System.out.println("bb");
                break;
            case THREE:
                System.out.println("cc");
                break;
            default:
                System.out.println("default");
        }

        i:
        for(int i = 0;i<10;i++) {
            for(int j = 0;j<10;j++) {
                if(j==5) {
                    break;
                }
                System.out.println(i+""+j);
            }
        }
    }
}
