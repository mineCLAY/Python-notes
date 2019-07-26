/*
 * 测试关系运算符
 */

public class TesRrelationalOperator {

  public static void main(String[] args) {

    int a = 3;
    System.out.println(a == 3);
    System.out.println(a != 3);
    System.out.println(a < 5);

    /*
     * char 类型也可以进行比较
     * 先转换成 Unicode 编码
     * 然后进行比较
     */
    char b = 'a';
    char b2 = 'c';

    /*
     * 输出其 Unicode 编码
     * 可以用强制类型转换
     * 也可以用以下方法
     */
    System.out.println((int)b);
    System.out.println(0 + b);
    System.out.println(0 + b2);
    System.out.println(b < b2);

  }

}
