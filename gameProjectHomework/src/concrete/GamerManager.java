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
		
			System.out.println(gamer.getFirstName() + " " +gamer.getLastName() + " kullanýcýsý baþarý ile eklendi.");
		else {
			System.out.println("Kullanýcý bilgileri hatalý tekrar deneyiniz.");
		}
	}

	@Override
	public void delete(Gamer gamer) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli kullanýcýnýn bilgileri silindi.");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli kullanýcýnýn bilgileri güncellendi.");
	}

}
