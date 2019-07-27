/*
 * 用循环分别计算 100 以内
 * 奇数及偶数的和
 * 并输出
 */

public class Summation {

  public static void main(String[] args) {

    // 定义两个储存结果的变量
    int sum1;
    int sum2;

    // 循环计算
    for (int i = 1; i < 100; i++) {
      // 判断是否为偶数
      if (0 == i % 2) {
        // 让储存偶数的变量累加
        sum1 += i;
      } else {
        // 让储存奇数的变量累加
        sum2 += i;
      }
    }

    // 输出结果
    System.out.println("Even sum of 100: " + sum1);
    System.out.println("Odd to within 100: " + sum2);

  }

}
