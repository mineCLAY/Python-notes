/*
 * 带标签的
 * continue
 * 这种方法类似
 * C 语言的 goto 语句
 *
 * 打印:
 * 101 ~ 150 之间所以的质数
 */

public class TestLabelContinue {

  public static void main(String[] args) {

    // 在 for 前面带个标签 outer
    outer: for (int i  = 101; i < 150; i++) {
      // 嵌套
      for (int j = 2; j < i / 2; j++) {
        // 如果不是质数
        if (i % j == 0) {
          /*
           * 跳到外层循环
           * (带有标签的 outer
           *  的 for 循环)
           */
          continue outer;
        }
      }

      // 输出结果
      System.out.printf("%d " , i);
    }

  }

}
