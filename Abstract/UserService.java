package Abstract;

import entities.User;

public interface UserService {

	void add(User user);
	void delete(User user);
	void update(User user);
}
