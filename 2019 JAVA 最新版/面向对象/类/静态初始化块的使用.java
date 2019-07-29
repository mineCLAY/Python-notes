/*
 * 静态初始化块的使用:
 *
 * 1. 上溯到 Object 类
 *    先执行 Object 的静态初始化块
 *    再向下执行子类的静态初始化块
 *    直到类的静态初始化块为止
 * 2. 构造器 (构造方法) 执行顺序
 *    和上面顺序一样
 */

public class User {

  // 定义成员变量
  int id;
  String name;
  String password;

  // 定义静态成员变量 minecraft
  static String minecraft;

  // 静态语句块
  static {

    System.out.println("I'm GOD");
    minecraft = "Minecraft";

    // 调用方法  printMinecraft
    printMinecraft();

  }

  // 定义静态方法 printMinecraft
  static void printMinecraft() {

    // 输出结果
    System.out.println(minecraft);

  }

  public static void main(String[] args) {

    // 定义空对象 User
    User User = null;

    return;
  }

}
