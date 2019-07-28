/*
 * 测试类
 */

// 定义类 SxtStu
public class SxtStu {

  // 属性 fields
  int num;
  String name;
  int age;

  /*
   * 建立对象:
   * 计算机
   */
  Computer comp;

  // 定义方法
  void study() {
    // 输出
    System.out.println("I'm GOD computer: " + comp.brand);
  }

  void play() {
    // 输出
    System.out.println("I'm GOD");
  }

  /*
   * 构造方法
   * 用于创造这个类的对象
   * 无参的构造方法可以
   * 由系统自动创建
   */
  SxtStu() {
  }

  /*
   * 程序执行的入口
   * 必须要有
   */
  public static void main(String[] args) {

    // 定义对象
    SxtStu stu = new SxtStu();

    // 给对象各变量赋值
    stu.num = 0000;
    stu.name = "GOD";
    stu.age = 0;

    // 建立一个对象 c1
    Computer c1 = new Computer();
    c1.brand = "God Computer";

    // 将电脑赋给学生
    stu.comp = c1;

    // 调用对象的方法
    stu.study();
    stu.play();

  }

}

// 建立一个类 Computer
class Computer {

  String brand;

}
