/*
 * 数组三种初始化方式
 */

public class ArrayInitialization {

  public static void main(String[] args) {

    // 静态初始化
    int a[] = {0 , 00 , 000};
    User b[] = {
      new User(0000 , "GOD") ,
      new User(0000 , "GOD") ,
      new User(0000 , "GOD") ,
    };

    /*
     * 默认初始化
     *
     * 默认给数组的元素赋值
     *    int     默认为 0
     *    double  默认为 0.0
     *    char    默认为 '\u0000'
     *    boolean 默认为 false
     *    String  默认为 '\u0000'
     */
    int c[] = new int[3];

    /*
     * 动态初始化
     *
     * 动态出事化数组
     * 先分配空间
     */
    int p[] = new int [2];

    // 给数组元素赋值
    p[0] = 1;
    p[1] = 2;

    return;

  }

}

// 定义封装 User
class User {

  // 定义成员变量
  int id;
  String name;

  // 定义构造器
  public User(int id , String name) {

    // 给相应成员变量赋值
    this.id = id;
    this.name = name;

  }

}
