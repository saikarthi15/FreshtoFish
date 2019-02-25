package springmvc;

import java.util.List;

public interface UserDao {

	public User addUser(User user);

	public User removeUser(User user);
	
	public User UpdateUser(User user);
	
	public boolean validateUser(User user);
	public List<User> getUserList();

}
