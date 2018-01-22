package donut;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/22.
 */
public class DonutExample extends JFrame {

	public DonutExample() {

		initUI();
	}

	private void initUI() {

		add(new Board());

		setSize(330, 330);

		setTitle("Donut");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				DonutExample ex = new DonutExample();
				ex.setVisible(true);
			}
		});
	}
}
