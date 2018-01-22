package thread;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/22.
 */
public class ThreadAnimationExample extends JFrame {

	public ThreadAnimationExample() {

		initUI();
	}

	private void initUI() {

		add(new Board());

		setResizable(false);
		pack();

		setTitle("Star");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				JFrame ex = new ThreadAnimationExample();
				ex.setVisible(true);
			}
		});
	}
}
