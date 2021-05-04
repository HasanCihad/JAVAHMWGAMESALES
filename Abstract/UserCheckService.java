package Abstract;

import entities.User;
import models.Result;

public interface UserCheckService {

	Result CheckIfRealPerson(User user);

}
