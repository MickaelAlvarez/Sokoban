package entity;

import gameframework.drawing.Drawable;
import gameframework.drawing.DrawableImage;
import gameframework.drawing.GameCanvas;
import gameframework.game.GameEntity;
import gameframework.motion.blocking.MoveBlocker;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * 
 * Walls, used to draw borders and obstables within the game.
 * 
 * @author NINTUNZE, DOUBLET, DELVALLET Q, DELVALLET L, ALVAREZ
 *
 */
public class Wall implements Drawable, GameEntity, MoveBlocker {

	protected DrawableImage image;
	protected GameCanvas canvas;
	protected int x;
	protected int y;
	protected int width;
	protected int height;

	public Wall(GameCanvas canvas, int x, int y) {
		this.canvas = canvas;
		image = new DrawableImage("/images/wall.gif", canvas);
		width = image.getWidth();
		height = image.getHeight();
		this.x = x * width;
		this.y = y * height;
	}

	@Override
	public Rectangle getBoundingBox() {
		return new Rectangle(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		canvas.drawImage(g, image.getImage(), x, y);
	}

}
