/*
 * 测试
 * if ...... else if ...... else
 * 多选择结构 
 */

public class TestIfElseifElse {

  public static void main(String args) {

    /*
     * 通过 Math.random()
     * 随机获取分数
     */
    int score = (int)(100 * Math.random());

    // 开始判断分数为哪个级别
    if ((0 <= score) && (60 > score)) {
      // 输出 不及格
      System.out.println("不及格");
    } else if ((60 <= score) && (75 >= score)) {
      // 输出 及格
      System.out.println("及格");
    } else if ((75 < score) && (85 >= score)) {
      // 输出 良
      System.out.println("良");
    } else if ((85 < score) && (score <= 100)) {
      // 输出 优
      System.out.println("优");
    } else {
      // 输出 error
      System.out.println("error");
    }

  }

}
