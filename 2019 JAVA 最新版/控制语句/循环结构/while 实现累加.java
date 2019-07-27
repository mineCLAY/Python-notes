/*
 * 测试 while 循环
 */

public class TestWhile {

  public static void main(String[] args) {

    // 计算 1 + 2 ...... + 100 的和
    int i = 1;
    int sum = 0;

    // 循环计算
    while (i <= 100) {
      // 累加
      sum += i;
      // 让 i 自加
      i++;
    }

    // 输出结果
    System.out.println(sum);

  }

}
