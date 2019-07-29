/*
 * import 导入包:
 *
 * 1. java 会默认导入 java.lang 包
 *    下所有的类
 *    因此这些类可以直接使用
 * 2. 如果导入两个同名的类
 *    只能用:
 *    包名 + 类名
 *    来显示调用相关类
 */

// 导入了 Date 类
import java.util.Date;
/*
 * 在域名后加 *
 * 导入该包的所有类
 * 但是会降低编译速度
 * 但不会降低运行速度
 */
import java.sql.*;
// 导入 Math 包中的静态属性 Pi
import static java.lang.Math.PI;
// 导入 Math 包中所有的静态属性
import static java.lang.Math.*;

public class TestImport {

  public static void main(String[] args) {

    // 可以这样导入包中的类
    // GOD.HC.User User = new GOD.HC.User();

    /*
     * 也可以提前用 import
     * 导入可以直接调用
     */
    User User = new User();

    /*
     * 如果几个包都有同名类
     * 只能使用第一种导入类的方法
     */
    java.util.Date date = new java.util.Date();

    // 打印导入的 PI
    System.out.println(Math.PI);

    return;
  }    

}
