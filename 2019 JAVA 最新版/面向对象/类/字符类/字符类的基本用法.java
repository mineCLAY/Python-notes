/*
 * 字符类的基本用法
 */

public class TestString {

  public static void main(String[] args) {

    // 定义变量
    String str1 = "I'm ";
    String str2 = "GOD";
    String str3 = new String("I'm ");
    // 不是加法二十字符连接符
    String str4 = str3 + "GOD " + 0000; 

    // 输出
    System.out.println(str4);

    // 输出换行
    System.out.println();

    /*
     * 定义变量
     * 它们俩属于同一个对象
     */
    String str5 = "GOD";
    String str6 = "GOD";

    /*
     * 定义对象
     * 这里因为 new 了一个对象
     * 新建一个对象
     * 所以不和前面两个
     * 属于同一个对象
     */
    String str7 = new String("GOD");

    // true
    System.out.println(str5 == str6);
    /*
     * 因为它俩不属于同一个对象
     * 答案是 false
     */
    System.out.println(str6 == str7);

    /*
     * 通常比较字符串时
     * 使用 equals
     */
    System.out.println(str6 .equals (str7));

    return;
  }

}
