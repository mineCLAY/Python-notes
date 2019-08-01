/*
 * 二维数组
 */

public class Test2DimensionArray {

  public static void main(String[] args) {

    // 定义数组
    int a[] = new int[3];

    // 定义对象数组
    God cars[] = new God[3];

    // 定义二维数组
    int b[][] = new int[3][];

    // 给数组赋值
    b[0] = new int[] { 0000 , 0000 };
    b[1] = new int[] { 10 , 15 , 80 };
    b[2] = new int[] { 50 , 60 };

    /*
     * 打印数组
     * b[1][2] (80) 元素
     */
    System.out.println(b[1][2]);

    // 静态初始化二维数组
    int c[][] = {
      { 0000 , 0000 } ,
      { 10 , 15 , 80 } ,
      { 100 , 20 , 300 , 400 }
    };

    /*
     * 打印数组
     * c[2][3] 的元素
     */
    System.out.println(c[2][3]);

    return;
  }

}

// 定义类 God
class God {

  final String GOD = "GOD";

}
