/*
 * 参数传值机制:
 *
 * 1. 方法中所有参数都是 "值传递"
 *    也就是传递 "值的副本"
 * 2. 引用类型参数传递的是 "对象的地址"
 *    (址传递)
 *    因此
 *    副本和原件都指向了
 *    同一个 "地址"
 */

public class User {

  // 定义成员变量
  int id;
  String name;

  // 定义构造器
  User(int id , String name) {

    // 给相应的变量赋值
    this.id = id;
    this.name = name;

  }

  // 定义静态方法 minecraft
  void testParameterTransfer(User u) {

    u.name = "GOD";

  }

  void Test(User u) {

    // 新建一个对象让 u 指向它
    u = new User(000 , "HJW");

  }

  public static void main(String[] args) {

    // 定义对象 User
    User User = new User(000 , "HC");

    /*
     * 调用对象的成员方法
     * testParamaeterTransfer
     */
    User.testParameterTransfer(User);

    // 输出结果
    System.out.println("ID: " + User.id);
    System.out.println("name: " + User.name);

    /*
     * 调用对象的成员方法
     * Test
     */

    /*
     * 但是它的值不会改变
     *
     * 因为:
     * Test 新建了一个对象
     * 而并没有改变原对象
     * 的地址
     */
    User.Test(User);

    // 输出结果
    System.out.println("ID: " + User.id);
    System.out.println("name: " + User.name);

    return;
  }

}
