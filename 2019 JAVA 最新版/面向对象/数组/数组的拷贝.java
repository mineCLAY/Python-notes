/*
 * 数组的拷贝
 *
 * 1. 数组的删除
 *
 *    从数组中删除某个元素
 *    (本质上还是数组的拷贝)
 *
 * 2. 数组的扩容
 *
 *    本质上:
 *    先定义一个更大的数组
 *    然后将原数组原封不动
 *    拷贝到新数组中
 */

public class Test {

  public static void main(String[] args) {

    // 调用方法 testBasicCopy
    testBasicCopy();

    // 定义变量 str
    String str[] = { "Yo" , "I'm" , "GOD" };

    // 调用方法 removeElment
    removeElment(str , 1);

    /*
     * 将方法 extendsRange
     * 返回值赋给 str
     */
    str = extendRange(str);

    return;
  }

  // 定义方法 testCopy
  public static void testCopy() {

    // 定义数组
    String str1[] = { "I'm" , "GOD" };
    String str2[] = new String[10];

    // 开始数组的拷贝
    System.arraycopy(str1 , 0 , str2 , 2 , 2);

    // 循环输出
    for (int i= 0; i < str2.length; i++) {

      System.out.println(i + " -- " + str2[i]);

    }

  }


  /*
   * 定义方法 testBasicCopy
   *
   * 删除数组指定索引位置的元素
   * 并将原数组返回
   */
  public static void testBasicCopy() {

    // 定义数组
    String str1[] = { "I'm" , "GOD" };
    // String str2[] = new String[10];

    // 开始数组的拷贝
    System.arraycopy(str1 , 0 , str1 , 2 - 1 , str1.length - 1);

    // 将数组最后的元素赋为 null
    str1[str1.length - 1] = null;

    for (int i= 0; i < str1.length; i++) {

      System.out.println(i + " -- " + str1[i]);

    }

  }

  /*
   * 定义方法 removeElment
   *
   * 实现删除数组中指定索引位置的元素
   * 并将原数组返回
   */
  public static String[] removeElment(String s[] , int index) {

    // 开始删除数组指定的元素
    System.arraycopy(s , index , s , index - 1 , s.length - index);

    // 将数组最后的一个元素赋为 null
    s[s.length - 1] = null;

    // 输出换行
    System.out.println();

    // 循环打印结果
    for (int i = 0; i < s.length; i++) {

      // 输出
      System.out.println(i + " -- " + s[i]);

    }

    // 将 s 返回 main 方法
    return s;

  }

  /*
   * 数组的扩容
   */
  public static String[] extendRange(String str1[]) {

    // 定义数组
    String str2[] = new String[str1.length + 10];

    /*
     * 拷贝数组
     *
     * 就将 str1 中所有的元素
     * 拷贝到了 str2
     */
    System.arraycopy(str1 , 0 , str2 , 0 , str1.length);

    // 输出换行
    System.out.println();

    // 可以用增强 for 输出
    for (String temp:str2) {

      // 输出
      System.out.println(temp);

    }

    // 将 str2 返回 main 方法
    return str2;

  }

}
