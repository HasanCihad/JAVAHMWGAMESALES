import java.util.Date;

import adapters.MernisServiceAdaptor;
import concrete.CampaignManager;
import concrete.SaleManager;
import concrete.UserManager;
import entities.Campaign;
import entities.Game;
import entities.Sale;
import entities.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setUserId(1);
		user.setFirstName("Kemal");
		user.setLastName("Serdar");
		user.setEmail("kemalserd@gmail.com");
		user.setBirthYear("1990");
		user.setNationalityId("32178569217");
		user.setPassword("82582");
		
		
		Game game = new Game(1,"CS:GO","Prime Statüs",320);
		
		Campaign campaign = new Campaign(1,1,"Ýndirim","%10",new Date());
		
		Sale sale = new Sale(1,1,1,1);
		
		UserManager userManager = new UserManager(new MernisServiceAdaptor());
		
		userManager.update(user);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(user, game);
		
	}

}
