/*
 * 构造器 (构造方法)
 * 的重载
 * 就如方法的重载一样
 */

public class User {

  // 定义所需变量
  int id;
  String name;
  String ;

  // 定义第一个构造器
  public User() {

  }

  // 定义第二个构造器
  public User(int id , String) {

    // 构造方法的第一句总是 super()
    super();

    /*
     * this 表示创建好的对象
     * 开始对其赋值
     */
    this.id = id;
    this.name = name;

  }

  // 定义第三个构造器
  public User(int id , String name , String pwd) {

    // 开始给对象的成员赋值
    this.id = id;
    this.name = name;
    this.pwd = pwd;

  }

  public static void main(String[] args) {

    /*
     * 定义第一个对象
     * 向第一个构造器传数据
     */
    User u1 = new User();
    /*
     * 定义第二个对象
     * 向第二个构造器传数据
     */
    User u2 = new User(000 , "GOD");
    /*
     * 定义第三个对象
     * 向第三个构造器传数据
     */
    User u3 = new User(000 , "GOD" , "000000");

    // 输出结果
    System.out.println(u1);
    System.out.println(u2);
    System.out.println(u3);

    return;
  }

}
