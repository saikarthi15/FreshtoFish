package springmvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {

	public HashMap<Integer, User> hashMap = new HashMap<Integer, User>();
	public boolean isValidUser = false;

	public User addUser(User user) {
		user.setUserId(generateUserId(user));
		hashMap.put(user.getUserId(), user);
		hashMap.forEach((k, v) -> System.out.println("k : " + k + "V :" + v));
		return user;
	}

	public User removeUser(User user) {
		if (hashMap.containsKey(user.getUserId()))
			hashMap.remove(user.getUserId());
		return user;
	}

	private int generateUserId(User user) {
		return user.getUserId() + 1;
	}

	@Override
	public User UpdateUser(User user) {
		if (hashMap.containsKey(user.getUserId())) {
			hashMap.put(user.getUserId(), user);
		} else {
			addUser(user);
		}
		return user;
	}

	@Override
	public boolean validateUser(User user) {
		hashMap.forEach((k, v) -> {
			if (v.getUserName().equals(user.getUserName()) && v.getPwd().equals(user.getPwd())) {
				isValidUser = true;
			}
		});
		return isValidUser;
	}

	@Override
	public List<User> getUserList() {
		return new ArrayList<>(hashMap.values());
	}

}
