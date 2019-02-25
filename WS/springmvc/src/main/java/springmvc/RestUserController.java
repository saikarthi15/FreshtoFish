package springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestUserController {

	public UserServiceImpl userserviceImpl;

	@Autowired
	public RestUserController(UserServiceImpl userserviceImpl) {
		this.userserviceImpl = userserviceImpl;
	}

	@PostMapping("/RestCreateUser")
	public void saveUser(@RequestBody User theUser) {
		userserviceImpl.addUser(theUser);
		System.out.println(theUser.toString());
	}

	@RequestMapping("/RestUpdateUser")
	public void updateUser(@RequestBody() User theUser) {
		userserviceImpl.addUser(theUser);
		System.out.println(theUser.toString());
	}

	@RequestMapping(value="/RestGetUserList", method = RequestMethod.GET, produces = "application/xml")
	@ResponseBody
	public User getAllUser() {
		return userserviceImpl.getUserList().get(0);
	}

}
