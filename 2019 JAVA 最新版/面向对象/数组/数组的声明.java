/*
 * 数组的声明
 */

public class TestArray {

  public static void main(String[] args) {

    // 声明数组
    int array1[] = new int[10];
    String array2[] = new String[5];

    // 给相数组赋值
    array1[0] = 0000;
    array1[1] = 15;
    array1[2] = 20;

    /*
     * 出错原因
     * 下标索引是从 0 开始
     * 而这个数组有 10 个整型元素
     * 最后的元素下标是 9
     */
    // array[10] = 0000;

    /*
     * 循环初始化数组
     * 在数组后面加 .length
     * 可以获取元素数量
     */
    for (int i = 0; i < array1.length; i++) {
      // 输出
      array1[i] = 10 * i;
    }

    /*
     * 循环输出数组
     * 在数组后面加 .length
     * 可以获取元素数量
     */
    for (int i = 0; i < array1.length; i++) {
      // 输出
      System.out.println(array1[i]);
    }

    // 定义数组
    User[] array3 = new User[3];
    array3[0] = new User(0000 , "GOD");
    array3[1] = new User(0000 , "GOD");
    array3[2] = new User(0000 , "GOD");

    /*
     * 循环输出数组
     * 在数组后面加 .length
     * 可以获取元素数量
     */
    for (int i = 0; i < array3.length; i++) {
      // 输出
      System.out.println(array3[i].getName());
    }

    return;
  }

}

// 定义封装 User
class User {

  // 定义成员变量
  private int id;
  private String name;

  // 定义方法 setId
  public void setId(int id) {

    // 给相应的成员变量赋值
    this.id = id;

  }

  // 定义类 getId
  public int getId() {

    /*
     * 将此类成员变量 id
     * 返回给调用其的方法
     */
    return this.id;

  }

  // 定义方法 setName
  public void setName(String name) {

    // 给相应的成员变量赋值
    this.name = name;

  }

  public String getName() {

    /*
     * 将此类成员变量 name
     * 返回给调用其的方法
     */
    return this.name;

  }

  // 定义构造器
  public User(int id , String name) {

    // 构造器第一句总是 super
    super();

    // 给相应的成员变量赋值
    this.id = id;
    this.name = name;

  }

}
