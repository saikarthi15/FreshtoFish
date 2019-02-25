package springmvc;

import java.util.List;

public interface UserService {

	public User addUser(User user);

	public User removeUser(User user);

	public User updateUser(User user);

	public boolean validateUser(User user);
	
	public List<User> getUserList();
}
