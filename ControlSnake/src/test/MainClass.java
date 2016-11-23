package test;
import java.awt.*;

import javax.swing.*;

import snake.ControlSnake;

@SuppressWarnings("serial")
public class MainClass extends JFrame {

	ControlSnake control;

	Toolkit kit;

	Dimension dimen;

	public static void main(String[] args) {
		new MainClass("贪吃蛇");
	}

	public MainClass(String s) {
		super(s);
		control = new ControlSnake();
		control.setFocusable(true);
		kit = Toolkit.getDefaultToolkit();
		dimen = kit.getScreenSize();// 获取屏幕尺寸

		add(control);// 添加控制器
		setLayout(new BorderLayout());// 设置布局
		setLocation(dimen.width / 3, dimen.height / 3);// 窗口显示位置
		setSize(FWIDTH, FHEIGHT);// 窗口大小
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

	public static final int FWIDTH = 325;

	public static final int FHEIGHT = 400;
}
