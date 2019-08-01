/*
 * java.util.Arrays 工具类的使用
 */

// 导入包 java.util.Arrays 下所有类
import java.util.Arrays;

public class TestArrays {

  public static void main(String[] args) {

    // 定义数组
    int a[] = { 100 , 0000 , 20 , 30 , 10 , 80 , 50 };

    /*
     * 这里打印的是一个字符串 
     * (数组的地址)
     */
    System.out.println(a);

    /*
     * 这里调用方法 Arrays.toString
     * 打印的才是数组内容:
     * [100 , 0000 , 20 , 30 , 10 , 80 , 50]
     */
    System.out.println(Arrays.toString(a));

    /*
     * 调用方法 Arrays.sort
     * 从小到大排序
     */
    Arrays.sort(a);
    // 输出
    System.out.println(Arrays.toString(a));

    /*
     * 调用方法 Arrays.binarySearch
     * 实现找出 a 数组存放 30 的元素下标
     *
     * 找到返回: 元素下标
     * 没有找到返回: -1
     */
    System.out.println(Arrays.binarySearch(a , 30));

    return;
  }

}
