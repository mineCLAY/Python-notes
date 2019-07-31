/*
 * 接口 (interface) :
 *
 * 1. 访问修饰符:
 *    只能是 public 或默认
 * 2. 接口名:
 *    和类名采用相同命名机制
 * 3. extends:
 *    接口可以多继承
 * 4. 常量:
 *    接口中的属性只能是常量
 *    总是:
 *    public static final 修饰
 *    不写也是
 * 5. 方法:
 *    接口中的方法只能是:
 *    public abstract
 *    省略的话
 *    也是 public abstract
 */

public class ExampleInterface {

  public static void main(String[] args) {

    // 定义对象 angel
    Volant angel = new Angel();

    // 调用对象 angel 的成员方法 fly
    angel.fly();

    /*
     * 但是不能调用不是
     * Volant 接口的方法
     * 因为 angel 是 volant 类型
     */
    // angel.helpOther();

    // 定义对象 help
    Honest help = new Angel();

    /*
     * 调用对象 help
     * 的成员方法 helpOther
     */
    help.helpOther();

    // 定义对象 test
    Test test = new Test();

    // 定义对象 test 的成员方法
    test.testA();
    test.testB();
    test.testC();

    return;
  }

}

// 飞行接口
interface Volant {

  // 定义成员变量
  int FLY_HEIGHT = 1000;

  // 定义方法 fly
  void fly();

}

// 善良接口
interface Honest {

  // 定义方法 helpOther
  void helpOther();

}

/*
 * 定义类 Angel
 * 实现类可以实现多个父接口
 */
class Angel implements Volant , Honest {

  // 实现方法 fly
  public void fly() {


    // 输出
    System.out.println("fly...fly");
    System.out.println("fly height: " + FLY_HEIGHT);

  }

  // 实现方法 helpOther
  public void helpOther() {

    // 输出
    System.out.println("I'm GOD");

  }

}

// 定义类 Bridman 实现接口 Volant
class Birdman implements Volant {

  // 实现方法 fly
  public void fly() {

    // 输出    
    System.out.println("fly...fly");

  }

}

// 定义类 Test 实现多个父接口
class Test implements A , B , C {

  // 实现方法 testA
  public void testA() {

    // 输出
    System.out.println("I'm GOD");

  }

  // 实现方法 testB
  public void testB() {

    // 输出
    System.out.println("I'm GOD");

  }

  // 实现方法 testC
  public void testC() {

    // 输出
    System.out.println("I'm GOD");

  }

}

// 定义接口 A
interface A {

  // 定义方法 testA
  void testA();

}

// 定义接口 B
interface B {

  // 定义方法 testB
  void testB();

}

/*
 * 接口可以多继承:
 * 接口 C 继承接口 A 和 B
 */
interface C extends A , B{

  // 定义方法 testC
  void testC();

}
