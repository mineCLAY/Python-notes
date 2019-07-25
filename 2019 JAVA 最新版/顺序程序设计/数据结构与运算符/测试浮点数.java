import java.math.*;

/*
 * 测试浮点数
 */

public class TestPrimitiveDataType {

  public static void main(String[] args) {

    float a = 3.14F;
    double b = 6.28;
    double c = 628e-2;

    // 输出变量 c 的值
    System.out.println(c);

    // 浮点数是不精确的
    float f = 0.1F;
    double d = 1.0 / 10;
    // 结果为 false
    System.out.println(f == d);

    float d1 = 423432423F;
    float d2 = d1 + 1;

    if (d1 == d2) {
      // 结果输出为 d1 == d2
      System.out.printf("d1 == d2\n");
    } else {
      System.out.printf("d1 != d2\n");
    }

    /*
     * 使用精确的浮点运算
     * 推荐:
     * BigDecimal
     */
    BigDecimal bd = BigDecimal.valueOf(1.0);
    bd = bd.subtract(BigDecimal.valueOf(0.1));
    bd = bd.subtract(BigDecimal.valueOf(0.1));
    bd = bd.subtract(BigDecimal.valueOf(0.1));
    bd = bd.subtract(BigDecimal.valueOf(0.1));
    bd = bd.subtract(BigDecimal.valueOf(0.1));
    bd = bd.subtract(BigDecimal.valueOf(0.1));

    // 输出 0.5
    System.out.println(bd);
    // 输出 0.5000000000000001
    System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 -0.1);

    BigDecimal bd2 = BigDecimal.valueOf(0.1);
    BigDecimal bd3 = BigDecimal.valueOf(1.0 / 10.0);

    // 输出 true
    System.put.println(bd2 .equals (bd3));

  }
}
