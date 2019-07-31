/*
 * 非静态内部类:
 *
 * 非静态内部类可以直接
 * 访问外部类的成员
 * 但是外部类不能直接访问
 * 非静态内部类成员
 */

public class TestInnerClass {

  public static void main(String[] args) {

    // 创建内部类对象
    Outer.Inner inner = new Outer().new Inner();

    // 调用对象 inner 的成员方法 show
    inner.show();

    return;
  }

}

//定义类 Outer
class Outer {

  // 定义成员变量 id
  private int id = 0000;

  // 定义方法 testOuter
  public void testOuter(){

    // 输出
    System.out.println("I'm GOD");

  }

  // 成员内部类 (非静态内部类)
  class Inner {

    // 定义成员变量
    int id = 0000;

    // 定义方法 show
    void show() {

      // 定义局部变量
      int id = 0000;

      // 输外外部类对象
      System.out.println("外部类 age: " + Outer.this.id);
      // 输出内部类变量
      System.out.println("内部类 age: " + this.id);
      // 输出局部变量
      System.out.println("局部 age: " + id);

    }

  }

}
