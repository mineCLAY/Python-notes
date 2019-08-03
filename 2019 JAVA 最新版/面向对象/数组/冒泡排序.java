/*
 * 冒泡排序
 */

// 导入包 java.util.Arrays 所有类
import java.util.Arrays;

public class TestBubbleSort {

  public static void main(String[] args) {

    // 定义数组
    int values[] ={ 3 , 1 , 6 , 2 , 9 , 0 , 7 , 4 , 5 , 8 };
    // 定义变量
    int temp = 0;

    // 开始循环
    for (int i = 0; i < values.length - 1; i++) {
    
      // 定义布尔变量
      boolean flag = true;

      // 嵌套循环
      for (int j = 0; j < values.length - i - 1; j++) {

        // 比较大小
        if (values[j] > values[j + 1]) {

          // 调换顺序
          temp = values[j];
          values[j] = values[j + 1];
          values[j + 1] = temp;

          // 给变量 flag 赋值
          flag = false;

        }

        // 输出过程
        System.out.println(Arrays.toString(values));

      }

      // 判断 flag 是否为 true
      if (flag) {

        // 输出
        System.out.println("结束");

        // 退出循环
        break;

      }

    }

    return;
  }

}
