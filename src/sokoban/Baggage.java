package sokoban;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/22.
 */
public class Baggage extends Actor {

	public Baggage(int x, int y) {
		super(x, y);
//		URL loc = this.getClass().getResource("resource/baggage.png");
//		ImageIcon iia = new ImageIcon(loc);
		ImageIcon iia = new ImageIcon("resource/baggage.png");
		Image image = iia.getImage();
		this.setImage(image);
	}

	public void move(int x, int y) {
		int nx = this.x() + x;
		int ny = this.y() + y;
		this.setX(nx);
		this.setY(ny);
	}
}
