/*
 * 测试类型转换
 */

public class TestTypeConvert {

  public static void main(String[] args) {

    /********** 自动类型转换 **********/

    int a = 324;
    long b = a;
    double d = a;

    /*
     * 错误
     * 因为:
     * int 无法存入 long 类型
     */
    // a = b;
    // long e = 3.23F;

    float f = 234324L;

    // 特例
    byte b2 = 123;

    /********** 强制类型转换 **********/

    double x = 3.14;
    // 值为 3
    int nx = (int)x;
    char c = 'a';
    int r = c + 1;

    // 输出 3
    System.out.println(nx);
    // 输出 98
    System.out.println(r);
    // 输出 b
    System.out.println((char)r);

  }

}
