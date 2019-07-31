/*
 * 静态内部类
 */

public class TestStaticInnerClass {

  public static void main(String[] args) {

    // 创建内部类对象
    Outer.Inner inner = new Outer.Inner();

    // 调用对象 inner 的成员方法 show
    inner.show();

    return;
  }

}

//定义类 Outer
class Outer {

  // 定义成员变量 id
  static int id = 0000;

  // 定义方法 testOuter
  public void testOuter(){

    // 输出
    System.out.println("I'm GOD");

  }

  // 静态内部类
  static class Inner {

    // 定义成员变量
    int id = 0000;

    // 定义方法 show
    void show() {

      // 定义局部变量
      int id = 0000;

      // 输外外部类对象
      System.out.println("外部类 age: " + Outer.id);
      // 输出内部类变量
      System.out.println("内部类 age: " + this.id);
      // 输出局部变量
      System.out.println("局部 age: " + id);

    }

  }

}
