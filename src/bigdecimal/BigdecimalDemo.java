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
    }
}
