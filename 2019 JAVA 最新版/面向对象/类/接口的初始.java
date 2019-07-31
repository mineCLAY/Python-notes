/*
 * 接口的使用
 */

/*
 * 在类名前加上 interface
 * 修饰符就是接口
 */
public interface Interface {

  /*
   * 定义成员变量
   * 默认加上 public static final
   * 修饰符
   */
  /* public static final */ int GOD_ID = 0000;

  /*
   * 定义方法 test
   * 它会默认加上
   * public abstract 修饰符
   */
  public abstract void test();


}

// 定义了类 Class 实现接口
class Class implements Interface {

  // 重写方法 test
  public void test() {

    // 输出
    System.out.println(GOD_ID);
    System.out.println("I'm GOD");

  }

}
