/*
 * 测试字符型数据
 */

public class TestPrimitiveDataType {

  public static void main(String[] args) {

    // 字符型可以存储字母
    char a = 'T';
    // 还可以存储中文
    char b = '神';

    // 还可以用 Unicode 编码代替数据
    char c = '\u0061';
    // 输出 c 存储的字符
    System.out.println(c);

    /*
     * 转义字符
     * a
     * b
     */
    System.out.println("" + 'a' + '\n' + 'b');
    // a  b
    System.out.println("" + 'a' + '\t' + 'b');
    // a'b
    System.out.println("" + 'a' + '\'' + 'b');

    // String 就是字符序列
    String d = "abc";

  }

}
