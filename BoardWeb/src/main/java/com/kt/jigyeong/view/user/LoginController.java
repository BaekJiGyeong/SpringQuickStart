package com.kt.jigyeong.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kt.jigyeong.user.UserVO;
import com.kt.jigyeong.user.impl.UserDAO;

@Controller
public class LoginController{

	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String login(@ModelAttribute("user") UserVO vo) {
		
		System.out.println("�α��� ȭ������ �̵�");
		vo.setId("test");
		vo.setPassword("test123");
		return "login.jsp";
	}

	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
		System.out.println("�α��� ����ó��...");
		
		if(vo.getId()==null || vo.getId().equals("")) {
			throw new IllegalArgumentException("���̵�� �ݵ�� �Է��ؾ� �մϴ�.");
		}
		
		UserVO user = userDAO.getUser(vo);
		if(user != null) {
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";
		}
		else {
			return "login.jsp";
		}
	}
}
