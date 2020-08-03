package com.fresh.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fresh.bean.Msg;
import com.fresh.bean.Users;
import com.fresh.service.impl.UsersServiceImpl;
import com.fresh.utils.RandomValidateCode;

@Controller
@RequestMapping("/user")
public class UsersController {

	@Autowired
	UsersServiceImpl userServiceImpl;

	@RequestMapping("register")
	public String register() {
		return "register";
	}

	@RequestMapping({ "login" })
	public String login() {
		return "login";
	}

	@RequestMapping({ "/checkCode" })
	public void checkCode(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");

		response.setHeader("pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expire", 0L);

		RandomValidateCode randomValidateCode = new RandomValidateCode();
		try {
			randomValidateCode.getRandcode(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping({ "checkLogin" })
	@ResponseBody
	public Msg checkLogin(HttpServletRequest request, Users user,
			String verification) {
		boolean selectByUnameAndUpwd = userServiceImpl
				.selectByUnameAndUpwd(user);
		if (!selectByUnameAndUpwd) {
			return Msg.fail().add("message", "用户名密码错误");
		}

		HttpSession session = request.getSession();
		String verif = (String) session.getAttribute("randomcode_key");

		if (!verif.equalsIgnoreCase(verification)) {
			return Msg.fail().add("message", "验证码错误");
		}

		return Msg.success();
	}

	@RequestMapping({ "regSubmit" })
	public String regSubmit(Users user) {
		userServiceImpl.insert(user);
		return "redirect:regSuccess?uName=" + user.getuName() + "&phone="
				+ user.getPhone();
	}

	@RequestMapping({ "regSuccess" })
	public String regSuccess(String uName, Long phone, Model model) {
		model.addAttribute("uName", uName);
		model.addAttribute("phone", phone);
		return "register-success";
	}

	@RequestMapping({ "checkReg" })
	@ResponseBody
	public Msg checkReg(String uName) {
		boolean selectByUname = userServiceImpl.selectByUname(uName);
		if (selectByUname) {
			return Msg.fail();
		}
		return Msg.success();
	}

}
