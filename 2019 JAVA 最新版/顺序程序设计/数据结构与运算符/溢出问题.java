/*
 * 测试类型转换为常见问题
 */

public class TesTypeConvertError {

  public static void main(String[] args) {

    // 10 亿
    int money = 100000000;
    int years = 66;

    /*
     * 返回 total 是负数
     * 因为超过了 int 类型
     * 的范围
     */
    int total = money * years;
    // 输出 total
    System.out.println("total = " + total);

    /*
     * 返回的 total 仍然是负数
     * 默认是 int 类型
     * 因此结果会转换成 int 值
     * 再转换为 long 类型
     * 但是已经发生了数据丢失
     */
   long total1 = money *years;
   // 输出 total1 的值
   System.out.println("total1 = " + total1);

    /*
     * 返回的 total2 
     * 正确先将一个因子变成 long 类型
     * 整个表达式发生提升
     * 全部都用 long 来计算
     */
    long total2 = money * ((long)years);
    // 输出 total2 的值
    System.out.println("total2 = " + total2);

    /*
     * 为了避免整型常量计算时
     * 数据丢失
     * 可以把第一个常量
     * 直接转换为 long 类型
     * 后来进行计算
     * 其它常量 (变量) 自动转换为
     * long 类型
     * 比如:
     */
    long total3 = 34L * 3223 * years * 223423;
    // 输出 total3 的值
    System.out.println("total3 = " + total3);

    /*
     * 命名问题
     *
     * 用小写 l 做变量名 (标识符)
     * 可能会分不清 L 还是 1
     */
    int l = 2;
    // 使用大写 L 就能看清
    long L = 23451L;
    // 输出 L 的值
    System.out.println("L = " + L);

  }

}
