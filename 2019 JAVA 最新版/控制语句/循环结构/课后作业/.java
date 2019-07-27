/*
 * 用循环输出:
 * 1 ~ 1000 之间
 * 能被 5 整除的数
 * 且每行输出 5 个
 */

public class DivisibleByFive {

  public static void main(String[] args) {

    // 循环输出
    for (int i = 1 , a = 0; i < 1000; i++) {
      // 判断是否能被 5 整除
      if (0 == i % 5) {
        // 输出
        System.out.printf("%d\tu" , i);
        // 让 a 自加
        a++;
      }

      // 判断是否五次循环
      if (5 == a) {
        // 让 a 重置
        a = 0;
        // 输出换行
        System.out.println();
      }
    }

  }

}
