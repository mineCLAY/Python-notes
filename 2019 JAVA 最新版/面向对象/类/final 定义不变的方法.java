/*
 * final 关键字
 */

public class TestFinal {

  public static void main(String[] args) {

    // 定义对象 dog
    Animal dog = new Animal();

    // 调用对象 dog 的成员方法
    dog.shout();

  }

}

/*
 * 定义类 Animal
 * 如果加了 final 修饰符
 * 子类不能继承
 */
/* final */ class Animal {

  /*
   * 加了 final 修饰符
   * 子类不能重写
   * 此方法
   */
  final void shout() {

    System.out.println("I'm GOD");

  }

}

// 定义类 Dog 继承类 Animal
class Dog extends Animal {

  /*
   * 无法重写方法 shout
   * 因为它加了修饰符 final
   */
  // void shout() {}

  void print() {

    // 输出
    System.out.println("Yo");

  }

}
