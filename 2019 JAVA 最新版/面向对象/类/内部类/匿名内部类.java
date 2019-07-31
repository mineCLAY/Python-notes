/*
 * 匿名内部类
 */

public class TestAnonymousInnerClass {

  public static void test(A a) {

    // 定义对象 a 中的成员方法 a
    a.a();

  }

  public static void main(String[] args) {

    TestAnonymousInnerClass.test(new A() {

      // 重写方法 a
      public void a() {

        // 输出
        System.out.println("Test");

      }

    });

    return;
  }

}

// 定义接口 A
interface A {

  // 定义方法
  void a();

}
