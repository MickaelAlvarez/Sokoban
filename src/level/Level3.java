package level;

import entity.DefaultCrate;
import entity.IceCrate;
import entity.Player;
import entity.Switch;
import gameframework.game.GameData;

public class Level3 extends SokobanLevel {

	public Level3(GameData data) {
		super(data);
	}

	@Override
	public void createMaze() {
		//No walls in this level.
	}

	@Override
	public void initEntities() {
		addGameEntity(new Switch(data, 3, 3));
		addGameEntity(new Switch(data, 6, 6));
		addGameEntity(new Switch(data, 3, 6));
		addGameEntity(new Switch(data, 6, 3));
		addGameEntity(new DefaultCrate(data, 3, 4));
		addGameEntity(new DefaultCrate(data, 6, 5));
		addGameEntity(new IceCrate(data, 4, 5));
		addGameEntity(new IceCrate(data, 5, 4));
		
		addGameEntity(new Player(data, 1, 1));
	}

}
