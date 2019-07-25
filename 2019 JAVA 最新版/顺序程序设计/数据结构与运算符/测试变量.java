/*
 * 测试变量
 */

public class TestVariable {

  /*
   * 成员变量
   * 从属于对象
   * 成员变量会自动被初始化
   */
  int a;

  /*
   * 静态变量
   * 从属于类
   */
  static int size;

  public static void main(String[] args) {

    {
      /*
       * 局部变量
       * 从属于方法
       */
      int age;
    }

    /*
     * 局部变量
     * 从属于方法
     */
    int salary;

    int i;
    /*
     * 编译错误
     * 变量 i还未被初始化
     */
    // int j = i + 5

  }


}
