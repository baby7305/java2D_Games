package breakout;

import javax.swing.*;

/**
 * Created by Administrator on 2018/1/22.
 */
public class Brick extends Sprite {

	private boolean destroyed;

	public Brick(int x, int y) {

		this.x = x;
		this.y = y;

		ImageIcon ii = new ImageIcon("breakout/brickie.png");
		image = ii.getImage();

		i_width = image.getWidth(null);
		i_heigth = image.getHeight(null);

		destroyed = false;
	}

	public boolean isDestroyed() {

		return destroyed;
	}

	public void setDestroyed(boolean val) {

		destroyed = val;
	}
}
