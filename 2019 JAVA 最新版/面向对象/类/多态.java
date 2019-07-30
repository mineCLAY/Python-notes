/*
 * 多态(polymorphism):
 *
 * 1. 多态是方法的多态
 *    不是属性的多态
 *    (多态与属性无关)
 * 2. 多态的存在要有 3 个必要条件:
 *    继承、方法重写、父类引用指向子类对象
 * 3. 父类引用指向子类对象后
 *    用该父类引用调用子类重写的方法
 *    此时多态就出现了
 */

public class Polym {

  public static void main(String[] args) {

    // 定义对象 a
    Animal a = new Animal();
    // 调用方法 animalCry
    animalCry(a);

    // 定义对象 dog
    Dog dog = new Dog();
    // 调用方法 animalCry
    animalCry(dog);

    // 定义对象 cat
    Cat cat = new Cat();
    // 调用方法 animalCry
    animalCry(cat);

    /* 对象的转型 */

    /*
     * 自动向上转型 (Dog -> Animal)
     * 因为编译器会认为 d 为 Aniaml 类型
     * 但是运行时却会变为 Dog 类型
     * 所以现在 d 只能使用 Animal
     * 中的属性和方法
     */
    Animal d = new Dog();
    animalCry(d);
    // Cat -> Animal
    Animal c = new Cat();
    animalCry(c);

    /*
     * 强制向下转换 (Animal -> Dog)
     * 如果想要用 Dog 类中的属性和方法
     * 只能强制转换回去
     */
    Dog d2 = (Dog) d;
    d2.watchDog();

    /*
     * 编译通过
     * 但是运行却会出错
     * 不能子类之间转换
     */
    // Dog d3 = (Dog) c;
    // d3.watchDog();

    return;
  }

  // 定义静态方法 animalCry
  static void animalCry(Animal a) {

    // 调用对象 a 的成员方法 shout
    a.shout();

  }

}

// 定义类 Animal
class Animal {

  // 定义方法 shout
  public void shout() {

    // 输出
    System.out.println("say");

  }

}

// 定义类 Dog 继承 Animal
class Dog extends Animal {

  // 定义方法 shout
  public void shout() {

    // 输出
    System.out.println("wang..wang");

  }

  // 定义方法 watchDog
  public void watchDog() {

    // 输出
    System.out.println("watch dog");

  }

}

// 定义类 Cat 继承 Animal
class Cat extends Animal {

  // 定义方法 shout
  public void shout() {

    // 输出
    System.out.println("miao..miao");

  }

}
