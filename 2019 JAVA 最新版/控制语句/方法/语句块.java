/*
 * 测试语句块
 */

public class TestStatementBlock {

  public static void main(String[] args) {

    int n;
    int a;

    {
      int k;
      /*
       * 编译错误
       * 不能重复定义变量 n
       */
      int n;
    // 变量 k 的作用域到此为止
    }

  }

}
