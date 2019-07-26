/*
 * 逻辑运算符
 */
public class TestLogicalOperators {

  public static void main(String[] args) {

    boolean b1 = true;
    boolean b2 = false;

    /*
     * 输出两个布尔变量比较的结果
     * false
     */
    System.out.println(b1 & b2);
    // true
    System.out.println(b1 | b2);
    // true
    System.out.println(b1 ^ b2);
    // true
    System.out.println(!b2);

    // 短路运算符
    // int c = 3 / 0;

    /*
     * 短路与
     * 第一个操作数的值为 false
     * 泽不需要再计算后面的操作数
     * 因此不会出错
     * 结果:
     * false
     */
    boolean b3 = (1 > 2) && (2 < (3 / 0));
    // 输出结果
    System.out.println(b3);

  }

}
