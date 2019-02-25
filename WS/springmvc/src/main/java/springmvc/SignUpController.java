package springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUpController {

	public UserServiceImpl userserviceImpl;

	@Autowired
	public SignUpController(UserServiceImpl userserviceImpl) {
		this.userserviceImpl = userserviceImpl;
	}

	@RequestMapping("/SignUpPage")
	public String GetSignUpPage(Model model) {
		User user = new User();
		model.addAttribute("User", user);
		return "SignUpPage";
	}

	@RequestMapping("/CreateUser")
	public String saveUser(@ModelAttribute("User") User theUser) {
		userserviceImpl.addUser(theUser);
		System.out.println(theUser.toString());
		return "ViewUser";
	}
	
	@RequestMapping("/UpdateUser")
	public String updateUser(@ModelAttribute("User") User theUser) {
		userserviceImpl.addUser(theUser);
		System.out.println(theUser.toString());
		return "ListOfUser";
	}
	
	@RequestMapping("/GetUserList")
	public String getAllUser() {
		return "ListOfUser";
	}
	

}
