/*
 * 位运算
 */
public class TestBitOperation {

  public static void main(String[] args) {

    int a = 3;
    int b = 4;

    /*
     * 输出进行位运算后D的结果
     * 0
     */
    System.out.println(a & b);
    // 7
    System.out.println(a | b);
    // 7
    System.out.println(a ^ b);
    // -4
    System.out.println(~a);

    /*
     * 移位
     *
     * 相当于 c = 3 * 4
     */
    int c = 3 << 2;
    // 输出 c 的值
    System.out.println(c);

    /*
     * 相当于 12 / 2
     * 输出 6
     */
    System.out.println(12 >> 1);

  }

}
