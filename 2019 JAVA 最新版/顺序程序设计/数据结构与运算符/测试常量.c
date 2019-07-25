/*
 * 测试常量
 */

public class TestConstant {

  public static void main(String[] args) {

    int age;
    // 把变量 name 变为常量
    final String name;

    final double PI = 3.14;
    /*
     * 编译错误
     * 不能再被赋值
     */
    // PI = 3.15
    double r = 4;
    double area = PI * r * r;
    double circle = 2 * PI * r;

    // 输出结果
    System.out.println("area = " + area);
    System.out.println("circle = " + circle);

  }

}
