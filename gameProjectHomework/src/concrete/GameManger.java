package concrete;

import abstracts.GameService;
import entities.Game;

public class GameManger implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " isimli oyun eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " isimli oyun silindi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " isimli oyun güncellendi.");
		
	}

}
