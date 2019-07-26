/*
 * 测试 switch 语句 
 */

public class TestSwitch {

  public static void main(String args) {

    /*
     * 用 Math.random()
     * 随机取月份
     */
    int month = (int)(1 + 12 * Math.random());
    // 输出月份
    System.out.printf("month: %d\n" , month);

    // 开始判断
    switch (month) {

      case 1: {
        // 输出 过年了
        System.out.println("过年了");
        // 退出判断
        break;
      }
      case 2: {
        // 输出 开春了
        System.out.println("开春了");
        // 退出判断
        break;
      }
      default: {
        // 输出 其他月份
        System.out.println("其他月份");
        // 退出判断
        break;
      }

    }

    System.out.println("######################");
    char c = 'a';
    int rand = (int)(26 * Math.random());
    char c2 = (char)(c + rand);

    // 输出 c2 存储的字符
    System.out.println(c2);

    // 开始判断
    switch (c2) {

      // 判断是否为元音
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u': {
        // 输出 元音
        System.out.println("元音");
        // 退出判断
        break;
      }

      // 判断是否为 半元音
      case 'y':
      case 'w': {
        // 输出 半元音
        System.out.println("半元音");
        // 退出判断
        break;
      }

      // 其他为 辅音
      default: {
        // 输出 辅音
        System.out.println("音");
        // 退出判断
        break;
      }

    }

  }

}
