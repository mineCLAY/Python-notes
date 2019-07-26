/*
 * 测试 if 单向选择结构
 */

public class TestSelectionIf {

  public static void main(String[] args) {

    /*
     * Math.random()
     * 返回 [1 ~ 0]
     * 之间的随机数
     */
    double d = Math.random();
    // 输出 0 ~ 1 随机数
    System.out.println(d);

    /* 制作摇骰子游戏 */

    // 告诉u用户来玩骰子游戏
    System.out.println("################\n\n来玩骰子游戏\n");
    /*
     * 通过 Math.random()
     * 产生随机数
     */
    int i = (int)(6 * Math.random() +1);
    int j = (int)(6 * Math.random() +1);
    int k = (int)(6 * Math.random() +1);
    // 将它们相加得出骰子数
    int count = i + j + k;

    // 判断骰子数是什么级别
    if (15 < count)
      // 输出 手气不错
      System.out.println("手气不错");
    if ((15 >= count) && (count >=10))
      // 输出 手气一般
      System.out.println("手气一般");
    if (10 > count)
      // 输出 手气不怎么样
      System.out.println("手气不怎么样");

    // 告诉用户得了多少分
    System.out.println("得了 " + count + " 分");

  }

}
