/*
 * 递归:
 * 阶乘 n!
 */

public class TestRecursion {

  public static void main(String[] args) {

    long d1 = System.currentTimeMillis();
    // 调用方法 factorial 并输出
    System.out.printf("%d factorial result: %d\n" , 10 , factorial(10));

    // 定义存储耗时的变量
    long d2 = System.currentTimeMillis();
    // 输出递归耗时
    System.out.printf("Factorial time: %d\n" , d2 - d1);

    return;
  }

  // 定义求阶乘的方法 factorial
  static int factorial(int n) {

    // 递归头
    if (1 == n) {
      // 将结果返回 main 方法
      return 1;
    } else { // 递归体
      /*
       * 将计算的结果
       * 返回 main 方法
       *
       * n! = n * (n - 1)
       */
      return n * factorial(n - 1);
    }

  }

}
