package movingSprite;

/**
 * Created by Administrator on 2018/1/22.
 */
public class Alien extends Sprite {

	private final int INITIAL_X = 400;

	public Alien(int x, int y) {
		super(x, y);

		initAlien();
	}

	private void initAlien() {

		loadImage("resource/alien.png");
		getImageDimensions();
	}

	public void move() {

		if (x < 0) {
			x = INITIAL_X;
		}

		x -= 1;
	}
}
