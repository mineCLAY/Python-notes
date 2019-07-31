/*
 * String 类常用的方法
 */

public class TestString {

  public static void main(String[] args) {

    // 定义变量
    String str1 = "I'm GOD";
    String str2 = "I'm GOD";

    /*
     * 提取下标(从 0 开始 和数组一致)
     * 为 5 的字符 (O)
     */
    System.out.println(str1.charAt(5));

    // 输出字符串的长度
    // 7
    System.out.println(str2.length());

    // 比较两个字符串是否相等
    // true
    System.out.println(str1.equals(str2));
    /*
     * 比较两个字符串
     * 是否相等 (忽略大小写)
     */
    // true
    System.out.println(str1.equalsIgnoreCase(str2));

    // 字符串 str1 是否包含 GOD
    // 4
    System.out.println(str1.indexOf("GOD"));
    // 字符串 str1 是否包含 HJW
    // -1
    System.out.println(str1.indexOf("HJW"));

    // 将 str1 中的空格替换成 ' '
    String str = str1.replace(' ' , ' ');
    // I'm GOD
    System.out.println("result is " + str);

    // 是否以 I'm 开头
    // true
    System.out.println(str1.startsWith("I'm"));
    // 是否以 I'm 结尾
    // false
    System.out.println(str1.endsWith("I'm"));

    /*
     * 提取字符串
     * 从下标 4 开始
     * 到字符串结尾为止
     */
    str = str1.substring(4);
    // GOD
    System.out.println(str);
    /*
     * 提取字符:
     * 从下标 4 的字符到
     * 下标 7 的字符 (不包含 7)
     */
    String s = str1.substring(4 , 7);
    // GOD
    System.out.println(s);

    // 把字符串全部转为小写
    System.out.println(str1.toLowerCase());
    // 把字符串全部转为大写
    System.out.println(str1.toUpperCase());

    /*
     * 去除字符串尾的空格
     * 中间的空格不能去除
     */
    String s2 = " I'm GOD ";
    // I'm GOD
    System.out.println(s2.trim());
    /*
     * 因为 String 是不可变字符串
     * 所以 s2 不变
     */
    //  I'm GOD 
    System.out.println(s2);

    return;
  }

}
