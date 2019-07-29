/*
 * This 的用法:
 *
 * 1. 在程序产生二义性之处
 *    应使用 this 来指明
 *    当前对象
 *    普通方法中
 *    this 总是指向调用该方法的对象
 *    构造方法中
 *    this 总是指向正要初始化的对象
 * 2. 使用 this 关键字调用重载的构造方法
 *    避免相同的初始化代码
 *    但只能在构造方法中用
 *    并且必须位于构造方法第一句
 * 3. this 不能用于 static 方法中
 */

public class TestThis {

  // 定义成员变量
  int a , b , c;

  // 定义第一个构造器
  TestThis(int a , int b) {

    // 给相应变量赋值
    this.a = a;
    this.b = b;

  }

  // 定义第二个构造器
  TestThis(int a , int b , int c) {

    /*
     * 用 this 调用第一个构造器
     * (调用构造器只能在第一句)
     */
    this(a , b);
    this.c = c;

  }

  // 定义方法 sing
  void sing() {
  }

  // 定义方法 eat
  void eat() {

    // 用 this 调用本类的方法 sing
    this.sing();
    System.out.println("I'm GOD");

  }

  public static void main(String[] args) {

    // 定义对象
    TestThis HC = new TestThis(2 , 3);

    // 调用对象的方法 eat
    HC.eat();

    return;
  }

}
