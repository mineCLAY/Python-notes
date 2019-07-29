/*
 * Object 类的继承
 * 重写方法 toString
 */

public class TestObject {

  public static void main(String[] args) {

    // Object obj;

    // 定义一个对象 to
    TestObject to = new TestObject();

    /*
     * 打印对象继承父类 Object
     * 的成员方法 toString
     */
    System.out.println(to.toString());

    // 定义一个对象 p
    Person p = new Person("GOD" , 0000);

    // 输出对象 p 的成员方法 toString
    System.out.println(p.toString());

    return;
  }

  // 重写方法 toString
  public String toString() {

    /*
     * 将改变的字符串
     * 返回给 main 方法
     */
    return "I'm GOD";

  }

}

// 定义类 Person
class Person {

  // 定义成员变量
  String name;
  int num;

  // 重写方法 toString
  public String toString() {

    /*
     * 将改变的字符串
     * 返回给 main 方法
     */
    return name + ": " + num;

  }

  // 定义构造器
  public Person(String name , int num) {

    // 给相应成员变量赋值
    this.name = name;
    this.num = num;

  }

}
