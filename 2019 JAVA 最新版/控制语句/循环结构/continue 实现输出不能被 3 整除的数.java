/*
 * 测试 continue
 * continue 结束本次循环
 * 继续循环下一次
 *
 * 把 100 ~ 150 之间不能
 * 被 3 整除的数输出
 * 并且每行输出 5 个
 */

public class TestContinue {

  public static void main(String[] args) {

    // 定义计数器
    int count = 0;

    // 循环判断
    for (int i = 100; i < 150; i++) {
      /*
       * 如果是 3 的倍数
       * 则跳过本次循环
       * 继续进行下一次循环
       */
      if (0 == i % 3) {
        // 跳过此次循环
        continue;
      }

      /*
       * 否则 (不是 3 的倍数)
       * 输出该数
       */
      System.out.printf("%d " , i);
      /*
       * 每输出一个数
       * 计数器自加
       */
      count++;
      /*
       * 根据计数器判断每行
       * 是否已经输出 5 个数
       */
      if (0 == count % 5) {
        // 输出换行
        System.out.println();
      }
    }

  }

}
