package abstracts;

import entities.Gamer;

public interface GamerService {
	
	void add(Gamer user);
	void delete(Gamer user);
	void update(Gamer user);
	
}
