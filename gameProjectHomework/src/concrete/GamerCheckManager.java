package concrete;

import abstracts.GamerCheckService;
import entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		if(gamer.getNationalityId().length()==11) {
			return true;
		}
		return false;
	}


}
