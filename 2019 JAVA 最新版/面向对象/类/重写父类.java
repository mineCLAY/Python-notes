/*
 * 重写 (override) / 覆盖
 *
 * 要满足以下要点:
 * 1. "==" :
 *    方法名、形参列表相同
 * 2. "<=" :
 *    返回值类型和声明异常类型
 *    子类小于或等于父类
 * 3. ">=" :
 *    访问权限
 *    子类大于或等于父类 
 */

public class TestOveride {

  public static void main(String[] args) {

    // 定义一个对象
    Horse horse = new Horse();

    // 调用对象 horse 的成员方法
    horse.run();
    horse.stop();

  }

}

// 定义一个类 Vehicle
class Vehicle {

  // 定义方法 run
  public void run() {

    // 输出
    System.out.println("tun...");

  }

  // 定义方法 stop
  public void stop() {

    // 输出
    System.out.println("stop!");

  }

  // 定义类 Object
  public Object whoIsPsg() {

    return new Object();

  }

}

class Horse extends Vehicle {

  // 重写方法 run
  public void run() {

    // 输出
    System.out.println("I'm GOD");

  }

  // 重写方法 stop
  public void stop() {

    // 输出
    System.out.println("GOD");

  }

  /*
   * 重写方法 Person
   * 返回值类型小于等于父类的类型
   */
  public Horse whoIsPsg() {

    // 返回重写值
    return new Horse();

  }

}
