/*
 * 封装细节
 */

public class Encapsulation {

  // 定义成员变量
  private int id;
  private String name;
  private int age;
  private booolean man;

  /*
   * 定义方法 setName
   * 以后在别的类定义对象
   * 直接调用此方法传值即可
   */
  public void setName(String name) {

    // 给相应变量赋值
    this.name = name;

  }

  /*
   * 定义方法 getName
   * 这样用户就可以在别的类
   * 获取 name 的值
   */
  public String getName() {

    // 返回此类中的成员变量 name
    return this.name;

  }

  /*
   * 定义方法 setAge
   * 以后在别的类定义对象
   * 直接调用此方法传值即可
   */
  public void setAge(int age) {

    // 判断用户输入的 age 是否正常
    if ((age >= 1) && (age <= 130)) {
      // 给相应成员变量赋值
      this.age = age;
    } else {
      // 告诉用户要输入正常年龄
      System.out.println("要输入正常的年龄");
    }

  }

  /*
   * 定义方法 Age
   * 这样用户就可以在别的类
   * 获取 age 的值
   */
  public String getAge() {

    // 返回此类中的成员变量 age
    return this.age;

  }

  /*
   * 定义方法 setMan
   * 以后在别的类定义对象
   * 直接调用此方法传值即可
   */
  public void setman(boolean man) {

    // 给相应变量赋值
    this.name = man;

  }

  /*
   * 定义方法 isMan
   * 这样用户就可以在别的类
   * 获取 man 的值
   */
  public String isMan() {

    // 返回此类中的成员变量 name
    return this.man;

  }

}

/*
 * 其它的类

// 定义测试封装的类 Test
public class Test {

  public static void main(String[] args) {
    // 定义对象 GOD
    Encapsulation GOD = new Encapsulation();

    // 调用对象 GOD 的成员方法 getAge
    GOD.setAge(0);
    // 输出 0
    System.out.println(GOD.getAge());

    // 调用对象 GOD 的成员方法 getName
    GOD.setName("GOD");
    // 输出 GOD
    System.out.println(GOD.getName());

    return;
  }

}

 */
