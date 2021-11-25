package newboot.controller;

import newboot.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class UserController {
	private UserDetailsServiceImpl userService;

	@Autowired
	public void setUserService(UserDetailsServiceImpl userService) {
		this.userService = userService;
	}

    @GetMapping()
	public String getHome(){
		return "login";
	}

	@GetMapping(value = "/login")
	public String getLoginPage() {
	return "login";
}

	@GetMapping("/user")
	public String pageForUser(){
		return "user"  ;
	}

}