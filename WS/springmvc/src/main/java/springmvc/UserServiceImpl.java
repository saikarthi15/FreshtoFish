package springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

	public UserDao userDao;

	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	public User addUser(User user) {
		userDao.addUser(user);
		return user;
	}

	public User removeUser(User user) {
		userDao.removeUser(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		userDao.UpdateUser(user);
		return null;
	}

	@Override
	public boolean validateUser(User user) {

		return userDao.validateUser(user);
	}

	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}

}
