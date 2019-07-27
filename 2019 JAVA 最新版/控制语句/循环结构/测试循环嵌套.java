/*
 * 测试循环嵌套
 *
 * 输出:
 * 1 1 1 1 1
 * 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4 4
 * 5 5 5 5 5
 */

public class TestNestedLoop {

  public static void main(String[] args) {

    // 循环输出
    for (int i = 0; i < 5; i++) {
      // 嵌套
      for (int j = 0; j < 5; j++) {
        // 输出结果
        System.out.printf("%d " , i);
      }

      // 输出换行
      System.out.println();
    }

  }

}
