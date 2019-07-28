/*
 * 测试方法的基本使用
 *
 * 方法就是一段用来
 * 完成特定功能代码的片段
 * 方法类似其他语言的函数
 */

public class TestMethod {

  public static void main(String[] args) {

    // 通过对象调用普遍方法
    TestMethod p = new TestMethod();
    // 调用方法 printSxt 输出
    p.printSxt();

    // 调用方法 add 求和
    int c = p.add(30 , 40 , 50);

    // 输出结果
    System.out.println(c);

  }

  // 定义一个对象 printSxt
  void printSxt() {

    // 打印输出
    System.out.println("I'm GOD");

  }

  // 定义方法 add
  int add(int a , int b , int c) {

    // 求和
    int sum = a + b + c;

    /*
     * return 两个作用:
     * 1. 结束方法的运行
     * 2. 将结果的值返回 main 方法
     */
    return sum;

  }

}
