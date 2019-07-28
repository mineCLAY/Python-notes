/*
 * 测试方法重载
 */

public class TestOverload {

  public static void main(String[] args) {

    /*
     * 调用方法
     * 输出
     */

    // 8
    System.out.println(add(3 , 5));
    // 18
    System.out.println(add(3 , 5 , 10));
    // 8.0
    System.out.println(add(3.0 , 5));
    // 8.0
    System.out.println(add(3 , 5.0));

    /*
     * System.out.println
     * 也是方法重载
     */

    // 0 个参数
    System.out.println();
    // 参数是 1 个 int 类型的数据
    System.out.println(1);
    // 参数是 1 个 double 类型的数据
    System.out.println(3.0);

  }

  /*
   * 定义求和的方法
   */
  public static int add(int n1 , int n2) {

    // 将结果返回 main 方法
    return n1 + n2;

  }

  /*
   * 方法名相同
   * 参数个数不同
   * 构成重载
   */
  public static int add(int n1 , int n2 , int n3) {

    // 将结果返回 main 方法
    return n1 + n2 + n3;

  }

  /*
   * 方法名相同
   * 参数类型不同
   * 构成重载
   */
  public static double add(double n1 , int n2) {

    // 将结果返回 main 方法
    return n1 + n2;

  }

  /*
   * 方法名不同
   * 参数顺序不同
   * 构成重载
   */
  public static double add(int n1 , double n2) {

    // 将结果返回 main 方法
    return n1 + n2;

  }

  /*
   * 编译错误:
   * 只有返回值不同
   * 不构成方法的重载

  public static double add(int n1 , int n2) {

    return n1 + n2;

  }

   * 编译错误:
   * 只有参数的名称不同
   * 不构成方法的重载

  public static int add(int n2 , int n1) {

    return n2 + n1;

  }

  */
}
