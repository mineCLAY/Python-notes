/*
 * 测试 for 循环
 *
 * 计算
 * 1 + ...... + 100 累加的和
 */

public class TestFor {

  public static void main(String[] args) {

    int sum = 0;

    // 开始累加
    for (int i = 1; i <= 100; i++) {
      // 累加
      sum += i;
    }
    /*
     * 执行过程
     *
     * 1. 执行初始化语句:
     *    int i = 1;
     * 2. 判断 i<= 100
     * 3. 执行循环体
     * 4. 步进迭代:
     *    i++
     * 5. 回到第二步继续判断
     */

    // 输出结果
    System.out.println(sum);

    // 循环迭代
    for (int i = 1 , j = i + 10; i < 5; i++ , j = i * 2) {
      // 输出
      System.out.println("i = " + i + "\tj = " + j);
    }

    /*
     * 无限循环
     * 相当于:
     * while (true)
     */
    for (; ;) {
      System.out.println("I'm GOD");
    }

  }

}
