/*
 * 测试 if ...... else 双选择结构
 */

public class TestSelectionIf {

  public static void main(String[] args) {

    /*
     * 随机产生一个 [0.0 ~ 4.0]
     * 区间的半径
     * 并根据半径求圆的面积和周长
     */
    double r = 4 * Math.random();
    // Math.pow(r , 2) 求半径平方
    double area = Math.PI * Math.pow(r , 2);
    // 算出周长
    double circle = 2 * Math.PI * r;

    // 输出结果
    System.out.println("半径: " + r);
    System.out.println("面积: " + area);
    System.out.println("周长: " + circle);

    /*
     * 去除单位只比数值
     * 如果:
     * area >= circle
     * 则输出:
     * area 大于或等于 circle
     * 否则
     * 输出:
     * circle 大于 area
     */
    if (area >= circle) {
      // 输出 area 大于或等于 circle
      System.out.println("\narea >= circle");
    } else {
      // 输出 circle 大于 area
      System.out.println("\ncircle > area");
    }

  }

}
