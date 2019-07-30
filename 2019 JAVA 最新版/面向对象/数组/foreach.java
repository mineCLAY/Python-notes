/*
 * foreach
 */

public class TestForeach {

  public static void main(String[] args) {

    // 声明数组 array
    String array[] = {
      "0000" , "GOD -" , "HJW" , "and WTF"
    };

    /*
     * foreach 循环用于
     * 读取数组元素的值
     * 不能修改元素的值
     *
     * 过程:
     * 定义变量 m
     * 读取数组 array
     * 反复赋值给变量 m
     * 然后输出变量 m
     * 直到读取完数组最后一个元素
     */
    for (String m:array) {

      // 输出
      System.out.printf("%s " , m);

    }

    // 输出换行
    System.out.println();

    return;
  }

}
