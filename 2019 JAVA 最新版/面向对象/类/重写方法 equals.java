/*
 * 重写方法 equals
 *
 * equals 是用来判断两边对象
 * 是否属性相等
 */

public class TestEquals {

  public static void main(String[] args) {

    // Object obj;

    // 定义对象
    User user1 = new User(0000 , "God" , "000");
    User user2 = new User(0000 , "GOD" , "0000");

    /*
     * 输出判断两边对象
     * 数据是否相等的结果
     */
    System.out.println(user1 == user2);
    System.out.println(user1 .equals (user2));

    // 定义对象
    String str1 = new String("GOD");
    String str2 = new String("GOD");

    /*
     * 输出判断两边对象
     * 数据是否相等的结果
     */

    // false
    System.out.println(str1 == str2);
    // true
    System.out.println(str1 .equals (str2));

    return;
  }

}

// 定义类 User
class User {

  // 定义成员变量
  int id;
  String name;
  String password;

  //  重写方法 hashCode
  public int hashCode() {

    final int prime = 31;
    int result = 1;
    result = prime * result + id;

    // 将结果返回 main 方法
    return result;

  }

  // 重写方法 equals
  public boolean equals(Object obj) {

  /*
   * 判断两个对象的
   * 成员变量 id
   * 是否相等
   */
  if (this == obj)
  // 返回 true (相等)
  return true;
  if (this == null) {
    // 返回 false (不相等)
    return false;
  }
  // 如果类型不一样
  if (getClass() != obj.getClass()) {
    // 返回 false (不相等)
    return false;
  }
  // 强制转换
  User other = (User)obj;
  if (id != other.id) {
    // 返回 false (不相等)
    return false;
  }

  /*
   * 全部不符合也为真 (true)
   * 返回 true
   */
  return true;
  }

  // 定义构造器
  public User(int id , String name , String password) {

    // 构造器第一句
    super();

    // 给相应成员变量赋值
    this.id = id;
    this.name = name;
    this.password = password;

  }

}
