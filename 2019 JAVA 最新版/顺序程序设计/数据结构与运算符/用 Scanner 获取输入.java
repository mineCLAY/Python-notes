/*
 * 测试获得键盘输入
 */

/*
 * 导入 Scanner
 * Scanner 就类似于
 * C 语言的 scanf
 * 所以
 * 也和 C 语言一样需要
 * 调用它存在的包
 */

import java.util.Scanner;

public class Main {

  public static void TestScanner(String[] args) {

    // 先定义
    Scanner scanf = new Scanner(System.in);

    // 叫用户输入名字
    System.out.println("Enter you name:");
    // 将用户输入的名字赋给变量 name
    String name = scanf.nextLine();

    // 叫用户输入爱好
    System.out.println("Enter you hobby:");
    // 将用户输入的爱好赋给变量 favor
    String favor = scanf.nextLine();

    // 叫用户输入年龄
    System.out.println("Enter you age:");
    // 将用户输入的年龄赋给变量 age
    int age = scanf.nextInt();

    // 输出结果
    System.out.println("\n##################\n");
    System.out.printf("name: %s\n" , name);
    System.out.printf("favor: %s\n\n" , favor);
    System.out.println("Came to this dimension about " + age * 365 + " days");
    System.out.println("There are still about " + (100 - age) * 365 + " days to leave this dimension");

  }

}
