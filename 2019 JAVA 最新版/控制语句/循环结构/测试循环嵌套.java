/*
 * 测试循环嵌套
 *
 * 1. 输出:
 *
 * 1 1 1 1 1
 * 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4 4
 * 5 5 5 5 5
 *
 * 2. 输出乘法表
 */

public class TestNestedLoop {

  public static void main(String[] args) {

    /**************** 1. ****************/

    // 循环输出
    for (int i = 1; i <= 5; i++) {
      // 嵌套
      for (int j = 0; j < 5; j++) {
        // 输出结果
        System.out.printf("%d " , i);
      }

      // 输出换行
      System.out.println();
    }

    /**************** 2. 输出乘法表 ***************/

    System.out.println("\n#####################\n");
    // 打印乘法表
    for (int i = 1; i <= 9; i++) {
      // 嵌套
      for (int n = 1; n <= i; n++) {
        System.out.printf("%d * %d = %d\t" , n , i , i * n);
      }

      // 输出换行
      System.out.println();
    }

  }

}
