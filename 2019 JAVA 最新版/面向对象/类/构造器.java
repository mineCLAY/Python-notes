/*
 * 构造器
 * (构造方法)
 */

// 定义类 Point
class Point {

  // 定义所需变量
  double x , y;

  // 构造方法和类名必须一致
  public Point(double _x , double _y) {

    // 将 main 方法传递的值赋给变量
    x = _x;
    y = _y;

  }

  // 
  public double getDistance(Point p) {

    // 将结果返回 main 方法
    return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));

  }

}

public class TestConstructor {

  public static void main(String[] args) {

    // 定义对象
    Point p = new Point(3.0 , 4.0);
    Point origin = new Point(0.0 , 0.0);

    /*
     * 错误
     * 构造器是有参的
     * 而这语句没有传递参数
     */
    // Point p2 = new Point();

    /*
     * 调用方法 getDistance
     * 输出结果
     */
    System.out.println(p.getDistance(origin));

    return;
  }

}
