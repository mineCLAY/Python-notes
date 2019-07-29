/*
 * 继承 (extends):
 *
 * 1. 父类也称作:
 *    超类、基类、派生类等
 * 2. java 只有单继承
 *    没有像 C++ 那样可以多继承
 *    多继承会引起混乱
 *    使得胡成链过于复杂
 *    系统难于维护
 * 3. java 中类没有多继承
 *    接口有多继承
 * 4. 子类继承父类
 *    可以得到父类的
 *    全部属性和方法 
 *    (除了父类的构造器方法)
 *    但不见得可以直接访问
 *    比如:
 *    父类私有的属性和方法
 * 5. 如果定义一个类时
 *    没有调用 extends
 *    则它的父类是:
 *    java.lang.Object
 */

public class TestExtends {

  public static void main(String[] args) {

    // 定义一个对象 stu
    Student stu = new Student("GOD" , 0000 , " ");

    // 定义一个对象 student
    Student student = new Student("GOD" , 0000 , " ");

    /*
     * instanceof 关键字
     * 判断左边对象
     * 是否是右边类创建的对象
     *
     * 如果是
     * 返回 true
     * 否则返回 false
     */
    System.out.println(student instanceof Student);
    System.out.println(student instanceof Person);
    System.out.println(student instanceof Object);

    /*
     * 不要反过来
     * Person 不是
     * Student 类型
     *
     * 返回:
     * false
     */
    System.out.println(new Person() instanceof Student);

    return;
  }    

}

/* 定义一个类 Person
 * 没有写继承
 * 编译器会在类名自动加上
 * extends Object
 */
class Person {

  // 定义成员变量
  String name;
  int id;

  // 定义方法 rest
  void rest() {

    // 输出
    System.out.println("I'm GOD");

  }

}

/*
 * 定义一个类 Student
 * 继承 Person 的数据
 */
class Student extends Person {

  // 定义成员变量 major
  String major;

  public void study() {

    // 输出
    System.out.println("加油");

  }

  // 定义构造器
  public Student(String name , int id , String major) {

    // 给相应的成员变量赋值
    this.name = name;
    this.id = id;
    this.major = major;

  }

}
