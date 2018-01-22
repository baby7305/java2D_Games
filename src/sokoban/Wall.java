package sokoban;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/22.
 */
public class Wall extends Actor {

	private Image image;

	public Wall(int x, int y) {
		super(x, y);

//		URL loc = this.getClass().getResource("resource/wall.png");
//		ImageIcon iia = new ImageIcon(loc);
		ImageIcon iia = new ImageIcon("resource/wall.png");
		image = iia.getImage();
		this.setImage(image);

	}
}
