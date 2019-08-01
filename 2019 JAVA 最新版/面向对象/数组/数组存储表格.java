/*
 * 数组存储表格
 */

// 导入包 java.util.Arrays 中所有类
import java.util.Arrays;

public class TestArrayTableData {

  public static void main(String[] args) {

    // 定义 Object 数组
    Object GOD[] = { 0000 , "GOD" , "GOD" , "0000" };
    Object HJW[] = { 0000 , "HJW" , "person" , "0000" };
    Object temp[] = { 1234 , "L" , "person" , "1234" };

    // 定义 Object 对象数组
    Object tableData[][] = new Object[3][];

    // 对象数组初始化
    tableData[0] = GOD;
    tableData[1] = HJW;
    tableData[2] = temp;

    // 循环打印对象数组
    for (Object tamp[]:tableData) {

      /*
       * 调用方法 Arrays.toString
       * 打印数组
       */
      System.out.println(Arrays.toString(tamp));

    }

    return;
  }

}
