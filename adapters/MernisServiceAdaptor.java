package adapters;

import java.rmi.RemoteException;


import Abstract.UserCheckService;
import entities.User;
import models.Result;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements UserCheckService{

	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	boolean result = true;
	
	@Override
	public Result CheckIfRealPerson(User user) {
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), Integer.parseInt(user.getBirthYear()));
		}
		catch(RemoteException e){
			e.printStackTrace();
		}
		
		if(result) {
			return new Result(true);
		} else {
			return new Result(false, "Verification failed");
		}
	}

}
