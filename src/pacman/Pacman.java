package pacman;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/22.
 */
public class Pacman extends JFrame {

	public Pacman() {

		initUI();
	}

	private void initUI() {

		add(new Board());

		setTitle("Pacman");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(380, 420);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			Pacman ex = new Pacman();
			ex.setVisible(true);
		});
	}
}
