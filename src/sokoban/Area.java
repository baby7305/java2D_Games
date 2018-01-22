package sokoban;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/22.
 */
public class Area extends Actor {

	public Area(int x, int y) {
		super(x, y);

//		URL loc = this.getClass().getResource("resource/area.png");
//		ImageIcon iia = new ImageIcon(loc);
		ImageIcon iia = new ImageIcon("resource/area.png");
		Image image = iia.getImage();
		this.setImage(image);
	}
}
