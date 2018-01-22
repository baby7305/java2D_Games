package movingSprite;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/22.
 */
public class ShootingMissilesEx extends JFrame {

	public ShootingMissilesEx() {

		initUI();
	}

	private void initUI() {

		add(new Board());

		setSize(400, 300);
		setResizable(false);

		setTitle("Shooting missiles");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				ShootingMissilesEx ex = new ShootingMissilesEx();
				ex.setVisible(true);
			}
		});
	}
}
