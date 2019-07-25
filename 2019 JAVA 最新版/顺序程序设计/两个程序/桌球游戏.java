/*
 * 桌球游戏
 */

import java.awt.*;

public class Main {

  Image ball = Toolkit.getDefaultToolkit().getImage("/ball.png");
  Image desk = Toolkit.getDefaultToolkit().getImage("/desk.png");

  // 定义小球横坐标
  double x = 100;
  // 小球纵坐标
  double y = 100;

  /*
   * 定义弧度
   * 此处是 60 度
   */
  double degree = 3.14 / 3;

  // 画窗口的方法
  public void paint(Graphics g) {

    // 输出告诉画了一次
    System.out.println("windows");
    g.drawImage(desk , 0 , 0 , null);
    g.drawImage(ball , (int)100 , (int)100 , null);

    x += 10 * Math.cos(degree);
    y += 10 * Math.sin(degree);

    /*
     * 500 是出ng口高度
     * 40 是桌子边框
     * 30 是球的直径
     * 最后一个40 是标题栏的高度
     */
    if ((y > 500 - 40 - 30) || (y < 40 + 40)) {
      degree = -degree;
    }

    // 碰到左右边界
    if ((x < 40) || (x > 856 - 40 - 30)) {
      degree = 3.14 - degree;
    }
  }

  // 窗口加载
  void launchFrame() {

    setSize(300 , 300);
    setLocation(50 , 50);
    setVisible(true);

    // 重画窗口
    while (true) {
      repaint();

      try {
        /*
         * 40 ms
         * 1 秒 = 1000 毫秒
         * 大约一秒画 20 次窗口
         */
        Thread.sleep(40);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

  }

  // main 方法是程序执行的入口
  public static void main(String[] args) {

    // 输出自我介绍
    System.out.println("I'm GOD");
    Main game = new Main();

  }
}
