/*
 * super 父类对象引用
 *
 * 构造方法第一句总是:
 * super(......) 
 * 来调用父类对应的构造方法 
 * 所以
 * 流程:
 * 先向上追溯到 Object
 * 然后再依次向下执行类的
 * 初始化块和构造方法
 * 知道当前子类为止
 * 静态初始化块调用顺序
 * 与构造方法调用顺序一样
 * 不再重复
 */

public class TestSuper {

  public static void main(String[] args) {

    // 输出
    System.out.println("....");

    // 调用类 Test 所以语句
    new Test();

    return;
  }

}

// 定义类 Class
class Class {

  // 定义成员变量
  public int value;

  // 定义方法 a
  public void a() {

    // 给成员变量 value 赋值
    value = 100;
    // 输出
    System.out.println("Class.value: " + value);

  }

  // 定义构造器
  public Class() {

    /*
     * super 的作用:
     * 调用父类构造器
     *
     * 所以:
     * 是先执行父类构造器
     * 的语句
     */
    super();

    // 输出
    System.out.println("Yo");

  }

}

// 定义类 Test 继承类 Class
class Test extends Class {

  // 定义成员变量
  public int value;

  // 重写方法 a
  public void a() {

    // 调用父类对象的普通方法
    super.a();

    // 重写成员变量 value
    value = 200;
    System.out.println("Test.value: " + value);
    System.out.println(value);

    // 调用父类对象的成员变量
    System.out.println(super.value);

  }

  // 定义构造器
  public Test() {

    /*
     * super 的作用:
     * 调用父类构造器
     *
     * 所以:
     * 是先执行父类构造器
     * 的语句
     */
    super();

    // 输出
    System.out.println("I'm GOD");

  }

}
