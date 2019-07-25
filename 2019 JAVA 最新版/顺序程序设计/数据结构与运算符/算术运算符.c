/*
 * 测试算术运算符
 */

public class TestOperator {

  public static void main(String[] args) {
    byte s = 1;
    int w = 2;
    long b2 = 3;

    /*
     * 报错
     * 因为 byte 类型
     * 无法存放 int 型
     */
    // byte c = a + b;

    /*
     * 报错
     * 因为 int 类型
     * 无法存放 int 型
     */
    // int c2 = b2 + b;

    float f1 = 3.14F;
    float d = w + b2;

    // 报错
    // float d2 = f1 + 6.2;

    // 输出余数的结果
    System.out.println(-9 % 5);

    int a = 3;
    /*
     * 执行完后
     * b = 3
     * 先给 b 赋值
     * 再自增
     */
    int b = a++;
    // 输出结果
    System.out.println("a = " + a + "\nb = " +b);

    a = 3;
    /*
     * 执行完后
     * c = 4
     * a 先自增
     * 再给 c 赋值
     */
    int c = ++a;
    // 输出结果
    System.out.println("a = " + a + "\nc = " + c);

  }

}
