/*
 * 测试封装
 *
 * 1. privte
 *    加上此修饰符只能被同一个类
 *    访问和调用
 *    无法被其它类访问
 *
 * 2. default
 *    如果没有加修饰符
 *    会默认加上 default 修饰符
 *    无法被其它包使用
 *    只能被同一个包使用
 *
 * 3. protected
 *    加上此修饰符可以被
 *    同一个包、同一个类
 *    和所有其它包的子类的所有类访问
 *
 * 4. public
 *    加此修饰符可以被任意地方调用
 */

/*
 * 此类可以被任意地方调用
 * 因为它有加修饰符 public
 */
public class TestEncapasulation {

  /*
   * 此变量可以被本包下所有类访问
   * 因为变量前面没有加修饰符
   * 编译器会默认加上
   * default 修饰符
   * 所以这个变量不能被
   * 不同包的类访问
   */
  String name;
  /*
   * 此变量可以被同一个包、同一个类
   * 和所有其它包的子类的所有类访问
   * 因为它有加修饰符 protected
   */
  protected int height;

  public static void main(String[] args) {

    // 定义对象 user
    Human user = new Human();

    /*
     * 不能调用类 Human
     * 中的变量 age
     * 因为它被 private 修饰
     */
    // user.age = 13;

    return;
  }

}

/*
 * 定义类 Human
 */
class Human {

  /*
   * 定义用 private
   * 修饰的成员变量 age
   * 此变量只能在当前类使用
   */
  private int age;

  // 定义方法 sayAge
  void sayAge() {

    // 输出变量 age 的值
    System.out.println(age);

  }

}

// 定义类 Boy 继承类 Human
class Boy {

  // 定义方法 sayHello
  void sayHello() {

    // 子类无法使用父类的私有属性和方法
    // System.out.println(age);

  }

}
