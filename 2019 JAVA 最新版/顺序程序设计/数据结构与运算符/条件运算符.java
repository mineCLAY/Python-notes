/*
 * 条件运算符
 */

public class TestConditionalOperator {

  public static void main(String[] args) {

    int x = -666;
    int score = 80;
    String temp = score < 60 ? "不及格":"及格";

    /*
     * 输出:
     * 及格
     */
    System.out.println(temp);

    /*
     * 上面条件运算符可以
     * 代替下面的 if 语句
     */
    if (score < 60) {
      // 输出不及格
      System.out.println("不及格");
    } else {
      // 输出及格
      System.out.println("及格");
    }

    // 条件运算符也可以嵌套
    System.out.println(x > 0 ? 1:(x == 0 ? 0:-1));

  }

}
