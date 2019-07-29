/*
 * static 关键字的用法:
 *
 * 1. static 修饰过的成员变量为
 *    静态成员变量
 *    其为公用变量
 *    属于类
 *    被该类所以实例共享
 *    在类被载入时被量式初始化
 * 2. 对于该类所以对象来说
 *    static 成员变量只有一份
 *    被该类的所有对象共享
 * 3. 一般用 "类名.类属性 / 方法" 来调用
 *    (也可以通过对象引用类名
 *    (不要实例化) 访问静态成员)
 * 4. 在 static 方法中不可直接
 *    访问非 static 的成员
 */

public class User {

  // 定义成员变量
  int id;
  String name;
  String password;

  // 定义静态变量
  static String minecraft  = "MC";

  // 定义结构体
  User(int id , String name) {

    // 给相应变量赋值
    this.id = id;
    this.name = name;

  }

  // 定义方法 login
  void login() {

    // 定义静态方法 printMinecraft
    printMinecraft();

    // 打印结果
    System.out.println("用户名: " + name);
    System.out.println("密码: " + password);

  }

  // 定义静态方法 printMinecraft
  static void printMinecraft() {

    /*
     * 静态方法
     * 不能调用普通方法
     */
    // login();
    System.out.println(minecraft);

  }

  public static void main(String[] args) {

    // 定义对象 User
    User user = new User(000 , "GOD");

    // 调用对象的成员方法
    User.printMinecraft();

    // 重新给对象成员赋值
    User.minecraft = "Minecraft";
    // 调用对象的成员方法
    User.printMinecraft();

    return;
  }

}
