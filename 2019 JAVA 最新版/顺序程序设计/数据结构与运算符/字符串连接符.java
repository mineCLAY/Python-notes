/*
 * 字符串连接符
 */

public class TestStringConnector {

  public static void main(String[] args) {

    String a = "3";
    int b = 4;
    int c = 5;
    char d = 'a';

    /*
     * 输出三个变量相加 (连接) 的结果
     *
     * 先计算 a + b
     * 因为 a 是字符串
     * 所以 + 是字符串连接符
     * 得出 35
     * 然后字符串与 c 相加
     * 因为 c 是 int 型数据
     * 字符串先转换为对应的 Unicode 编码
     * 再进行计算
     * 输出:
     * 345
     */
    System.out.println(a + b + c);
    /*
     * 先计算 b + c
     * 得出 9
     * 然后用计算出的值
     * 再加 a 但是因为 a 是字符串
     * 所以 + 是字符串连接符
     * 输出:
     * 93
     */
    System.out.println(b + c + a);
    /*
     * 因为相加的有整型
     * 所以 char 型先
     * 转换为 Unicode 编码
     * 接着相加
     * 97 + 4
     * 输出:
     * 101
     */
    System.out.println(d + 4);

  }

}
