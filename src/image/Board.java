package image;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/22.
 */
public class Board extends JPanel {

	private Image bardejov;

	public Board() {

		initBoard();
	}

	private void initBoard() {

		loadImage();

		int w = bardejov.getWidth(this);
		int h =  bardejov.getHeight(this);
		setPreferredSize(new Dimension(w, h));
	}

	private void loadImage() {

		ImageIcon ii = new ImageIcon("resource/floors.jpg");
		bardejov = ii.getImage();
	}

	@Override
	public void paintComponent(Graphics g) {

		g.drawImage(bardejov, 0, 0, null);
	}
}
