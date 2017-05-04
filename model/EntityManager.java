package model;

import java.util.ArrayList;

public class EntityManager {
	ArrayList<Entity> entitys= new ArrayList<Entity>();

	public void addEntity(Entity e) {
		entitys.add(e);
	}

	public Entity getEntityFromPosition(Position p) {
		for (int i = 0; i < entitys.size(); i++) {
			if (entitys.get(i).position.equals(p)) {
				return entitys.get(i);

			}
		}
		return null;
	}
	public void removeEntity(Entity e) {
		entitys.remove(e);
		
	}
//	public void saveGame(){
//		entitys.add(new Player(position, maxBomb))
//	}

}
