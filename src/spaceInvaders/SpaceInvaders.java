package spaceInvaders;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/22.
 */
public class SpaceInvaders extends JFrame implements Commons {

	public SpaceInvaders() {

		initUI();
	}

	private void initUI() {

		add(new Board());
		setTitle("Space Invaders");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(BOARD_WIDTH, BOARD_HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			SpaceInvaders ex = new SpaceInvaders();
			ex.setVisible(true);
		});
	}
}