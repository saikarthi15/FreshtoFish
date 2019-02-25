package springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	public UserServiceImpl userserviceImpl;

	@Autowired
	public LoginController(UserServiceImpl userserviceImpl) {
		this.userserviceImpl = userserviceImpl;
	}

	@RequestMapping("/LoginPage")
	public String showLoginPage(Model model) {
		User user = new User();
		model.addAttribute("User", user);
		return "loginPage";
	}

	@RequestMapping("/loginUser")
	public String ValidateUser() {
		return "/Home";
	}


}
