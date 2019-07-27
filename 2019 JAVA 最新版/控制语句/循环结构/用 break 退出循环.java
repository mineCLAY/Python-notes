/*
 * 测试循环语句中的 break
 */

public class TestBreak {

  public static void main(String[] args) {

    // 定义计数器
    int total = 0;

    System.out.println("Begin");

    // 循环计算
    while (true) {
      // 每循环一次计数器自加
      total++;

      // 随机取数
      int i = (int)Math.round(100 * Math.random());
      // 输出其值
      System.out.println(i);

      /*
       * 当 i 等于 88 时
       * 退出循环
       */
      if (88 == i) {
        // 退出循环
        break;
      }
    }

    // 输出循环的次数
    System.out.println("Game obver , used " + total + "times.");

  }

}
