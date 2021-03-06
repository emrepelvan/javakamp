package concrete;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(this.gamerCheckService.checkIfRealPerson(gamer))
		
			System.out.println(gamer.getFirstName() + " " +gamer.getLastName() + " kullanıcısı başarı ile eklendi.");
		else {
			System.out.println("Kullanıcı bilgileri hatalı tekrar deneyiniz.");
		}
	}

	@Override
	public void delete(Gamer gamer) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli kullanıcının bilgileri silindi.");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli kullanıcının bilgileri güncellendi.");
	}

}
