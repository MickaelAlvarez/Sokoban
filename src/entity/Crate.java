package entity;

import gameframework.drawing.DrawableImage;
import gameframework.drawing.GameCanvas;
import gameframework.game.GameData;
import gameframework.motion.GameMovableDriverDefaultImpl;
import gameframework.motion.overlapping.Overlappable;
import motion.CrateGameMovableDriver;
import motion.MoveStrategyCrate;

/**
 * Abstract class with common elements for every type of crate for the game.
 * 
 * @author NINTUNZE, DOUBLET, DELVALLET Q, DELVALLET L, ALVAREZ
 * 
 */
public abstract class Crate extends SokobanMovable implements Overlappable {

	protected DrawableImage image;
	protected GameCanvas canvas;

	public Crate(GameData data, int x, int y, String imagePath) {
		super(data, x, y, imagePath);

		MoveStrategyCrate moveStrategy = new MoveStrategyCrate();
		GameMovableDriverDefaultImpl moveDriver = new CrateGameMovableDriver();
		moveDriver.setStrategy(moveStrategy);
		moveDriver.setmoveBlockerChecker(data.getMoveBlockerChecker());
		setDriver(moveDriver);
	}


	@Override
	public abstract void oneStepMoveAddedBehavior();

}
