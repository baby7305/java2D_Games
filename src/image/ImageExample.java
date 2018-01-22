package image;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/22.
 */
public class ImageExample extends JFrame {

	public ImageExample() {

		initUI();
	}

	private void initUI() {

		add(new Board());

		pack();

		setTitle("Bardejov");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				ImageExample ex = new ImageExample();
				ex.setVisible(true);
			}
		});
	}
}
