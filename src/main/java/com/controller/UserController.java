package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.UserBean;

@Controller
public class UserController {

	@RequestMapping("/home")
	public String home() {

		System.out.println("home");
		return "redirect:dash"; // host:WEB-INF/views/dashbord.jsp
	}

	@RequestMapping("/dash")
	public String dashbord() {

		System.out.println("dash");
		return "dashbord";
	}

	@RequestMapping("/adduser")
	public String addUser(Model model) {

		UserBean userBean = new UserBean();
		model.addAttribute("userBean", userBean);
		// ity will redirect to addUser.jsp page...
		return "addUsers";
	}

	/*
	 * @RequestMapping("/insertuser") public String
	 * insertUser(@RequestParam("txtUserName") String
	 * uName, @RequestParam("txtUserAge") int uAge) {
	 * 
	 * System.out.println("userName =" + uName); System.out.println("userAge =" +
	 * uAge);
	 * 
	 * return "dashbord"; }
	 */

	@RequestMapping("/insertuser")
	public String insertUser(UserBean userBean) {

		System.out.println("userName =" + userBean.getuName());
		System.out.println("userAge =" + userBean.getuAge());

		return "dashbord";
	}

}
